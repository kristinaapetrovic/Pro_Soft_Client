/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllerForme;

import view.ProjektiKreirajForma;

/**
 *
 * @author Korisnik
 */
public class ProjektiKreirajFormaController {
    private final ProjektiKreirajForma pf;

    public ProjektiKreirajFormaController(ProjektiKreirajForma pf) {
        this.pf = pf;
    }
    
    public void otvoriFormu(){
        pf.setVisible(true);
    }
    
}
