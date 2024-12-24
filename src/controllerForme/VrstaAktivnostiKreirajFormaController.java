/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllerForme;

import view.VrstaAktivnostiKreirajForma;

/**
 *
 * @author Korisnik
 */
public class VrstaAktivnostiKreirajFormaController {
    private final VrstaAktivnostiKreirajForma vakf;

    public VrstaAktivnostiKreirajFormaController(VrstaAktivnostiKreirajForma vakf) {
        this.vakf = vakf;
    }
    
    public void otvoriFormu(){
        vakf.setVisible(true);
    }
}
