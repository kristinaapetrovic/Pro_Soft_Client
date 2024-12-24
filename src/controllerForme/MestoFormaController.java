/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllerForme;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import model.Mesto;
import modeliTabela.MestoModelTabele;
import view.MestoForma;

/**
 *
 * @author Korisnik
 */
public class MestoFormaController {

    private final MestoForma mf;

    public MestoFormaController(MestoForma mf) {
        this.mf = mf;
    }

    public void otvoriFormu() {
        popuniTabelu();

        mf.setVisible(true);
        addActionListenr();
    }

    private void popuniTabelu() {
        List<Mesto> lista = komunikacijaKlijent.Komunikacija.getInstance().vratiListuSviMesto();
        MestoModelTabele mmt = new MestoModelTabele(lista);
        mf.getjTableMesta().setModel(mmt);
    }

    private void addActionListenr() {
        mf.pretraziActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String naziv = mf.getjTextFieldNaziv().getText().trim();
                String posBroj = mf.getjTextFieldPostanski().getText().trim();
                if(!provera(naziv, posBroj)){
                    return;
                }
                Mesto mesto=new Mesto(posBroj, naziv, false);
                postaviListu(mesto);
            }

            private boolean provera(String naziv, String posBroj) {
                if (naziv.isEmpty() && posBroj.isEmpty()) {
                    JOptionPane.showMessageDialog(mf, "Unesite barem jedan kriterijum pretrage", "Greska", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
                if ((!naziv.isEmpty() && !naziv.matches("^[a-zA-Z ]+$")) || (!posBroj.isEmpty() && !posBroj.matches("\\d{5}"))) {
                    JOptionPane.showMessageDialog(mf, "Proverite unete podatke", "Greska", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
                return true;

            }

            private void postaviListu(Mesto mesto) {
                List<Mesto> lista=komunikacijaKlijent.Komunikacija.getInstance().vratiListuMesto(mesto);
                MestoModelTabele mmt=new MestoModelTabele(lista);
                mf.getjTableMesta().setModel(mmt);
            }
        });
        
        mf.ocistiActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mf.getjTextFieldNaziv().setText("");
                mf.getjTextFieldPostanski().setText("");
                popuniTabelu();
            }
        });
    }

}