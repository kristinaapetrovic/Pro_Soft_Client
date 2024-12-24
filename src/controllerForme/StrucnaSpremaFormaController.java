/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllerForme;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import model.StrucnaSprema;
import modeliTabela.StrucnaSpremaModelTabele;
import view.StrucnaSpremaForma;

/**
 *
 * @author Korisnik
 */
public class StrucnaSpremaFormaController {

    private final StrucnaSpremaForma ssf;

    public StrucnaSpremaFormaController(StrucnaSpremaForma ssf) {
        this.ssf = ssf;
    }

    public void otvoriFormu() {
        popuniTabelu();
        ssf.setVisible(true);
        addActionListener();
    }

    private void popuniTabelu() {
        List<StrucnaSprema> lista = komunikacijaKlijent.Komunikacija.getInstance().ucitajStrucneSpreme();
        StrucnaSpremaModelTabele ssmt = new StrucnaSpremaModelTabele(lista);
        ssf.getjTableSS().setModel(ssmt);
    }

    private void addActionListener() {
        ssf.pretraziActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String naziv = ssf.getjTextFieldNaziv().getText();

                if (naziv.isEmpty()) {
                    JOptionPane.showMessageDialog(ssf, "Unesite kriterijum pretrage", "Greska", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if ((!naziv.isEmpty() && !naziv.matches("^[a-zA-Z ]+$"))) {
                    JOptionPane.showMessageDialog(ssf, "Proverite unete podatke", "Greska", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                StrucnaSprema strucnaSprema = new StrucnaSprema(0, naziv, false);
                postaviListu(strucnaSprema);
            }

            private void postaviListu(StrucnaSprema strucnaSprema) {
                List<StrucnaSprema> lista = komunikacijaKlijent.Komunikacija.getInstance().vratiListuStrucnaSprema(strucnaSprema);
                StrucnaSpremaModelTabele ssmt = new StrucnaSpremaModelTabele(lista);
                ssf.getjTableSS().setModel(ssmt);
            }
        });
        ssf.ocistiActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ssf.getjTextFieldNaziv().setText("");
                popuniTabelu();
            }
        });
    }
}