/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package komunikacijaKlijent;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import jsonFormat.JSONFormat;
import komunikacija.Operacija;
import komunikacija.Receiver;
import komunikacija.Request;
import komunikacija.Response;
import komunikacija.Sender;
import listWrapper.ListaMesto;
import model.Aktivnost;
import model.JeSponzor;
import model.MSS;
import model.Menadzer;
import model.Mesto;
import model.OpstiDomenskiObjekat;
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
            System.exit(0);
            ex.printStackTrace();
        }

    }

    public Menadzer prijava(Menadzer menadzer) {
        String obj = JSONFormat.toJson(menadzer);

        Request request = new Request(komunikacija.Operacija.PRIJAVA, obj);

        sender.send(request);

        Response response = (Response) receiver.receive();

        menadzer = JSONFormat.fromJson(response.getOdgovor().toString(), Menadzer.class);

        return menadzer;
    }

    public List<StrucnaSprema> ucitajStrucneSpreme() {
        List<StrucnaSprema> lista = new ArrayList<>();

        Request request = new Request(komunikacija.Operacija.UCITAJ_STRUCNE_SPREME, null);

        sender.send(request);

        Response response = (Response) receiver.receive();

        lista = (List<StrucnaSprema>) response.getOdgovor();

        if (response.getExc() != null) {
            return null;
        }
        return lista;

    }

    //PROBLEMOS
    public List<MSS> vratiListuMSS(Menadzer menadzer) {
        List<MSS> lista = new ArrayList<>();

        Request request = new Request(komunikacija.Operacija.UCITAJ_MSS, menadzer);

        sender.send(request);

        Response response = (Response) receiver.receive();

        lista = (List<MSS>) response.getOdgovor();

        if (response.getExc() != null) {
            return null;
        }
        return lista;

    }

    public List<Mesto> vratiListuSviMesto() {
        List<Mesto> lista = new ArrayList<>();

        Request request = new Request(komunikacija.Operacija.UCITAJ_MESTA, null);

        sender.send(request);

        Response response = (Response) receiver.receive();

        lista = (List<Mesto>) response.getOdgovor();

        if (response.getExc() != null) {
            return null;
        }
        return lista;
    }

    public List<VrstaAktivnosti> ucitajVrstaAktivnosti() {
        List<VrstaAktivnosti> lista = new ArrayList<>();

        Request request = new Request(komunikacija.Operacija.UCITAJ_VRSTA_AKTIVNOSTI, null);

        sender.send(request);

        Response response = (Response) receiver.receive();

        lista = (List<VrstaAktivnosti>) response.getOdgovor();
        if (response.getExc() != null) {
            return null;
        }
        return lista;
    }

    public List<Projekat> vratiListuSviProjekat() {
        List<Projekat> lista = new ArrayList<>();

        Request request = new Request(komunikacija.Operacija.UCITAJ_PROJEKTE, null);

        sender.send(request);

        Response response = (Response) receiver.receive();

        lista = (List<Projekat>) response.getOdgovor();
        if (response.getExc() != null) {
            return null;
        }
        return lista;

    }

    public List<Menadzer> vratiListuSviMenadzer() {
        List<Menadzer> lista = new ArrayList<>();

        Request request = new Request(komunikacija.Operacija.UCITAJ_MENADZERE, null);

        sender.send(request);

        Response response = (Response) receiver.receive();

        lista = (List<Menadzer>) response.getOdgovor();
        if (response.getExc() != null) {
            return null;
        }
        return lista;
    }

    public List<Sponzor> vratiListuSviSponzor() {
        List<Sponzor> lista = new ArrayList<>();

        Request request = new Request(komunikacija.Operacija.UCITAJ_SPONZORE, null);

        sender.send(request);

        Response response = (Response) receiver.receive();

        lista = (List<Sponzor>) response.getOdgovor();
        if (response.getExc() != null) {
            return null;
        }
        return lista;
    }

    public List<Menadzer> vratiListuMenadzer(Menadzer menadzer) {
        List<Menadzer> lista = new ArrayList<>();

        String obj = JSONFormat.toJson(menadzer);

        Request request = new Request(komunikacija.Operacija.UCITAJ_MENADZERE_FILTER, obj);

        sender.send(request);

        Response response = (Response) receiver.receive();

        lista = (List<Menadzer>) response.getOdgovor();
        if (response.getExc() != null) {
            return null;
        }
        return lista;
    }

    public List<Mesto> vratiListuMesto(Mesto mesto) {
        List<Mesto> lista = new ArrayList<>();

        String obj = JSONFormat.toJson(mesto);

        Request request = new Request(komunikacija.Operacija.UCITAJ_MESTA_FILTER, obj);

        sender.send(request);

        Response response = (Response) receiver.receive();

        lista = (List<Mesto>) response.getOdgovor();
        if (response.getExc() != null) {
            return null;
        }
        return lista;
    }

    public List<Sponzor> vratiListuSponzor(Sponzor kriterijumSponzor) {
        List<Sponzor> lista = new ArrayList<>();

        String obj = JSONFormat.toJson(kriterijumSponzor);

        Request request = new Request(komunikacija.Operacija.UCITAJ_SPONZOR_FILTER, obj);

        sender.send(request);

        Response response = (Response) receiver.receive();

        lista = (List<Sponzor>) response.getOdgovor();
        if (response.getExc() != null) {
            return null;
        }

        return lista;
    }

    public List<StrucnaSprema> vratiListuStrucnaSprema(StrucnaSprema strucnaSprema) {
        List<StrucnaSprema> lista = new ArrayList<>();

        String obj = jsonFormat.JSONFormat.toJson(strucnaSprema);

        Request request = new Request(komunikacija.Operacija.UCITAJ_SS_FILTER, obj);

        sender.send(request);

        Response response = (Response) receiver.receive();

        lista = (List<StrucnaSprema>) response.getOdgovor();
        if (response.getExc() != null) {
            return null;
        }

        return lista;
    }

    public List<VrstaAktivnosti> vratiListuVrstaAktivnosti(VrstaAktivnosti vakt) {
        List<VrstaAktivnosti> lista = new ArrayList<>();

        String obj = JSONFormat.toJson(vakt);

        Request request = new Request(komunikacija.Operacija.UCITAJ_VAKT_FILTER, obj);

        sender.send(request);

        Response response = (Response) receiver.receive();

        lista = (List<VrstaAktivnosti>) response.getOdgovor();
        if (response.getExc() != null) {
            return null;
        }

        return lista;
    }

    public boolean kreirajMesto(Mesto mesto) {
        String obj = jsonFormat.JSONFormat.toJson(mesto);
        Request request = new Request(Operacija.KREIRAJ_MESTO, obj);
        sender.send(request);
        Response response = (Response) receiver.receive();

        return response.getExc() == null;
    }

    public boolean obrisiMesto(Mesto mesto) {
        String obj = JSONFormat.toJson(mesto);
        Request request = new Request(Operacija.OBRISI_MESTO, obj);
        sender.send(request);
        Response response = (Response) receiver.receive();
        return response.getExc() == null;
    }

    public boolean promeniMesto(Mesto mesto) {
        String obj = JSONFormat.toJson(mesto);

        Request request = new Request(Operacija.PROMENI_MESTO, obj);
        sender.send(request);
        Response response = (Response) receiver.receive();
        return response.getExc() == null;
    }

    public boolean kreirajSponzor(Sponzor sponzor) {
        String obj = JSONFormat.toJson(sponzor);

        Request request = new Request(Operacija.KREIRAJ_SPONZOR, obj);
        sender.send(request);
        Response response = (Response) receiver.receive();
        return response.getExc() == null;
    }

    public boolean obrisiSponzor(Sponzor sponzor) {
        String obj = JSONFormat.toJson(sponzor);

        Request request = new Request(Operacija.OBRISI_SPONZOR, obj);
        sender.send(request);
        Response response = (Response) receiver.receive();

        return response.getExc() == null;
    }

    public boolean promeniSponzor(Sponzor sponzor) {
        String obj = JSONFormat.toJson(sponzor);

        Request request = new Request(Operacija.PROMENI_SPONZOR, obj);
        sender.send(request);
        Response response = (Response) receiver.receive();

        return response.getExc() == null;
    }

    public boolean promeniStrucnaSprema(StrucnaSprema strucnaSprema) {
        String obj = JSONFormat.toJson(strucnaSprema);

        Request request = new Request(Operacija.PROMENI_STRUCNA_SPREMA, obj);
        sender.send(request);
        Response response = (Response) receiver.receive();

        return response.getExc() == null;
    }

    public boolean obrisiStrucnaSprema(StrucnaSprema strucnaSprema) {
        String obj = JSONFormat.toJson(strucnaSprema);

        Request request = new Request(Operacija.OBRISI_STRUCNA_SPREMA, obj);
        sender.send(request);
        Response response = (Response) receiver.receive();

        return response.getExc() == null;
    }

    public boolean kreirajStrucnaSprema(StrucnaSprema strucnaSprema) {
        String obj = JSONFormat.toJson(strucnaSprema);

        Request request = new Request(Operacija.UBACI_STRUCNA_SPREMA, obj);
        sender.send(request);
        Response response = (Response) receiver.receive();

        return response.getExc() == null;
    }

    public boolean promeniVrstaAktivnosti(VrstaAktivnosti vakt) {
        String obj = JSONFormat.toJson(vakt);

        Request request = new Request(Operacija.PROMENI_VRSTA_AKTIVNOSTI, obj);
        sender.send(request);
        Response response = (Response) receiver.receive();

        return response.getExc() == null;
    }

    public boolean obrisiVrstaAktivnosti(VrstaAktivnosti vrstaAktivnosti) {
        String obj = JSONFormat.toJson(vrstaAktivnosti);

        Request request = new Request(Operacija.OBRISI_VRSTA_AKTIVNOSTI, obj);
        sender.send(request);
        Response response = (Response) receiver.receive();

        return response.getExc() == null;
    }

    public boolean kreirajVrstaAktivnosti(VrstaAktivnosti vrstaAktivnosti) {
        String obj = JSONFormat.toJson(vrstaAktivnosti);

        Request request = new Request(Operacija.KREIRAJ_VRSTA_AKTIVNOSTI, obj);
        sender.send(request);
        Response response = (Response) receiver.receive();

        return response.getExc() == null;
    }

    public boolean kreirajMSS(MSS mss) {
        String obj = JSONFormat.toJson(mss);

        Request request = new Request(Operacija.KREIRAJ_MSS, obj);
        sender.send(request);
        Response response = (Response) receiver.receive();

        return response.getExc() == null;
    }

    public boolean obrisiMSS(MSS mss) {
        String obj = JSONFormat.toJson(mss);

        Request request = new Request(Operacija.OBRISI_MSS, obj);
        sender.send(request);
        Response response = (Response) receiver.receive();

        return response.getExc() == null;
    }

    public boolean obrisiMenadzer(Menadzer men) {
        String obj = JSONFormat.toJson(men);

        Request request = new Request(Operacija.OBRISI_MENADZER, obj);
        sender.send(request);
        Response response = (Response) receiver.receive();

        return response.getExc() == null;
    }

    public boolean promeniMenadzer(Menadzer men) {
        String obj = JSONFormat.toJson(men);

        Request request = new Request(Operacija.PROMENI_MENADZER, obj);
        sender.send(request);
        Response response = (Response) receiver.receive();

        return response.getExc() == null;
    }

    public Menadzer kreirajMenadzer(Menadzer menadzer) {
        String obj = JSONFormat.toJson(menadzer);

        Request request = new Request(Operacija.KREIRAJ_MENADZER, obj);
        sender.send(request);
        Response response = (Response) receiver.receive();

        return (Menadzer) response.getOdgovor();
    }

    public boolean vratiListuProjektniUgovor(OpstiDomenskiObjekat kriterijum, List<Projekat> listaUgovora) {
        String obj = JSONFormat.toJson(kriterijum);
        Request request = new Request(Operacija.PRETRAZI_PROJEKAT, obj);
        sender.send(request);
        Response response = (Response) receiver.receive();
        List<Projekat> dobijenaLista = (List<Projekat>) response.getOdgovor();
        for (Projekat p : dobijenaLista) {
            if (!listaUgovora.contains(p)) {
                listaUgovora.add(p);
            }
        }
        return response.getExc() == null;
    }

    public List<JeSponzor> vratiListuJeSponzor(Projekat projekat) {
        List<JeSponzor> lista = new ArrayList<>();

        String obj = JSONFormat.toJson(projekat);
        Request request = new Request(komunikacija.Operacija.UCITAJ_JESPONZOR_PROJEKTA, obj);

        sender.send(request);

        Response response = (Response) receiver.receive();

        lista = (List<JeSponzor>) response.getOdgovor();
        if (response.getExc() != null) {
            return null;
        }
        return lista;
    }

    public List<Aktivnost> vratiListuAktivnost(Projekat projekat) {
        List<Aktivnost> lista = new ArrayList<>();
        String obj = JSONFormat.toJson(projekat);
        Request request = new Request(komunikacija.Operacija.UCITAJ_AKTIVNOST_PROJEKTA, obj);

        sender.send(request);

        Response response = (Response) receiver.receive();

        lista = (List<Aktivnost>) response.getOdgovor();
        if (response.getExc() != null) {
            return null;
        }
        return lista;
    }

    public boolean kreirajProjektniUgovor(Projekat ugovor) {
        String obj = JSONFormat.toJson(ugovor);

        Request request = new Request(Operacija.KREIRAJ_UGOVOR, obj);
        sender.send(request);
        Response response = (Response) receiver.receive();

        return response.getExc() == null;
    }

    public boolean kreirajAktivnost(Aktivnost aktivnosti) {
        String obj = JSONFormat.toJson(aktivnosti);

        Request request = new Request(Operacija.KREIRAJ_AKTIVNOST, obj);
        sender.send(request);
        Response response = (Response) receiver.receive();

        return response.getExc() == null;
    }

    public boolean kreirajJeSponzor(JeSponzor js) {
        String obj = JSONFormat.toJson(js);

        Request request = new Request(Operacija.KREIRAJ_JESPONZOR, obj);
        sender.send(request);
        Response response = (Response) receiver.receive();

        return response.getExc() == null;
    }

    public boolean promeniAktivnost(Aktivnost aktivnost) {
        String obj = JSONFormat.toJson(aktivnost);

        Request request = new Request(Operacija.PROMENI_AKTIVNOST, obj);
        sender.send(request);
        Response response = (Response) receiver.receive();

        return response.getExc() == null;
    }

}
