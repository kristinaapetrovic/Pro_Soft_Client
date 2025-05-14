/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllerForme;

import condinator.Cordinator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import language.LanguageManager;
import model.VrstaAktivnosti;
import modeliTabela.VrstaAktivnostiModelTabele;
import view.VrstaAktivnostiForma;

/**
 *
 * @author Korisnik
 */
public class VrstaAktivnostiFormaController {

    private final VrstaAktivnostiForma vaf;

    public VrstaAktivnostiFormaController(VrstaAktivnostiForma vakf) {
        this.vaf = vakf;
    }

    public void otvoriFormu() {
        popuniTabelu();
        vaf.setVisible(true);
        addActionListener();
    }

    private void popuniTabelu() {
        List<VrstaAktivnosti> lista = komunikacijaKlijent.Komunikacija.getInstance().ucitajVrstaAktivnosti();
        VrstaAktivnostiModelTabele vamt = new VrstaAktivnostiModelTabele(lista);
        vaf.getjTableVA().setModel(vamt);
    }

    private void addActionListener() {
        vaf.filterActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String naziv = vaf.getjTextFieldNaziv().getText().trim();

                if (naziv.isEmpty()) {
                    JOptionPane.showMessageDialog(vaf, LanguageManager.getString("crriteria_input_error"), LanguageManager.getString("error"), JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if ((!naziv.isEmpty() && !naziv.matches("^[a-zA-Z ]+$"))) {
                    JOptionPane.showMessageDialog(vaf, LanguageManager.getString("check_data"), LanguageManager.getString("error"), JOptionPane.ERROR_MESSAGE);
                    return;
                }
                VrstaAktivnosti vakt = new VrstaAktivnosti(0, naziv, false);
                postaviListu(vakt);
            }

            private void postaviListu(VrstaAktivnosti vakt) {
                List<VrstaAktivnosti> lista = komunikacijaKlijent.Komunikacija.getInstance().vratiListuVrstaAktivnosti(vakt);
                if (lista.isEmpty()) {
                    JOptionPane.showMessageDialog(vaf, LanguageManager.getString("sys_err_at_find"), LanguageManager.getString("error"), JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(vaf, LanguageManager.getString("sys_at_find"), LanguageManager.getString("success"), JOptionPane.INFORMATION_MESSAGE);

                }
                VrstaAktivnostiModelTabele vamt = new VrstaAktivnostiModelTabele(lista);
                vaf.getjTableVA().setModel(vamt);
            }
        });

        vaf.ocistiActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vaf.getjTextFieldNaziv().setText("");
                popuniTabelu();
            }
        });

        vaf.detaljiActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selektovano = vaf.getjTableVA().getSelectedRow();

                if (selektovano == -1) {

                    JOptionPane.showMessageDialog(vaf, LanguageManager.getString("act_type_not_chosen"), LanguageManager.getString("error"), JOptionPane.ERROR_MESSAGE);
                    return;
                }

                VrstaAktivnostiModelTabele vamt = (VrstaAktivnostiModelTabele) vaf.getjTableVA().getModel();
                VrstaAktivnosti va=vamt  .getLista().get(selektovano);
                JOptionPane.showMessageDialog(vaf, LanguageManager.getString("sys_at_open"), LanguageManager.getString("success"), JOptionPane.INFORMATION_MESSAGE);
                Cordinator.getInstance().otvotiVAKreirajFormu(vaf, va);
            }
        });
    }

    public void azurirajTabelu() {
        popuniTabelu();
    }
}
