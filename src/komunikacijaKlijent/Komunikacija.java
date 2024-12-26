/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package komunikacijaKlijent;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import komunikacija.Operacija;
import komunikacija.Receiver;
import komunikacija.Request;
import komunikacija.Response;
import komunikacija.Sender;
import model.MSS;
import model.Menadzer;
import model.Mesto;
import model.Projekat;
import model.Sponzor;
import model.StrucnaSprema;
import model.VrstaAktivnosti;

/**
 *
 * @author Korisnik
 */
public class Komunikacija {

    private Socket soket;
    private static Komunikacija instance;
    private Sender sender;
    private Receiver receiver;

    private Komunikacija() {

    }

    public static Komunikacija getInstance() {
        if (instance == null) {
            instance = new Komunikacija();
        }
        return instance;
    }

    public void konkecija() {

        try {
            soket = new Socket("localhost", 9000);
            sender = new Sender(soket);
            receiver = new Receiver(soket);
        } catch (IOException ex) {
            System.out.println("Server nije povezan");
            ex.printStackTrace();
        }

    }

    public Menadzer prijava(Menadzer menadzer) {
        Request request = new Request(komunikacija.Operacija.PRIJAVA, menadzer);

        sender.send(request);

        Response response = (Response) receiver.receive();

        menadzer = (Menadzer) response.getOdgovor();

        return menadzer;
    }

    public List<StrucnaSprema> ucitajStrucneSpreme() {
        List<StrucnaSprema> lista = new ArrayList<>();

        Request request = new Request(komunikacija.Operacija.UCITAJ_STRUCNE_SPREME, null);

        sender.send(request);

        Response response = (Response) receiver.receive();

        lista = (List<StrucnaSprema>) response.getOdgovor();

        return lista;

    }

    //PROBLEMOS
    public List<MSS> vratiListuMSS(Menadzer menadzer) {
        List<MSS> lista = new ArrayList<>();

        Request request = new Request(komunikacija.Operacija.UCITAJ_MSS, menadzer);

        sender.send(request);

        Response response = (Response) receiver.receive();

        lista = (List<MSS>) response.getOdgovor();

        return lista;

    }

    public List<Mesto> vratiListuSviMesto() {
        List<Mesto> lista = new ArrayList<>();

        Request request = new Request(komunikacija.Operacija.UCITAJ_MESTA, null);

        sender.send(request);

        Response response = (Response) receiver.receive();

        lista = (List<Mesto>) response.getOdgovor();

        return lista;
    }

    public List<VrstaAktivnosti> ucitajVrstaAktivnosti() {
        List<VrstaAktivnosti> lista = new ArrayList<>();

        Request request = new Request(komunikacija.Operacija.UCITAJ_VRSTA_AKTIVNOSTI, null);

        sender.send(request);

        Response response = (Response) receiver.receive();

        lista = (List<VrstaAktivnosti>) response.getOdgovor();

        return lista;
    }

    public List<Projekat> vratiListuSviProjekat() {
        List<Projekat> lista = new ArrayList<>();

        Request request = new Request(komunikacija.Operacija.UCITAJ_PROJEKTE, null);

        sender.send(request);

        Response response = (Response) receiver.receive();

        lista = (List<Projekat>) response.getOdgovor();

        return lista;

    }

    public List<Menadzer> vratiListuSviMenadzer() {
        List<Menadzer> lista = new ArrayList<>();

        Request request = new Request(komunikacija.Operacija.UCITAJ_MENADZERE, null);

        sender.send(request);

        Response response = (Response) receiver.receive();

        lista = (List<Menadzer>) response.getOdgovor();

        return lista;
    }

    public List<Sponzor> vratiListuSviSponzor() {
        List<Sponzor> lista = new ArrayList<>();

        Request request = new Request(komunikacija.Operacija.UCITAJ_SPONZORE, null);

        sender.send(request);

        Response response = (Response) receiver.receive();

        lista = (List<Sponzor>) response.getOdgovor();

        return lista;
    }

    public List<Menadzer> vratiListuMenadzer(Menadzer menadzer) {
        List<Menadzer> lista = new ArrayList<>();

        Request request = new Request(komunikacija.Operacija.UCITAJ_MENADZERE_FILTER, menadzer);

        sender.send(request);

        Response response = (Response) receiver.receive();

        lista = (List<Menadzer>) response.getOdgovor();

        return lista;
    }

    public List<Mesto> vratiListuMesto(Mesto mesto) {
        List<Mesto> lista = new ArrayList<>();

        Request request = new Request(komunikacija.Operacija.UCITAJ_MESTA_FILTER, mesto);

        sender.send(request);

        Response response = (Response) receiver.receive();

        lista = (List<Mesto>) response.getOdgovor();

        return lista;
    }

