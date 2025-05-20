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

    public Menadzer prijava(Menadzer menadzer) throws Exception {
        String obj = JSONFormat.toJson(menadzer);
        Request request = new Request(komunikacija.Operacija.PRIJAVA, obj);
        if (sender.isAlive()) {
            sender.send(request);
            Response response = (Response) receiver.receive();
            menadzer = JSONFormat.fromJson(response.getOdgovor().toString(), Menadzer.class);
            return menadzer;
        } else {
            throw new Exception("Server nije aktivan");
        }
    }

    public List<StrucnaSprema> ucitajStrucneSpreme() throws Exception {
        List<StrucnaSprema> lista = new ArrayList<>();
        Request request = new Request(komunikacija.Operacija.UCITAJ_STRUCNE_SPREME, null);
        if (sender.isAlive()) {
            sender.send(request);
            Response response = (Response) receiver.receive();
            lista = (List<StrucnaSprema>) response.getOdgovor();
            if (response.getExc() != null) {
                return null;
            }
            return lista;
        } else {
            throw new Exception("Server nije aktivan");
        }

    }

    //PROBLEMOS
    public List<MSS> vratiListuMSS(Menadzer menadzer) throws Exception {
        List<MSS> lista = new ArrayList<>();
        String obj = JSONFormat.toJson(menadzer);
        Request request = new Request(komunikacija.Operacija.UCITAJ_MSS, obj);
        if (sender.isAlive()) {
            sender.send(request);
            Response response = (Response) receiver.receive();
            lista = (List<MSS>) response.getOdgovor();
            if (response.getExc() != null) {
                return null;
            }
            return lista;
        } else {
            throw new Exception("Server nije aktivan");
        }

    }

    public List<Mesto> vratiListuSviMesto() throws Exception {
        List<Mesto> lista = new ArrayList<>();
        Request request = new Request(komunikacija.Operacija.UCITAJ_MESTA, null);
        if (sender.isAlive()) {
            sender.send(request);
            Response response = (Response) receiver.receive();
            lista = (List<Mesto>) response.getOdgovor();
            if (response.getExc() != null) {
                return null;
            }
            return lista;
        } else {
            throw new Exception("Server nije aktivan");
        }
    }

    public List<VrstaAktivnosti> ucitajVrstaAktivnosti() throws Exception {
        List<VrstaAktivnosti> lista = new ArrayList<>();
        Request request = new Request(komunikacija.Operacija.UCITAJ_VRSTA_AKTIVNOSTI, null);
        if (sender.isAlive()) {
            sender.send(request);
            Response response = (Response) receiver.receive();
            lista = (List<VrstaAktivnosti>) response.getOdgovor();
            if (response.getExc() != null) {
                return null;
            }
            return lista;
        } else {
            throw new Exception("Server nije aktivan");

        }
    }

    public List<Projekat> vratiListuSviProjekat() throws Exception {
        List<Projekat> lista = new ArrayList<>();
        Request request = new Request(komunikacija.Operacija.UCITAJ_PROJEKTE, null);
        if (sender.isAlive()) {
            sender.send(request);
            Response response = (Response) receiver.receive();
            lista = (List<Projekat>) response.getOdgovor();
            if (response.getExc() != null) {
                return null;
            }
            return lista;
        } else {
            throw new Exception("Server nije aktivan");
        }

    }

    public List<Menadzer> vratiListuSviMenadzer() throws Exception {
        List<Menadzer> lista = new ArrayList<>();
        Request request = new Request(komunikacija.Operacija.UCITAJ_MENADZERE, null);
        if (sender.isAlive()) {
            sender.send(request);
            Response response = (Response) receiver.receive();
            lista = (List<Menadzer>) response.getOdgovor();
            if (response.getExc() != null) {
                return null;
            }
            return lista;
        } else {
            throw new Exception("Server nije aktivan");
        }
    }

    public List<Sponzor> vratiListuSviSponzor() throws Exception {
        List<Sponzor> lista = new ArrayList<>();
        Request request = new Request(komunikacija.Operacija.UCITAJ_SPONZORE, null);
        if (sender.isAlive()) {
            sender.send(request);
            Response response = (Response) receiver.receive();
            lista = (List<Sponzor>) response.getOdgovor();
            if (response.getExc() != null) {
                return null;
            }
            return lista;
        } else {
            throw new Exception("Server nije aktivan");
        }
    }

    public List<Menadzer> vratiListuMenadzer(Menadzer menadzer) throws Exception {
        List<Menadzer> lista = new ArrayList<>();
        String obj = JSONFormat.toJson(menadzer);
        Request request = new Request(komunikacija.Operacija.UCITAJ_MENADZERE_FILTER, obj);
        if (sender.isAlive()) {
            sender.send(request);
            Response response = (Response) receiver.receive();
            lista = (List<Menadzer>) response.getOdgovor();
            if (response.getExc() != null) {
                return null;
            }
            return lista;
        } else {
            throw new Exception("Server nije aktivan");
        }
    }

    public List<Mesto> vratiListuMesto(Mesto mesto) throws Exception {
        List<Mesto> lista = new ArrayList<>();
        String obj = JSONFormat.toJson(mesto);
        Request request = new Request(komunikacija.Operacija.UCITAJ_MESTA_FILTER, obj);
        if (sender.isAlive()) {
            sender.send(request);
            Response response = (Response) receiver.receive();
            lista = (List<Mesto>) response.getOdgovor();
            if (response.getExc() != null) {
                return null;
            }
            return lista;
        } else {
            throw new Exception("Server nije aktivan");
        }
    }

    public List<Sponzor> vratiListuSponzor(Sponzor kriterijumSponzor) throws Exception {
        List<Sponzor> lista = new ArrayList<>();
        String obj = JSONFormat.toJson(kriterijumSponzor);
        Request request = new Request(komunikacija.Operacija.UCITAJ_SPONZOR_FILTER, obj);
        if (sender.isAlive()) {
            sender.send(request);
            Response response = (Response) receiver.receive();
            lista = (List<Sponzor>) response.getOdgovor();
            if (response.getExc() != null) {
                return null;
            }
            return lista;
        } else {
            throw new Exception("Server nije aktivan");
        }
    }

    public List<StrucnaSprema> vratiListuStrucnaSprema(StrucnaSprema strucnaSprema) throws Exception {
        List<StrucnaSprema> lista = new ArrayList<>();
        String obj = jsonFormat.JSONFormat.toJson(strucnaSprema);
        Request request = new Request(komunikacija.Operacija.UCITAJ_SS_FILTER, obj);
        if (sender.isAlive()) {
            sender.send(request);
            Response response = (Response) receiver.receive();
            lista = (List<StrucnaSprema>) response.getOdgovor();
            if (response.getExc() != null) {
                return null;
            }
            return lista;
        } else {
            throw new Exception("Server nije aktivan");
        }
    }

    public List<VrstaAktivnosti> vratiListuVrstaAktivnosti(VrstaAktivnosti vakt) throws Exception {
        List<VrstaAktivnosti> lista = new ArrayList<>();
        String obj = JSONFormat.toJson(vakt);
        Request request = new Request(komunikacija.Operacija.UCITAJ_VAKT_FILTER, obj);
        if (sender.isAlive()) {
            sender.send(request);
            Response response = (Response) receiver.receive();
            lista = (List<VrstaAktivnosti>) response.getOdgovor();
            if (response.getExc() != null) {
                return null;
            }
            return lista;
        } else {
            throw new Exception("Server nije aktivan");
        }
    }

    public boolean kreirajMesto(Mesto mesto) throws Exception {
        String obj = jsonFormat.JSONFormat.toJson(mesto);
        Request request = new Request(Operacija.KREIRAJ_MESTO, obj);
        if (sender.isAlive()) {
            sender.send(request);
            Response response = (Response) receiver.receive();
            return response.getExc() == null;
        } else {
            throw new Exception("Server nije aktivan");
        }
    }

    public boolean obrisiMesto(Mesto mesto) throws Exception {
        String obj = JSONFormat.toJson(mesto);
        Request request = new Request(Operacija.OBRISI_MESTO, obj);
        if (sender.isAlive()) {
            sender.send(request);
            Response response = (Response) receiver.receive();
            return response.getExc() == null;
        } else {
            throw new Exception("Server nije aktivan");
        }
    }

    public boolean promeniMesto(Mesto mesto) throws Exception {
        String obj = JSONFormat.toJson(mesto);
        Request request = new Request(Operacija.PROMENI_MESTO, obj);
        if (sender.isAlive()) {
            sender.send(request);
            Response response = (Response) receiver.receive();
            return response.getExc() == null;
        } else {
            throw new Exception("Server nije aktivan");
        }
    }

    public boolean kreirajSponzor(Sponzor sponzor) throws Exception {
        String obj = JSONFormat.toJson(sponzor);
        Request request = new Request(Operacija.KREIRAJ_SPONZOR, obj);
        if (sender.isAlive()) {
            sender.send(request);
            Response response = (Response) receiver.receive();
            return response.getExc() == null;
        } else {
            throw new Exception("Server nije aktivan");
        }
    }

    public boolean obrisiSponzor(Sponzor sponzor) throws Exception {
        String obj = JSONFormat.toJson(sponzor);
        Request request = new Request(Operacija.OBRISI_SPONZOR, obj);
        if (sender.isAlive()) {
            sender.send(request);
            Response response = (Response) receiver.receive();
            return response.getExc() == null;
        } else {
            throw new Exception("Server nije aktivan");
        }
    }

    public boolean promeniSponzor(Sponzor sponzor) throws Exception {
        String obj = JSONFormat.toJson(sponzor);
        Request request = new Request(Operacija.PROMENI_SPONZOR, obj);
        if (sender.isAlive()) {
            sender.send(request);
            Response response = (Response) receiver.receive();
            return response.getExc() == null;
        } else {
            throw new Exception("Server nije aktivan");
        }
    }

    public boolean promeniStrucnaSprema(StrucnaSprema strucnaSprema) throws Exception {
        String obj = JSONFormat.toJson(strucnaSprema);
        Request request = new Request(Operacija.PROMENI_STRUCNA_SPREMA, obj);
        if (sender.isAlive()) {
            sender.send(request);
            Response response = (Response) receiver.receive();
            return response.getExc() == null;
        } else {
            throw new Exception("Server nije aktivan");
        }
    }

    public boolean obrisiStrucnaSprema(StrucnaSprema strucnaSprema) throws Exception {
        String obj = JSONFormat.toJson(strucnaSprema);
        Request request = new Request(Operacija.OBRISI_STRUCNA_SPREMA, obj);
        if (sender.isAlive()) {
            sender.send(request);
            Response response = (Response) receiver.receive();
            return response.getExc() == null;
        } else {
            throw new Exception("Server nije aktivan");
        }
    }

    public boolean kreirajStrucnaSprema(StrucnaSprema strucnaSprema) throws Exception {
        String obj = JSONFormat.toJson(strucnaSprema);
        Request request = new Request(Operacija.UBACI_STRUCNA_SPREMA, obj);
        if (sender.isAlive()) {
            sender.send(request);
            Response response = (Response) receiver.receive();
            return response.getExc() == null;
        } else {
            throw new Exception("Server nije aktivan");
        }
    }

    public boolean promeniVrstaAktivnosti(VrstaAktivnosti vakt) throws Exception {
        String obj = JSONFormat.toJson(vakt);
        Request request = new Request(Operacija.PROMENI_VRSTA_AKTIVNOSTI, obj);
        if (sender.isAlive()) {
            sender.send(request);
            Response response = (Response) receiver.receive();
            return response.getExc() == null;
        } else {
            throw new Exception("Server nije aktivan");
        }
    }

    public boolean obrisiVrstaAktivnosti(VrstaAktivnosti vrstaAktivnosti) throws Exception {
        String obj = JSONFormat.toJson(vrstaAktivnosti);
        Request request = new Request(Operacija.OBRISI_VRSTA_AKTIVNOSTI, obj);
        if (sender.isAlive()) {
            sender.send(request);
            Response response = (Response) receiver.receive();
            return response.getExc() == null;
        } else {
            throw new Exception("Server nije aktivan");
        }
    }

    public boolean kreirajVrstaAktivnosti(VrstaAktivnosti vrstaAktivnosti) throws Exception {
        String obj = JSONFormat.toJson(vrstaAktivnosti);
        Request request = new Request(Operacija.KREIRAJ_VRSTA_AKTIVNOSTI, obj);
        if (sender.isAlive()) {
            sender.send(request);
            Response response = (Response) receiver.receive();
            return response.getExc() == null;
        } else {
            throw new Exception("Server nije aktivan");
        }
    }

    public boolean kreirajMSS(MSS mss) throws Exception {
        String obj = JSONFormat.toJson(mss);
        Request request = new Request(Operacija.KREIRAJ_MSS, obj);
        if (sender.isAlive()) {
            sender.send(request);
            Response response = (Response) receiver.receive();
            return response.getExc() == null;
        } else {
            throw new Exception("Server nije aktivan");
        }
    }

    public boolean obrisiMSS(MSS mss) throws Exception {
        String obj = JSONFormat.toJson(mss);
        Request request = new Request(Operacija.OBRISI_MSS, obj);
        sender.send(request);
        if (sender.isAlive()) {
            Response response = (Response) receiver.receive();
            return response.getExc() == null;
        } else {
            throw new Exception("Server nije aktivan");
        }
    }

    public boolean obrisiMenadzer(Menadzer men) throws Exception {
        String obj = JSONFormat.toJson(men);
        Request request = new Request(Operacija.OBRISI_MENADZER, obj);
        if (sender.isAlive()) {
            sender.send(request);
            Response response = (Response) receiver.receive();
            return response.getExc() == null;
        } else {
            throw new Exception("Server nije aktivan");
        }
    }

    public boolean promeniMenadzer(Menadzer men) throws Exception {
        String obj = JSONFormat.toJson(men);
        Request request = new Request(Operacija.PROMENI_MENADZER, obj);
        if (sender.isAlive()) {
            sender.send(request);
            Response response = (Response) receiver.receive();
            return response.getExc() == null;
        } else {
            throw new Exception("Server nije aktivan");
        }
    }

    public Menadzer kreirajMenadzer(Menadzer menadzer) throws Exception {
        String obj = JSONFormat.toJson(menadzer);
        Request request = new Request(Operacija.KREIRAJ_MENADZER, obj);
        if (sender.isAlive()) {
            sender.send(request);
            Response response = (Response) receiver.receive();
            return (Menadzer) response.getOdgovor();
        } else {
            throw new Exception("Server nije aktivan");
        }
    }

    public boolean vratiListuProjektniUgovor(OpstiDomenskiObjekat kriterijum, List<Projekat> listaUgovora) throws Exception {
        String obj = JSONFormat.toJson(kriterijum);
        Request request = new Request(Operacija.PRETRAZI_PROJEKAT, obj);
        if (sender.isAlive()) {
            sender.send(request);
            Response response = (Response) receiver.receive();
            List<Projekat> dobijenaLista = (List<Projekat>) response.getOdgovor();
            for (Projekat p : dobijenaLista) {
                if (!listaUgovora.contains(p)) {
                    listaUgovora.add(p);
                }
            }
            return response.getExc() == null;
        } else {
            throw new Exception("Server nije aktivan");
        }
    }

    public List<JeSponzor> vratiListuJeSponzor(Projekat projekat) throws Exception {
        List<JeSponzor> lista = new ArrayList<>();
        String obj = JSONFormat.toJson(projekat);
        Request request = new Request(komunikacija.Operacija.UCITAJ_JESPONZOR_PROJEKTA, obj);
        if (sender.isAlive()) {
            sender.send(request);
            Response response = (Response) receiver.receive();
            lista = (List<JeSponzor>) response.getOdgovor();
            if (response.getExc() != null) {
                return null;
            }
            return lista;
        } else {
            throw new Exception("Server nije aktivan");
        }
    }

    public List<Aktivnost> vratiListuAktivnost(Projekat projekat) throws Exception {
        List<Aktivnost> lista = new ArrayList<>();
        String obj = JSONFormat.toJson(projekat);
        Request request = new Request(komunikacija.Operacija.UCITAJ_AKTIVNOST_PROJEKTA, obj);
        if (sender.isAlive()) {
            sender.send(request);
            Response response = (Response) receiver.receive();
            lista = (List<Aktivnost>) response.getOdgovor();
            if (response.getExc() != null) {
                return null;
            }
            return lista;
        } else {
            throw new Exception("Server nije aktivan");
        }
    }

    public boolean kreirajProjektniUgovor(Projekat ugovor) throws Exception {
        String obj = JSONFormat.toJson(ugovor);
        Request request = new Request(Operacija.KREIRAJ_UGOVOR, obj);
        if (sender.isAlive()) {
            sender.send(request);
            Response response = (Response) receiver.receive();
            return response.getExc() == null;
        } else {
            throw new Exception("Server nije aktivan");
        }
    }

    public boolean kreirajAktivnost(Aktivnost aktivnosti) throws Exception {
        String obj = JSONFormat.toJson(aktivnosti);
        Request request = new Request(Operacija.KREIRAJ_AKTIVNOST, obj);
        if (sender.isAlive()) {
            sender.send(request);
            Response response = (Response) receiver.receive();
            return response.getExc() == null;
        } else {
            throw new Exception("Server nije aktivan");
        }
    }

    public boolean kreirajJeSponzor(JeSponzor js) throws Exception {
        String obj = JSONFormat.toJson(js);
        Request request = new Request(Operacija.KREIRAJ_JESPONZOR, obj);
        if (sender.isAlive()) {
            sender.send(request);
            Response response = (Response) receiver.receive();
            return response.getExc() == null;
        } else {
            throw new Exception("Server nije aktivan");
        }
    }

    public boolean promeniAktivnost(Aktivnost aktivnost) throws Exception {
        String obj = JSONFormat.toJson(aktivnost);
        Request request = new Request(Operacija.PROMENI_AKTIVNOST, obj);
        if (sender.isAlive()) {
            sender.send(request);
            Response response = (Response) receiver.receive();
            return response.getExc() == null;
        } else {
            throw new Exception("Server nije aktivan");
        }
    }

}
