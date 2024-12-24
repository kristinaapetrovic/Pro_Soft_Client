/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllerForme;

import view.SponzorKreirajDetaljiForma;

/**
 *
 * @author Korisnik
 */
public class SponzorKreirajFormaController {
    private final SponzorKreirajDetaljiForma skf;

    public SponzorKreirajFormaController(SponzorKreirajDetaljiForma skf) {
        this.skf = skf;
    }
    
    public void otvoriFormu(){
        skf.setVisible(true);
    }
}
