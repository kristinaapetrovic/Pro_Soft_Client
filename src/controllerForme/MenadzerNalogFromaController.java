/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllerForme;

import java.util.List;
import model.MSS;
import model.StrucnaSprema;
import modeliTabela.MSSModelTabele;
import view.MenadzerNalogForma;

/**
 *
 * @author Korisnik
 */
public class MenadzerNalogFromaController {

    private final MenadzerNalogForma mnf;

    public MenadzerNalogFromaController(MenadzerNalogForma mnf) {
        this.mnf = mnf;
    }

    public void otvoriFormu() {
        popuniComboBox();
        popuniTabelu();
        mnf.setVisible(true);
    }

    private void popuniComboBox() {
        List<StrucnaSprema> lista = komunikacijaKlijent.Komunikacija.getInstance().ucitajStrucneSpreme();
        for (StrucnaSprema ss : lista) {
            mnf.getjComboBoxSS().addItem(ss);
        }
    }

    private void popuniTabelu() {
        List<MSS> lista=komunikacijaKlijent.Komunikacija.getInstance().vratiListuMSS(mnf.getMen());
        MSSModelTabele mssmt=new MSSModelTabele(lista);
        mnf.getjTableSS().setModel(mssmt);
    }

}
