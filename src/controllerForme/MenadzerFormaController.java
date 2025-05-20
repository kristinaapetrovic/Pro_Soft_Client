/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllerForme;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import language.LanguageManager;
import model.Menadzer;
import modeliTabela.MenadzerModelTabele;
import view.MenadzerForma;

/**
 *
 * @author Korisnik
 */
public class MenadzerFormaController {

    private final MenadzerForma mf;

    public MenadzerFormaController(MenadzerForma mf) {
        this.mf = mf;
    }

    public void otvoriFormu() {
        popuniTabelu();
        mf.setVisible(true);

    }

    private void popuniTabelu() {
        List<Menadzer> lista = null;
        try {
            lista = komunikacijaKlijent.Komunikacija.getInstance().vratiListuSviMenadzer();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(mf, LanguageManager.getString("server_down"), LanguageManager.getString("error"), JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        MenadzerModelTabele mmt = new MenadzerModelTabele(lista);
        mf.getjTableMenadzeri().setModel(mmt);
        addActionListener();
    }

    private void addActionListener() {
        mf.pretraziActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pretrazi();
            }

            private void pretrazi() {
                String imePrezime = mf.getjTextFieldIP().getText();
                if (validacija(imePrezime)) {
                    JOptionPane.showMessageDialog(mf, LanguageManager.getString("check_data"), LanguageManager.getString("error"), JOptionPane.ERROR_MESSAGE);
                    mf.getjTextFieldIP().setBorder(new LineBorder(Color.RED, 3));
                    return;
                }
                Menadzer menadzer = new Menadzer();
                menadzer.setImePrezime(imePrezime);
                postaviListu(menadzer);
            }

            private boolean validacija(String imePrezime) {
                return imePrezime.isEmpty() || !imePrezime.matches("^[A-Z][a-zA-Z ]*$");
            }

            private void postaviListu(Menadzer menadzer) {
                List<Menadzer> lista = null;
                try {
                    lista = komunikacijaKlijent.Komunikacija.getInstance().vratiListuMenadzer(menadzer);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(mf, LanguageManager.getString("server_down"), LanguageManager.getString("error"), JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                }
                if (lista.isEmpty()) {
                    JOptionPane.showMessageDialog(mf, LanguageManager.getString("sys_err_men_find"), LanguageManager.getString("error"), JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(mf, LanguageManager.getString("sys_men_find"), LanguageManager.getString("success"), JOptionPane.INFORMATION_MESSAGE);
                }
                MenadzerModelTabele mmt = new MenadzerModelTabele(lista);
                mf.getjTableMenadzeri().setModel(mmt);
            }
        });

        mf.ocistiFilterActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mf.getjTextFieldIP().setText("");
                popuniTabelu();
            }
        });

    }

}
