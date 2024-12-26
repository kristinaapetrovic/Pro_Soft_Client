/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllerForme;

import condinator.Cordinator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.ModuleLayer.Controller;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.MSS;
import model.Menadzer;
import model.StrucnaSprema;
import modeliTabela.MSSModelTabele;
import modeliTabela.StrucnaSpremaModelTabele;
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
        addActionListener();
    }

    private void popuniComboBox() {
        List<StrucnaSprema> lista = komunikacijaKlijent.Komunikacija.getInstance().ucitajStrucneSpreme();
        for (StrucnaSprema ss : lista) {
            mnf.getjComboBoxSS().addItem(ss);
        }
    }

    private void popuniTabelu() {
        List<MSS> lista = komunikacijaKlijent.Komunikacija.getInstance().vratiListuMSS(mnf.getMen());
        MSSModelTabele mssmt = new MSSModelTabele(lista);
        mnf.getjTableSS().setModel(mssmt);
    }

    private void addActionListener() {
        mnf.dodajSSActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StrucnaSprema ss = (StrucnaSprema) mnf.getjComboBoxSS().getSelectedItem();
                String datum = mnf.getjTextFieldDatumRodj().getText();

                if (ss == null || datum.isEmpty()) {
                    JOptionPane.showMessageDialog(mnf, "Izaberite strucnu spremu", "Greska", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                Date datumSS = null;
                SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
                try {
                    datumSS = format.parse(datum);
                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(mnf, "Proverite format datuma", "Greska", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (mnf.isRegistracija()) {
                    ubaciUListu(ss, datumSS);

                } else {
                    ubaciUBazu(ss, datumSS);
                }
            }

            private void ubaciUListu(StrucnaSprema ss, Date datumSS) {
                MSS mss = new MSS(null, ss, false, datumSS);
                MSSModelTabele ssmt = (MSSModelTabele) mnf.getjTableSS().getModel();
                if (!ssmt.getLista().contains(mss)) {
                    ssmt.dodajElement(mss);
                    JOptionPane.showMessageDialog(mnf, "Strucna sprema je uspesno dodata", "Obavestenje", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(mnf, "Strucna sprema je vec uneta", "Greska", JOptionPane.ERROR_MESSAGE);
                }
            }

            private void ubaciUBazu(StrucnaSprema ss, Date datumSS) {
                Menadzer men = Cordinator.getInstance().getUlogovani();
                MSS mss = new MSS(men, ss, false, datumSS);
                boolean uspesno = komunikacijaKlijent.Komunikacija.getInstance().kreirajMSS(mss);
                MSSModelTabele mssmt = (MSSModelTabele) mnf.getjTableSS().getModel();
                if (uspesno) {
                    mssmt.dodajElement(mss);
                    JOptionPane.showMessageDialog(mnf, "Strucna sprema je uspesno dodata", "Obavestenje", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(mnf, "Greska pri unosu strucne spreme", "Greska", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        mnf.obrisiActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int selektovana = mnf.getjTableSS().getSelectedRow();
                if (selektovana == -1) {
                    JOptionPane.showMessageDialog(mnf, "Odaberite strucnu spremu", "Greska", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                int odgovor = JOptionPane.showConfirmDialog(mnf, "Da li zelite da obrisete strucnu spremu?", "Provera", JOptionPane.YES_NO_OPTION);
                if (odgovor != JOptionPane.YES_OPTION) {
                    return;
                }

                MSSModelTabele mssmt = (MSSModelTabele) mnf.getjTableSS().getModel();
                MSS mss = mssmt.getLista().get(selektovana);
                if (mnf.isRegistracija()) {
                    mssmt.ukloniElement(mss);
                } else {
                    boolean uspesno = komunikacijaKlijent.Komunikacija.getInstance().obrisiMSS(mss);
                    if (uspesno) {
                        mssmt.ukloniElement(mss);
                        JOptionPane.showMessageDialog(mnf, "Strucna sprema je uspesno obrisana", "Obavestenje", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(mnf, "Greska pri brisanju strucne spreme", "Greska", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        mnf.ugasiNalogActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int odgovor = JOptionPane.showConfirmDialog(mnf, "Kada ugasite nalog, prijava nece biti moguca.\n Potvrdite brisanje: ", "Upozorenje", JOptionPane.YES_NO_OPTION);
                if (odgovor == JOptionPane.YES_OPTION) {
                    Menadzer men = Cordinator.getInstance().getUlogovani();
                    men.setAktivanNalog(false);
                    boolean uspesno = komunikacijaKlijent.Komunikacija.getInstance().obrisiMenadzer(men);
                    if (uspesno) {
                        JOptionPane.showMessageDialog(mnf, "Dovidjenja", "Poruka", JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);
                    } else {
                        JOptionPane.showMessageDialog(mnf, "Greska pri gasenju naloga", "Greska", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        mnf.sacuvajIzmeneActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String loz1 = new String(mnf.getjPasswordFieldStara().getPassword());
                String loz2 = new String(mnf.getjPasswordFieldNova().getPassword());
                if (mnf.isRegistracija()) {
                    if (loz1.isEmpty() || loz2.isEmpty()) {
                        JOptionPane.showMessageDialog(mnf, "Unesite nove lozinke!", "Greska", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    MSSModelTabele ssmt = (MSSModelTabele) mnf.getjTableSS().getModel();
                    List<MSS> lista = ssmt.getLista();
                    if (loz1.equals(loz2)) {
                        ubaciMenadzera(loz1);
                        ubaciMSS(lista);
                        JOptionPane.showMessageDialog(mnf, "Vas nalog je uspesno konfigurisan", "Obavestenje", JOptionPane.INFORMATION_MESSAGE);
                        mnf.dispose();
                        Cordinator.getInstance().otvoriGlavnuFormu();

                    } else {
                        JOptionPane.showMessageDialog(mnf, "Lozike nisu iste!", "Greska", JOptionPane.ERROR_MESSAGE);
                    }

                } else {

                    proveriPromenuLozinke(loz1, loz2);
                    JOptionPane.showMessageDialog(mnf, "Vas nalog je uspesno konfigurisan", "Obavestenje", JOptionPane.INFORMATION_MESSAGE);

                }
            }

            private void proveriPromenuLozinke(String loz1, String loz2) {
                Menadzer men = Cordinator.getInstance().getUlogovani();
                if (loz1.isEmpty() && loz2.isEmpty()) {
                    mnf.dispose();
                } else if (!loz1.isEmpty() && !loz2.isEmpty()) {
                    String kriptovana = null;
                    try {
                        kriptovana = hashing.Hash.kriptuj(loz1);
                    } catch (NoSuchAlgorithmException ex) {
                        Logger.getLogger(MenadzerNalogFromaController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if (men.getLozinka().equals(kriptovana)) {
                        if (promeniLozinku(loz2)) {
                            JOptionPane.showMessageDialog(mnf, "Lozinka je uspesno promenjena", "Obavestenje", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(mnf, "Unesite staru i novu lozinku!", "Upozorenje", JOptionPane.ERROR_MESSAGE);
                }

            }

            private void ubaciMenadzera(String loz1) {
                String kriptovana = null;
                try {
                    kriptovana = hashing.Hash.kriptuj(loz1);
                } catch (NoSuchAlgorithmException ex) {
                    Logger.getLogger(MenadzerNalogFromaController.class.getName()).log(Level.SEVERE, null, ex);
                }
                Menadzer men = Cordinator.getInstance().getUlogovani();
                men.setLozinka(kriptovana);
                men.setPrviLog(false);
                Cordinator.getInstance().setUlogovani(men);
                boolean uspesno = komunikacijaKlijent.Komunikacija.getInstance().promeniMenadzer(men);
                if (uspesno) {
                    JOptionPane.showMessageDialog(mnf, "Usesno ste podesili svoj nalog!", "Obavestenje", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(mnf, "Greska pri kreiranju naloga", "Greska", JOptionPane.ERROR_MESSAGE);
                }
            }

            private void ubaciMSS(List<MSS> lista) {
                for (MSS mss : lista) {
                    mss.setMenadzer(Cordinator.getInstance().getUlogovani());
                    if (!komunikacijaKlijent.Komunikacija.getInstance().kreirajMSS(mss)) {
                        JOptionPane.showMessageDialog(mnf, "Neuspesno ubacivanje strucnih sprema", "Greska", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
                if (!lista.isEmpty()) {
                    JOptionPane.showMessageDialog(mnf, "Uspesno ubacivanje strucnih sprema", "Obavestenje", JOptionPane.INFORMATION_MESSAGE);
                }
            }

            private boolean promeniLozinku(String loz2) {
                Menadzer men = Cordinator.getInstance().getUlogovani();

                try {
                    men.setLozinka(hashing.Hash.kriptuj(loz2));
                } catch (NoSuchAlgorithmException ex) {
                    Logger.getLogger(MenadzerNalogFromaController.class.getName()).log(Level.SEVERE, null, ex);
                }
                return komunikacijaKlijent.Komunikacija.getInstance().promeniMenadzer(men);
            }
        }
        );
    }

}
