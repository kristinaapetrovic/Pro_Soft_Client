/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllerForme;

import view.StrucnaSpremaKreirajForma;

/**
 *
 * @author Korisnik
 */
public class StrucnaSpremaKreirajFormaController {
    private final StrucnaSpremaKreirajForma sskf;

    public StrucnaSpremaKreirajFormaController(StrucnaSpremaKreirajForma sskf) {
        this.sskf = sskf;
    }
    public void otvoriFormu(){
        sskf.setVisible(true);
    }
}