    public List<Sponzor> vratiListuSponzor(Sponzor kriterijumSponzor) {
        List<Sponzor> lista = new ArrayList<>();

        Request request = new Request(komunikacija.Operacija.UCITAJ_SPONZOR_FILTER, kriterijumSponzor);

        sender.send(request);

        Response response = (Response) receiver.receive();

        lista = (List<Sponzor>) response.getOdgovor();

        return lista;
    }

    public List<StrucnaSprema> vratiListuStrucnaSprema(StrucnaSprema strucnaSprema) {
        List<StrucnaSprema> lista = new ArrayList<>();

        Request request = new Request(komunikacija.Operacija.UCITAJ_SS_FILTER, strucnaSprema);

        sender.send(request);

        Response response = (Response) receiver.receive();

        lista = (List<StrucnaSprema>) response.getOdgovor();

        return lista;
    }

    public List<VrstaAktivnosti> vratiListuVrstaAktivnosti(VrstaAktivnosti vakt) {
        List<VrstaAktivnosti> lista = new ArrayList<>();

        Request request = new Request(komunikacija.Operacija.UCITAJ_VAKT_FILTER, vakt);

        sender.send(request);

        Response response = (Response) receiver.receive();

        lista = (List<VrstaAktivnosti>) response.getOdgovor();

        return lista;
    }

    public boolean kreirajMesto(Mesto mesto) {
        Request request = new Request(Operacija.KREIRAJ_MESTO, mesto);
        sender.send(request);
        Response response = (Response) receiver.receive();
        return response.getExc() == null;
    }

    public boolean obrisiMesto(Mesto mesto) {
        Request request = new Request(Operacija.OBRISI_MESTO, mesto);
        sender.send(request);
        Response response = (Response) receiver.receive();
        return response.getExc() == null;
    }

    public boolean promeniMesto(Mesto mesto) {
        Request request = new Request(Operacija.PROMENI_MESTO, mesto);
        sender.send(request);
        Response response = (Response) receiver.receive();
        return response.getExc() == null;
    }

    public boolean kreirajSponzor(Sponzor sponzor) {
        Request request = new Request(Operacija.KREIRAJ_SPONZOR, sponzor);
        sender.send(request);
        Response response = (Response) receiver.receive();
        return response.getExc() == null;
    }

    public boolean obrisiSponzor(Sponzor sponzor) {

        Request request = new Request(Operacija.OBRISI_SPONZOR, sponzor);
        sender.send(request);
        Response response = (Response) receiver.receive();

        return response.getExc() == null;
    }

    public boolean promeniSponzor(Sponzor sponzor) {
        Request request = new Request(Operacija.PROMENI_SPONZOR, sponzor);
        sender.send(request);
        Response response = (Response) receiver.receive();

        return response.getExc() == null;
    }

    public boolean promeniStrucnaSprema(StrucnaSprema strucnaSprema) {
        Request request = new Request(Operacija.PROMENI_STRUCNA_SPREMA, strucnaSprema);
        sender.send(request);
        Response response = (Response) receiver.receive();

        return response.getExc() == null;
    }

    public boolean obrisiStrucnaSprema(StrucnaSprema strucnaSprema) {
        Request request = new Request(Operacija.OBRISI_STRUCNA_SPREMA, strucnaSprema);
        sender.send(request);
        Response response = (Response) receiver.receive();

        return response.getExc() == null;
    }

    public boolean kreirajStrucnaSprema(StrucnaSprema strucnaSprema) {
        Request request = new Request(Operacija.UBACI_STRUCNA_SPREMA, strucnaSprema);
        sender.send(request);
        Response response = (Response) receiver.receive();

        return response.getExc() == null;
    }

    public boolean promeniVrstaAktivnosti(VrstaAktivnosti vakt) {
        Request request = new Request(Operacija.PROMENI_VRSTA_AKTIVNOSTI, vakt);
        sender.send(request);
        Response response = (Response) receiver.receive();

        return response.getExc() == null;
    }

    public boolean obrisiVrstaAktivnosti(VrstaAktivnosti vrstaAktivnosti) {
        Request request = new Request(Operacija.OBRISI_VRSTA_AKTIVNOSTI, vrstaAktivnosti);
        sender.send(request);
        Response response = (Response) receiver.receive();

        return response.getExc() == null;
    }

    public boolean kreirajVrstaAktivnosti(VrstaAktivnosti vrstaAktivnosti) {
        Request request = new Request(Operacija.KREIRAJ_VRSTA_AKTIVNOSTI, vrstaAktivnosti);
        sender.send(request);
        Response response = (Response) receiver.receive();

        return response.getExc() == null;
    }

}
