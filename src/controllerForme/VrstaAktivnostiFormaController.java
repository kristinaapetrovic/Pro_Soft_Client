/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllerForme;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
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
                    JOptionPane.showMessageDialog(vaf, "Unesite kriterijum pretrage", "Greska", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if ((!naziv.isEmpty() && !naziv.matches("^[a-zA-Z ]+$"))) {
                    JOptionPane.showMessageDialog(vaf, "Proverite unete podatke", "Greska", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                VrstaAktivnosti vakt = new VrstaAktivnosti(0, naziv, false);
                postaviListu(vakt);
            }

            private void postaviListu(VrstaAktivnosti vakt) {
                List<VrstaAktivnosti> lista = komunikacijaKlijent.Komunikacija.getInstance().vratiListuVrstaAktivnosti(vakt);
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
    }
}
