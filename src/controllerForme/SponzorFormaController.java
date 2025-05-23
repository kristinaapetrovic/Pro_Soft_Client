/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllerForme;

import condinator.Cordinator;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import language.LanguageManager;
import model.Mesto;
import model.Sponzor;
import modeliTabela.SponzorModelTabele;
import view.SponzorForma;

/**
 *
 * @author Korisnik
 */
public class SponzorFormaController {

    private final SponzorForma sf;

    public SponzorFormaController(SponzorForma sf) {
        this.sf = sf;
    }

    public void otvoriFormu() {
        popuniTabelu();
        popuniComboBox();
        sf.setVisible(true);
        addActionListener();
    }

    private void popuniTabelu() {
        List<Sponzor> lista = null;
        try {
            lista = komunikacijaKlijent.Komunikacija.getInstance().vratiListuSviSponzor();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(sf, LanguageManager.getString("server_down"), LanguageManager.getString("error"), JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        SponzorModelTabele smt = new SponzorModelTabele(lista);
        sf.getjTableSponzori().setModel(smt);
    }

    private void popuniComboBox() {
        List<Mesto> lista = null;
        try {
            lista = komunikacijaKlijent.Komunikacija.getInstance().vratiListuSviMesto();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(sf, LanguageManager.getString("server_down"), LanguageManager.getString("error"), JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        for (Mesto mesto : lista) {
            sf.getjComboBoxMesta().addItem(mesto);
        }
        sf.getjComboBoxMesta().setSelectedItem(null);
    }

    private void addActionListener() {
        sf.pretraziActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String naziv = sf.getjTextFieldNaziv().getText();
                Mesto mesto = (Mesto) sf.getjComboBoxMesta().getSelectedItem();
                if (naziv.isEmpty() && mesto == null) {
                    JOptionPane.showMessageDialog(sf, LanguageManager.getString("crriteria_input_error"), LanguageManager.getString("error"), JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (!validacija(naziv, mesto)) {
                    return;
                }
                Sponzor kriterijumSponzor = new Sponzor();
                kriterijumSponzor.setNazivFirme(naziv);
                kriterijumSponzor.setMesto(mesto);
                postaviListu(kriterijumSponzor);
            }

            private boolean validacija(String naziv, Mesto mesto) {
                if (!naziv.isEmpty() && !naziv.matches("^[a-zA-Z ]+$")) {
                    JOptionPane.showMessageDialog(sf, LanguageManager.getString("check_data"), LanguageManager.getString("error"), JOptionPane.ERROR_MESSAGE);
                    sf.getjTextFieldNaziv().setBorder(new LineBorder(Color.RED, 3));
                    return false;
                }
                return true;
            }

            private void postaviListu(Sponzor sponzor) {
                List<Sponzor> lista = null;
                try {
                    lista = komunikacijaKlijent.Komunikacija.getInstance().vratiListuSponzor(sponzor);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(sf, LanguageManager.getString("server_down"), LanguageManager.getString("error"), JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                }
                if (lista.isEmpty()) {
                    JOptionPane.showMessageDialog(sf, LanguageManager.getString("sys_err_sp_find"), LanguageManager.getString("error"), JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(sf, LanguageManager.getString("sys_sp_find"), LanguageManager.getString("success"), JOptionPane.INFORMATION_MESSAGE);
                }
                SponzorModelTabele smt = new SponzorModelTabele(lista);
                sf.getjTableSponzori().setModel(smt);
            }
        });

        sf.ocistiActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sf.getjTextFieldNaziv().setText("");
                sf.getjComboBoxMesta().setSelectedItem(null);
                popuniTabelu();
            }
        });

        sf.detaljiActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selektovano = sf.getjTableSponzori().getSelectedRow();
                if (selektovano == -1) {
                    JOptionPane.showMessageDialog(sf, LanguageManager.getString("spons_not_chosen"), LanguageManager.getString("error"), JOptionPane.ERROR_MESSAGE);
                    return;
                }
                SponzorModelTabele smt = (SponzorModelTabele) sf.getjTableSponzori().getModel();
                Sponzor sponzor = smt.getLista().get(selektovano);
                JOptionPane.showMessageDialog(sf, LanguageManager.getString("sys_sp_open"), LanguageManager.getString("success"), JOptionPane.INFORMATION_MESSAGE);
                Cordinator.getInstance().otvoriSponzorKreirajFormu(sf, sponzor);
            }
        });
        sf.projektiActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selektovan = sf.getjTableSponzori().getSelectedRow();

                if (selektovan == -1) {
                    JOptionPane.showMessageDialog(sf, LanguageManager.getString("spons_not_chosen"), LanguageManager.getString("error"), JOptionPane.ERROR_MESSAGE);
                    return;
                }
                SponzorModelTabele smt = (SponzorModelTabele) sf.getjTableSponzori().getModel();
                Sponzor sponzor = smt.getLista().get(selektovan);

                Cordinator.getInstance().otvoriProjektiFormu(sponzor);

            }
        });
    }

    public void azurirajTabelu() {
        popuniTabelu();
    }
}
