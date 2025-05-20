/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllerForme;

import condinator.Cordinator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import language.LanguageManager;
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
        List<StrucnaSprema> lista = null;
        try {
            lista = komunikacijaKlijent.Komunikacija.getInstance().ucitajStrucneSpreme();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(ssf, LanguageManager.getString("server_down"), LanguageManager.getString("error"), JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        StrucnaSpremaModelTabele ssmt = new StrucnaSpremaModelTabele(lista);
        ssf.getjTableSS().setModel(ssmt);
    }

    private void addActionListener() {
        ssf.pretraziActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String naziv = ssf.getjTextFieldNaziv().getText();

                if (naziv.isEmpty()) {
                    JOptionPane.showMessageDialog(ssf, LanguageManager.getString("crriteria_input_error"), LanguageManager.getString("error"), JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if ((!naziv.isEmpty() && !naziv.matches("^[a-zA-Z ]+$"))) {
                    JOptionPane.showMessageDialog(ssf, LanguageManager.getString("check_data"), LanguageManager.getString("error"), JOptionPane.ERROR_MESSAGE);
                    return;
                }

                StrucnaSprema strucnaSprema = new StrucnaSprema(0, naziv, false);
                postaviListu(strucnaSprema);
            }

            private void postaviListu(StrucnaSprema strucnaSprema) {
                List<StrucnaSprema> lista=null;
                try {
                    lista = komunikacijaKlijent.Komunikacija.getInstance().vratiListuStrucnaSprema(strucnaSprema);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(ssf, LanguageManager.getString("server_down"), LanguageManager.getString("error"), JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                }
                StrucnaSpremaModelTabele ssmt = new StrucnaSpremaModelTabele(lista);
                if (lista.isEmpty()) {
                    JOptionPane.showMessageDialog(ssf, LanguageManager.getString("sys_err_pq_find"), LanguageManager.getString("error"), JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(ssf, LanguageManager.getString("sys_pq_find"), LanguageManager.getString("success"), JOptionPane.INFORMATION_MESSAGE);

                }
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

        ssf.detaljiActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selektovano = ssf.getjTableSS().getSelectedRow();

                if (selektovano == -1) {
                    JOptionPane.showMessageDialog(ssf, LanguageManager.getString("education_not_chosen"), LanguageManager.getString("error"), JOptionPane.ERROR_MESSAGE);
                    return;
                }

                StrucnaSpremaModelTabele ssmt = (StrucnaSpremaModelTabele) ssf.getjTableSS().getModel();
                StrucnaSprema ss = ssmt.getLista().get(selektovano);
                JOptionPane.showMessageDialog(ssf, LanguageManager.getString("sys_pq_open"), LanguageManager.getString("success"), JOptionPane.INFORMATION_MESSAGE);
                Cordinator.getInstance().otvoriStrucnaSpremaDetaljiFormu(ssf, ss);
            }
        });
    }

    public void azurirajTabelu() {
        popuniTabelu();
    }
}
