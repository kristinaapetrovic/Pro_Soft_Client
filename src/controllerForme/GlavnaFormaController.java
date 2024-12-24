/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllerForme;

import condinator.Cordinator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.GlavnaForma;

/**
 *
 * @author Korisnik
 */
public class GlavnaFormaController {

    private final GlavnaForma gf;

    public GlavnaFormaController(GlavnaForma gf) {
        this.gf = gf;
        addActionListeners();
    }

    public void otvoriGlavnuFormu() {
        gf.getjLabelIPM().setText(Cordinator.getInstance().getUlogovani().toString());
        gf.setVisible(true);
    }

    private void addActionListeners() {
        
        
        
        
    }

}
