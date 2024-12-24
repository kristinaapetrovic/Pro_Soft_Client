/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condinator;

import controllerForme.GlavnaFormaController;
import controllerForme.MenadzerFormaController;
import controllerForme.MenadzerNalogFromaController;
import controllerForme.MestoFormaController;
import controllerForme.PrijavaController;
import controllerForme.ProjektiFormaController;
import controllerForme.RegistracijaController;
import controllerForme.SponzorFormaController;
import controllerForme.StrucnaSpremaFormaController;
import controllerForme.VrstaAktivnostiFormaController;
import model.Menadzer;
import view.GlavnaForma;
import view.MenadzerForma;
import view.MenadzerNalogForma;
import view.MestoForma;
import view.PrijavaForma;
import view.ProjektiForma;
import view.RegistracijaForma;
import view.SponzorForma;
import view.StrucnaSpremaForma;
import view.VrstaAktivnostiForma;

/**
 *
 * @author Korisnik
 */
public class Cordinator {

    private static Cordinator instance;
    private PrijavaController prijavaController;
    private GlavnaFormaController glavnaFormaController;
    private RegistracijaController registracijaFormaController;
    private static Menadzer ulogovani;
    private MenadzerFormaController menadzerFormaController;
    private MenadzerNalogFromaController menadzerNFController;
    private MestoFormaController mestoFormaController;
    private SponzorFormaController sponzorFormaController;
    private StrucnaSpremaFormaController ssFormaController;
    private VrstaAktivnostiFormaController vaFormaController;
    private ProjektiFormaController projektiFormaController;

    public static Cordinator getInstance() {
        if (instance == null) {
            instance = new Cordinator();
        }
        return instance;
    }

    private Cordinator() {
    }

    public void otvoriPrijavaFormu() {
        prijavaController = new PrijavaController(new PrijavaForma());
        prijavaController.otvoriFormu();
    }

    public void otvoriGlavnuFormu() {
        glavnaFormaController = new GlavnaFormaController(new GlavnaForma());
        glavnaFormaController.otvoriGlavnuFormu();
    }

    public static void setUlogovani(Menadzer ulogovani) {
        Cordinator.ulogovani = ulogovani;
    }

    public Menadzer getUlogovani() {
        return ulogovani;
    }

    public void otvoriRegistracijaFormu() {
        registracijaFormaController = new RegistracijaController(new RegistracijaForma());
        registracijaFormaController.otvoriFormu();
    }

    public void otvoriMenadzerForma() {
        menadzerFormaController = new MenadzerFormaController(new MenadzerForma());
        menadzerFormaController.otvoriFormu();
    }

    public void otvoriMenadzerNalogFormu(Menadzer menadzer, boolean registracija, boolean izmene) {
        if (!izmene) {
            menadzerNFController = new MenadzerNalogFromaController(new MenadzerNalogForma(menadzer));
        } else {
            menadzerNFController = new MenadzerNalogFromaController(new MenadzerNalogForma(menadzer, registracija));
        }
        menadzerNFController.otvoriFormu();

    }

    public void otvoriMestoFormu() {
        mestoFormaController = new MestoFormaController(new MestoForma());
        mestoFormaController.otvoriFormu();
    }

    public void otvoriSponzorForma() {
        sponzorFormaController = new SponzorFormaController(new SponzorForma());
        sponzorFormaController.otvoriFormu();
    }

    public void otvoriStrucnaSpremaFormu() {
        ssFormaController = new StrucnaSpremaFormaController(new StrucnaSpremaForma());
        ssFormaController.otvoriFormu();
    }

    public void otvoriVrstaAktivnostiFormu() {
        vaFormaController = new VrstaAktivnostiFormaController(new VrstaAktivnostiForma());
        vaFormaController.otvoriFormu();

    }

    public void otvoriProjektiFormu() {
        projektiFormaController = new ProjektiFormaController(new ProjektiForma());
        projektiFormaController.otvoriFormu();
    }

}
