/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllerForme;

import condinator.Cordinator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Menadzer;
import view.PrijavaForma;

/**
 *
 * @author Korisnik
 */
public class PrijavaController {

    private final PrijavaForma pf;

    public PrijavaController(PrijavaForma pf) {
        this.pf = pf;
        addActionListener();
    }

    private void addActionListener() {

        pf.loginActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = pf.getjTextFieldEmail().getText();
                String sifra = new String(pf.getjPasswordFieldLozinka().getPassword());
                Menadzer menadzer=new Menadzer();
                menadzer.setEmail(email);
                try {
                    menadzer.setLozinka(hashing.Hash.kriptuj(sifra));
                } catch (NoSuchAlgorithmException ex) {
                    Logger.getLogger(PrijavaController.class.getName()).log(Level.SEVERE, null, ex);
                }
                prijava(menadzer);
                
            }
            
            private void prijava(Menadzer menadzer){
                komunikacijaKlijent.Komunikacija.getInstance().konkecija();
                Menadzer ulogovani=komunikacijaKlijent.Komunikacija.getInstance().prijava(menadzer);
                
                if(ulogovani==null){
                    JOptionPane.showMessageDialog(pf, "Pogresan email ili lozinka", "Greska", JOptionPane.ERROR_MESSAGE);
                }else{
                    Cordinator.getInstance().setUlogovani(ulogovani);
                    Cordinator.getInstance().otvoriGlavnuFormu();
                    pf.dispose();
                }
            }

        });
        
       

    }
    
    

    public void otvoriFormu() {
        pf.setVisible(true);
    }

}