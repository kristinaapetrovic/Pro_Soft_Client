/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllerForme;

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
    
    public void otvoriFormu(){
        rf.setVisible(true);
    }
    
    
}
