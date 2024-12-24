/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllerForme;

import view.MestoKreirajForma;

/**
 *
 * @author Korisnik
 */
public class MestoKreirajFormaController {
    private final MestoKreirajForma mkf;

    public MestoKreirajFormaController(MestoKreirajForma mkf) {
        this.mkf = mkf;
    }
    
    public void otvoriFormu(){
        mkf.setVisible(true);
    }
}
