/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllerForme;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import model.Menadzer;
import model.Projekat;
import model.Sponzor;
import model.VrstaAktivnosti;
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
        popuniTabelu();
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
        List<VrstaAktivnosti> listaVA = komunikacijaKlijent.Komunikacija.getInstance().ucitajVrstaAktivnosti();

        for (Menadzer men : listaMenadzera) {
            pf.getjComboBoxMenadzer().addItem(men);
        }
        for (Sponzor sp : listaSponzora) {
            pf.getjComboBoxSponzor().addItem(sp);
        }
        for (VrstaAktivnosti va:listaVA  ) {
            pf.getjComboBoxVAktivnosti().addItem(va);
        }

    }

    private void addActionListener() {
        pf.pretraziActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String regBroj = pf.getjTextFieldRegBroj().getText();
                Menadzer menadzer = (Menadzer) pf.getjComboBoxMenadzer().getSelectedItem();
                Sponzor sponzor = (Sponzor) pf.getjComboBoxSponzor().getSelectedItem();
                VrstaAktivnosti vakt = (VrstaAktivnosti) pf.getjComboBoxVAktivnosti().getSelectedItem();
                if (!validacija(regBroj)) {
                    return;
                }
                filtriraj(regBroj, menadzer, sponzor, vakt);

            }

            private boolean validacija(String regBroj) {
                if (!regBroj.isEmpty() && !regBroj.matches("\\d{4}/20\\d{2}")) {
                    JOptionPane.showMessageDialog(pf, "Proverite unesene podatke", "Greska", JOptionPane.ERROR_MESSAGE);
                    pf.getjTextFieldRegBroj().setBorder(new LineBorder(Color.RED, 3));
                    return false;
                }
                return true;
            }

            private void filtriraj(String regBroj, Menadzer menadzer, Sponzor sponzor, VrstaAktivnosti vakt) {
                Projekat ugovor = new Projekat();
                ProjekatModelTabele pmt = null;

                boolean kriterijumUgovor = false;
                boolean kriterijumIzvodjac = false;
                boolean kriterijumMenadzer = false;
                boolean kriterijumVakt = false;

                if (!regBroj.isEmpty()) {
                    ugovor.setRegBroj(regBroj);
//                    kriterijumUgovor = Controller.getInstance().vratiListuProjektniUgovor(ugovor, listaUgovora);

                }
                if (sponzor != null) {
                    //       kriterijumIzvodjac = Controller.getInstance().vratiListuProjektniUgovor(izvodjac, listaUgovora);
                }
                if (menadzer != null) {
                    //       kriterijumMenadzer = Controller.getInstance().vratiListuProjektniUgovor(menadzer, listaUgovora);
                }
                if (vakt != null) {
                    //      kriterijumVakt = Controller.getInstance().vratiListuProjektniUgovor(vakt, listaUgovora);
                }

                if (kriterijumMenadzer || kriterijumIzvodjac || kriterijumVakt || kriterijumUgovor) {

//                    pmt = new ProjekatModelTabele(listaUgovora);
//
//                    jTableProjekti.setModel(pmt);
                } else {
                    JOptionPane.showMessageDialog(pf, "Sistem ne moze da pronadje ugovor o radu");

                }
            }
        });
    }
}
