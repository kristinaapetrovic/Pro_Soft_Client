/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllerForme;

import condinator.Cordinator;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import language.LanguageManager;
import model.Menadzer;
import model.Projekat;
import model.Sponzor;
import modeliTabela.ProjekatModelTabele;
import view.ProjektiForma;

/**
 *
 * @author Korisnik
 */
public class ProjektiFormaController {

    private final ProjektiForma pf;

    public ProjektiFormaController(ProjektiForma pf) {
        this.pf = pf;
    }

    public void otvoriFormu() {
        if (pf.getMen() == null && pf.getSponzor() == null) {
            popuniTabelu();
        }
        popuniComboBox();
        pf.setVisible(true);
        addActionListener();
    }

    private void popuniTabelu() {
        List<Projekat> lista = komunikacijaKlijent.Komunikacija.getInstance().vratiListuSviProjekat();
        ProjekatModelTabele pmt = new ProjekatModelTabele(lista);
        pf.getjTableProjekti().setModel(pmt);
    }

    private void popuniComboBox() {
        List<Menadzer> listaMenadzera = komunikacijaKlijent.Komunikacija.getInstance().vratiListuSviMenadzer();
        List<Sponzor> listaSponzora = komunikacijaKlijent.Komunikacija.getInstance().vratiListuSviSponzor();

        for (Menadzer men : listaMenadzera) {
            pf.getjComboBoxMenadzer().addItem(men);
        }
        for (Sponzor sp : listaSponzora) {
            pf.getjComboBoxSponzor().addItem(sp);
        }

        pf.getjComboBoxSponzor().setSelectedItem(null);
        pf.getjComboBoxMenadzer().setSelectedItem(null);

    }

    private void addActionListener() {
        pf.pretraziActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String regBroj = pf.getjTextFieldRegBroj().getText();
                Menadzer menadzer = (Menadzer) pf.getjComboBoxMenadzer().getSelectedItem();
                Sponzor sponzor = (Sponzor) pf.getjComboBoxSponzor().getSelectedItem();

                if (regBroj.isEmpty() && menadzer == null && sponzor == null) {
                    JOptionPane.showMessageDialog(pf, LanguageManager.getString("crriteria_input_error"), LanguageManager.getString("error"), JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (!validacija(regBroj)) {
                    return;
                }

                filtriraj(regBroj, menadzer, sponzor);

            }

            private boolean validacija(String regBroj) {
                if (!regBroj.isEmpty() && !regBroj.matches("\\d{4}/20\\d{2}")) {
                    JOptionPane.showMessageDialog(pf, LanguageManager.getString("check_data"), LanguageManager.getString("error"), JOptionPane.ERROR_MESSAGE);
                    pf.getjTextFieldRegBroj().setBorder(new LineBorder(Color.RED, 3));
                    return false;
                }
                return true;
            }

            private void filtriraj(String regBroj, Menadzer menadzer, Sponzor sponzor) {
                Projekat projekat = new Projekat();
                ProjekatModelTabele pmt = null;
                List<Projekat> listaUgovora = new ArrayList<>();

                projekat.setRegBroj("");

                boolean kriterijumUgovor = false;
                boolean kriterijumIzvodjac = false;
                boolean kriterijumMenadzer = false;

                if (!regBroj.isEmpty()) {
                    projekat.setRegBroj(regBroj);
                    kriterijumUgovor = komunikacijaKlijent.Komunikacija.getInstance().vratiListuProjektniUgovor(projekat, listaUgovora);

                }
                if (sponzor != null) {
                    kriterijumIzvodjac = komunikacijaKlijent.Komunikacija.getInstance().vratiListuProjektniUgovor(sponzor, listaUgovora);
                }
                if (menadzer != null) {
                    kriterijumMenadzer = komunikacijaKlijent.Komunikacija.getInstance().vratiListuProjektniUgovor(menadzer, listaUgovora);
                }

                if (kriterijumMenadzer || kriterijumIzvodjac || kriterijumUgovor) {

                    if (listaUgovora.isEmpty()) {
                        JOptionPane.showMessageDialog(pf, LanguageManager.getString("sys_err_proj_find"), LanguageManager.getString("error"), JOptionPane.ERROR_MESSAGE);
                    } else {
                    JOptionPane.showMessageDialog(pf, LanguageManager.getString("sys_proj_find"), LanguageManager.getString("success"), JOptionPane.INFORMATION_MESSAGE);

                    }

                    pmt = new ProjekatModelTabele(listaUgovora);

                    pf.getjTableProjekti().setModel(pmt);

                } else {
                    JOptionPane.showMessageDialog(pf, LanguageManager.getString("read_projects_error"), LanguageManager.getString("error"), JOptionPane.ERROR_MESSAGE);

                }

            }
        });

        pf.ocitstiActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pf.getjTextFieldRegBroj().setText("");
                pf.getjComboBoxSponzor().setSelectedItem(null);
                pf.getjComboBoxMenadzer().setSelectedItem(null);

                popuniTabelu();
            }
        });

        pf.detaljiActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sel = pf.getjTableProjekti().getSelectedRow();

                if (sel == -1) {
                    JOptionPane.showMessageDialog(pf, LanguageManager.getString("project_not_chosen"), LanguageManager.getString("warning"), JOptionPane.INFORMATION_MESSAGE);
                    return;
                }

                ProjekatModelTabele pmt = (ProjekatModelTabele) pf.getjTableProjekti().getModel();

                Projekat projekat = pmt.getLista().get(sel);
                JOptionPane.showMessageDialog(pf, LanguageManager.getString("sys_proj_open"), LanguageManager.getString("success"), JOptionPane.INFORMATION_MESSAGE);

                Cordinator.getInstance().otvoriProjektiKreirajFormu(pf, projekat);

            }
        });

    }

    public void azurirajTabelu() {
        popuniTabelu();
    }
}
