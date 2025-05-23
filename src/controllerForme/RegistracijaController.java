/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllerForme;

import condinator.Cordinator;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import language.LanguageManager;
import model.Menadzer;
import view.RegistracijaForma;

/**
 *
 * @author Korisnik
 */
public class RegistracijaController {

    private final RegistracijaForma rf;

    public RegistracijaController(RegistracijaForma rf) {
        this.rf = rf;
    }

    public void otvoriFormu() {
        rf.setVisible(true);
        addActionListener();
    }

    private void addActionListener() {
        rf.regActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String jmbg = rf.getjTextFieldJMBG().getText().trim();
                String imePrezime = rf.getjTextFieldImePrezime().getText().trim();
                String datumRodj = rf.getjTextFieldDatRodj().getText().trim();
                String email = rf.getjTextFieldEmail().getText().trim();
                if (!statickaValidacija(jmbg, imePrezime, email)) {
                    JOptionPane.showMessageDialog(rf, LanguageManager.getString("check_data"), LanguageManager.getString("error"), JOptionPane.ERROR_MESSAGE);
                    return;
                }
                java.util.Date datumRodjenja = null;
                SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
                try {
                    datumRodjenja = format.parse(datumRodj);
                } catch (ParseException ex) {
                    rf.getjTextFieldDatRodj().setBorder(new LineBorder(Color.RED, 3));
                    System.out.println("Greska pri parsiranju datuma");
                    return;
                }

                Menadzer menadzer = new Menadzer(jmbg, imePrezime, email, null, datumRodjenja, true, true, null);
                menadzer = registruj(menadzer);
                if (menadzer != null) {
                    JOptionPane.showMessageDialog(rf, LanguageManager.getString("reg_mail_1") + email + LanguageManager.getString("reg_mail_2"), LanguageManager.getString("success"), JOptionPane.INFORMATION_MESSAGE);
                    rf.dispose();
                    Cordinator.getInstance().otvoriPrijavaFormu();
                } else {
                    JOptionPane.showMessageDialog(rf, LanguageManager.getString("reg_error"), LanguageManager.getString("error"), JOptionPane.ERROR_MESSAGE);
                }
            }

            private boolean statickaValidacija(String jmbg, String imePrezime, String email) {
                boolean jmbgReg = jmbg.matches("\\d{13}");

                boolean imePrezimeReg = imePrezime.matches("^[A-Za-z]+ [A-Za-z]+$");

                boolean emailReg = email.matches("[A-Za-z][A-Za-z0-9_.]+@gmail.com");

                if (jmbgReg && imePrezimeReg && emailReg) {
                    return true;
                }

                if (!jmbgReg) {
                    rf.getjTextFieldJMBG().setBorder(new LineBorder(Color.RED, 3));
                }
                if (!imePrezimeReg) {
                    rf.getjTextFieldImePrezime().setBorder(new LineBorder(Color.RED, 3));
                }
                if (!jmbgReg) {
                    rf.getjTextFieldImePrezime().setBorder(new LineBorder(Color.RED, 3));
                }

                return false;
            }

            private Menadzer registruj(Menadzer menadzer) {
                try {
                    return komunikacijaKlijent.Komunikacija.getInstance().kreirajMenadzer(menadzer);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(rf, LanguageManager.getString("server_down"), LanguageManager.getString("error"), JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                }
                return null;
            }
        });
    }

}
