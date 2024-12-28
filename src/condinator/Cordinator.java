/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condinator;

import controllerForme.GlavnaFormaController;
import controllerForme.MenadzerFormaController;
import controllerForme.MenadzerNalogFromaController;
import controllerForme.MestoFormaController;
import controllerForme.MestoKreirajFormaController;
import controllerForme.PrijavaController;
import controllerForme.ProjektiFormaController;
import controllerForme.ProjektiKreirajFormaController;
import controllerForme.RegistracijaController;
import controllerForme.SponzorFormaController;
import controllerForme.SponzorKreirajFormaController;
import controllerForme.StrucnaSpremaFormaController;
import controllerForme.StrucnaSpremaKreirajFormaController;
import controllerForme.VrstaAktivnostiFormaController;
import controllerForme.VrstaAktivnostiKreirajFormaController;
import model.Menadzer;
import model.Mesto;
import model.Projekat;
import model.Sponzor;
import model.StrucnaSprema;
import model.VrstaAktivnosti;
import view.GlavnaForma;
import view.MenadzerForma;
import view.MenadzerNalogForma;
import view.MestoForma;
import view.MestoKreirajForma;
import view.PrijavaForma;
import view.ProjektiForma;
import view.ProjektiKreirajForma;
import view.RegistracijaForma;
import view.SponzorForma;
import view.SponzorKreirajDetaljiForma;
import view.StrucnaSpremaForma;
import view.StrucnaSpremaKreirajForma;
import view.VrstaAktivnostiForma;
import view.VrstaAktivnostiKreirajForma;

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
    private MestoKreirajFormaController mestoKreirajFormaController;
    private SponzorKreirajFormaController sponzorKFController;
    private StrucnaSpremaKreirajFormaController strucnaSpremaKFController;
    private VrstaAktivnostiKreirajFormaController vrstaAKFController;
    private ProjektiKreirajFormaController projektiKFController;

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

    public void setUlogovani(Menadzer ulogovani) {
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
    
    public void otvoriProjektiFormu(Menadzer menadzer) {

        projektiFormaController = new ProjektiFormaController(new ProjektiForma(menadzer));

        projektiFormaController.otvoriFormu();
    }

    public void otvoriProjektiFormu(Sponzor sponzor) {

        projektiFormaController = new ProjektiFormaController(new ProjektiForma(sponzor));

        projektiFormaController.otvoriFormu();
    }
    

    public void otvoriMestoKreirajFomru(MestoForma parent, Mesto mesto) {
        if (mesto == null) {
            mestoKreirajFormaController = new MestoKreirajFormaController(new MestoKreirajForma(parent, true));
        } else {
            mestoKreirajFormaController = new MestoKreirajFormaController(new MestoKreirajForma(parent, true, mesto));
        }
        mestoKreirajFormaController.otvoriFormu();
    }

    public MestoFormaController getMestoFormaController() {
        return mestoFormaController;
    }

    public void otvoriSponzorKreirajFormu(SponzorForma parent, Sponzor sponzor) {
        if (sponzor != null) {
            sponzorKFController = new SponzorKreirajFormaController(new SponzorKreirajDetaljiForma(parent, true, sponzor));
        } else {
            sponzorKFController = new SponzorKreirajFormaController(new SponzorKreirajDetaljiForma(parent, true));
        }
        sponzorKFController.otvoriFormu();
    }

    public SponzorFormaController getsponzorFormaController() {
        return sponzorFormaController;
    }

    public void otvoriStrucnaSpremaDetaljiFormu(StrucnaSpremaForma parent, StrucnaSprema ss) {
        if (ss != null) {
            strucnaSpremaKFController = new StrucnaSpremaKreirajFormaController(new StrucnaSpremaKreirajForma(parent, true, ss));
        } else {
            strucnaSpremaKFController = new StrucnaSpremaKreirajFormaController(new StrucnaSpremaKreirajForma(parent, true));
        }
        strucnaSpremaKFController.otvoriFormu();
    }

    public StrucnaSpremaFormaController getStrucnaSpremaForma() {
        return ssFormaController;
    }

    public void otvotiVAKreirajFormu(VrstaAktivnostiForma vaf, VrstaAktivnosti vakt) {
        if (vakt == null) {
            vrstaAKFController = new VrstaAktivnostiKreirajFormaController(new VrstaAktivnostiKreirajForma(vaf, true));
        } else {
            vrstaAKFController = new VrstaAktivnostiKreirajFormaController(new VrstaAktivnostiKreirajForma(vaf, true, vakt));
        }

        vrstaAKFController.otvoriFormu();

    }

    public VrstaAktivnostiFormaController getvaFormaController() {
        return vaFormaController;
    }

    public void otvoriProjektiKreirajFormu(ProjektiForma parent, Projekat projekat) {
        if (projekat != null) {
            projektiKFController = new ProjektiKreirajFormaController(new ProjektiKreirajForma(parent, true, projekat));
        } else {
            projektiKFController = new ProjektiKreirajFormaController(new ProjektiKreirajForma(parent, true));
        }
        projektiKFController.otvoriFormu();
    }

    public ProjektiFormaController getProjektiFormaController() {
        return projektiFormaController;
    }

}
