/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllerForme;

import condinator.Cordinator;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import model.Mesto;
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

    public void otvoriFormu() {
        mkf.setVisible(true);

    }

 

}
