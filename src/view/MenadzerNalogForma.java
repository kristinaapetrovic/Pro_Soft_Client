/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import condinator.Cordinator;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import language.LanguageManager;
import model.MSS;
import model.Menadzer;
import model.StrucnaSprema;

/**
 *
 * @author Korisnik
 */
public class MenadzerNalogForma extends javax.swing.JFrame {

    private Menadzer men;
    private boolean registracija = false;

    /**
     * Creates new form MenadzerNalogForma
     */
    public Menadzer getMen() {
        return men;
    }

    public void setMen(Menadzer men) {
        this.men = men;
    }

    private void listen() {
        jTextFieldDatum.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Kada korisnik klikne na polje, brišemo tekst
                if (jTextFieldDatum.getText().equals("dd-mm-yyyy")) {
                    jTextFieldDatum.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Ako polje ostane prazno, postavljamo podrazumevani tekst
                if (jTextFieldDatum.getText().isEmpty()) {
                    jTextFieldDatum.setText("dd-mm-yyyy");
                }
            }
        });

        jTextFieldJMBG.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

                jTextFieldJMBG.setBorder(new LineBorder(Color.black, 1));

            }

            @Override
            public void focusLost(FocusEvent e) {
            }

        });
        jTextFieldImePrezime.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

                jTextFieldImePrezime.setBorder(new LineBorder(Color.black, 1));

            }

            @Override
            public void focusLost(FocusEvent e) {
            }

        });
        jTextFieldEmail.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

                jTextFieldEmail.setBorder(new LineBorder(Color.black, 1));

            }

            @Override
            public void focusLost(FocusEvent e) {
            }

        });
        jTextFieldDatumRodj.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

                jTextFieldDatumRodj.setBorder(new LineBorder(Color.black, 1));

            }

            @Override
            public void focusLost(FocusEvent e) {
            }

        });
        jTextFieldDatum.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

                jTextFieldDatum.setBorder(new LineBorder(Color.black, 1));

            }

            @Override
            public void focusLost(FocusEvent e) {
            }

        });
        jComboBoxSS.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

                jComboBoxSS.setBorder(new LineBorder(Color.black, 1));

            }

            @Override
            public void focusLost(FocusEvent e) {
            }

        });
        jPasswordFieldNova.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

                jPasswordFieldNova.setBorder(new LineBorder(Color.black, 1));

            }

            @Override
            public void focusLost(FocusEvent e) {
            }

        });
        jPasswordFieldStara.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

                jPasswordFieldStara.setBorder(new LineBorder(Color.black, 1));

            }

            @Override
            public void focusLost(FocusEvent e) {
            }

        });

    }

    public MenadzerNalogForma(Menadzer menadzer, boolean registracija) {
        initComponents();
        setLocationRelativeTo(null);
       

        setLabels();
        setTitle(LanguageManager.getString("men_acc_title"));
        this.men = menadzer;
        this.registracija = registracija;

        if (registracija) {
            inicijalizacijaReg();
        } else {
            inicijalizacija();
        }
        setDefaultCloseOperation(MenadzerNalogForma.DISPOSE_ON_CLOSE);
        listen();
    }

    public MenadzerNalogForma(Menadzer menadzer) {
        initComponents();
        setResizable(false);
       

        setLocationRelativeTo(null);
        setTitle(LanguageManager.getString("men_acc_title"));
        this.men = menadzer;
        setLabels();
        blokirajOpcije();
        setDefaultCloseOperation(MenadzerNalogForma.DISPOSE_ON_CLOSE);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSS = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabelSS = new javax.swing.JLabel();
        jComboBoxSS = new javax.swing.JComboBox<>();
        jButtonDodajSS = new javax.swing.JButton();
        jLabelDatumSS = new javax.swing.JLabel();
        jTextFieldDatum = new javax.swing.JTextField();
        jButtonObrisiSS = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabelPodaci = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabelJMBG = new javax.swing.JLabel();
        jTextFieldJMBG = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabelImePrezime = new javax.swing.JLabel();
        jTextFieldImePrezime = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabelDatumRodj = new javax.swing.JLabel();
        jTextFieldDatumRodj = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabelSL = new javax.swing.JLabel();
        jPasswordFieldStara = new javax.swing.JPasswordField();
        jPanel10 = new javax.swing.JPanel();
        jLabelNL = new javax.swing.JLabel();
        jPasswordFieldNova = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jButtonUgovori = new javax.swing.JButton();
        jButtonUgasiNalog = new javax.swing.JButton();
        jButtonSacuvaj = new javax.swing.JButton();
        jButtonIzmeni = new javax.swing.JButton();
        jButtonNazad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTableSS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableSS);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelSS.setText("Odaberite strucnu spremu/e");

        jButtonDodajSS.setText("Dodaj");
        jButtonDodajSS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDodajSSActionPerformed(evt);
            }
        });

        jLabelDatumSS.setText("Datum");

        jTextFieldDatum.setText("dd-mm-yyyy");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSS, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDatumSS, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxSS, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldDatum, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButtonDodajSS)
                        .addGap(141, 141, 141))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxSS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDatumSS)
                    .addComponent(jTextFieldDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonDodajSS)
                .addGap(20, 20, 20))
        );

        jButtonObrisiSS.setText("Obrisi strucnu spremu");
        jButtonObrisiSS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonObrisiSSActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelPodaci.setText("Podaci");

        jLabelJMBG.setText("JMBG");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabelJMBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldJMBG, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelJMBG)
                    .addComponent(jTextFieldJMBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelImePrezime.setText("Ime i prezime");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelImePrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldImePrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelImePrezime)
                    .addComponent(jTextFieldImePrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabelDatumRodj.setText("Datum rodjenja");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDatumRodj, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldDatumRodj, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDatumRodj)
                    .addComponent(jTextFieldDatumRodj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        jLabelEmail.setText("Email");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabelSL.setText("Stara lozinka");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSL, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordFieldStara, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSL)
                    .addComponent(jPasswordFieldStara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabelNL.setText("Nova lozinka");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordFieldNova, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNL)
                    .addComponent(jPasswordFieldNova, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jLabelPodaci, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 27, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabelPodaci)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonObrisiSS)
                        .addGap(132, 132, 132))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonObrisiSS))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jButtonUgovori.setText("Pogledaj ugovore");
        jButtonUgovori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUgovoriActionPerformed(evt);
            }
        });

        jButtonUgasiNalog.setText("Ugasi nalog");
        jButtonUgasiNalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUgasiNalogActionPerformed(evt);
            }
        });

        jButtonSacuvaj.setText("Sacuvaj izmene");
        jButtonSacuvaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSacuvajActionPerformed(evt);
            }
        });

        jButtonIzmeni.setText("Izmeni podatke");
        jButtonIzmeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIzmeniActionPerformed(evt);
            }
        });

        jButtonNazad.setText("Nazad");
        jButtonNazad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNazadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonIzmeni, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSacuvaj, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonUgasiNalog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonUgovori, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonNazad)
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jButtonNazad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jButtonIzmeni)
                .addGap(67, 67, 67)
                .addComponent(jButtonSacuvaj)
                .addGap(62, 62, 62)
                .addComponent(jButtonUgovori)
                .addGap(64, 64, 64)
                .addComponent(jButtonUgasiNalog)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JTextField getjTextFieldDatumRodj() {
        return jTextFieldDatumRodj;
    }

    public boolean isRegistracija() {
        return registracija;
    }

    private void jButtonDodajSSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDodajSSActionPerformed
//        StrucnaSprema ss = (StrucnaSprema) jComboBoxSS.getSelectedItem();
//        String datum = jTextFieldDatum.getText();
//
//        if (ss == null || datum.isEmpty()) {
//            JOptionPane.showMessageDialog(this, "Izaberite strucnu spremu", "Greska", JOptionPane.ERROR_MESSAGE);
//            return;
//        }
//        Date datumSS = null;
//        try {
//            datumSS = Controller.getInstance().getFormatDatuma().parse(datum);
//        } catch (ParseException ex) {
//            JOptionPane.showMessageDialog(this, "Proverite format datuma", "Greska", JOptionPane.ERROR_MESSAGE);
//            return;
//        }
//
//        if (registracija) {
//            StrucnaSpremaModelTabele ssmt = (StrucnaSpremaModelTabele) jTableSS.getModel();
//            if (!ssmt.getLista().contains(ss)) {
//                ssmt.dodajElement(ss);
//                JOptionPane.showMessageDialog(this, "Strucna sprema je uspesno dodata", "Obavestenje", JOptionPane.INFORMATION_MESSAGE);
//            } else {
//                JOptionPane.showMessageDialog(this, "Strucna sprema je vec uneta", "Greska", JOptionPane.ERROR_MESSAGE);
//                return;
//            }
//        } else {
//            MSS mss = new MSS(men, ss, false, datumSS);
//            boolean uspesno = Controller.getInstance().kreirajMSS(mss);
//            MSSModelTabele mssmt = (MSSModelTabele) jTableSS.getModel();
//            if (uspesno) {
//                mssmt.dodajElement(mss);
//                JOptionPane.showMessageDialog(this, "Strucna sprema je uspesno dodata", "Obavestenje", JOptionPane.INFORMATION_MESSAGE);
//            } else {
//                JOptionPane.showMessageDialog(this, "Greska pri unosu strucne spreme", "Greska", JOptionPane.ERROR_MESSAGE);
//            }
//        }


    }//GEN-LAST:event_jButtonDodajSSActionPerformed

    private void jButtonObrisiSSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonObrisiSSActionPerformed

//        int odgovor = JOptionPane.showConfirmDialog(this, "Da li zelite da obrisete strucnu spremu?", "Provera", JOptionPane.YES_NO_OPTION);
//        if (odgovor != JOptionPane.YES_OPTION) {
//            return;
//        }
//
//        int selektovana = jTableSS.getSelectedRow();
//        if (selektovana == -1) {
//            JOptionPane.showMessageDialog(this, "Odaberite strucnu spremu", "Greska", JOptionPane.ERROR_MESSAGE);
//            return;
//        }
//        MSSModelTabele mssmt = (MSSModelTabele) jTableSS.getModel();
//        MSS mss = mssmt.getLista().get(selektovana);
//        if (registracija) {
//            mssmt.ukloniElement(mss);
//        } else {
//
//            boolean uspesno = Controller.getInstance().obrisiMSS(mss);
//            if (uspesno) {
//                mssmt.ukloniElement(mss);
//            } else {
//                JOptionPane.showMessageDialog(this, "Greska pri brisanju strucne spreme", "Greska", JOptionPane.ERROR_MESSAGE);
//            }
//        }

    }//GEN-LAST:event_jButtonObrisiSSActionPerformed

    public JPasswordField getjPasswordFieldNova() {
        return jPasswordFieldNova;
    }

    public JPasswordField getjPasswordFieldStara() {
        return jPasswordFieldStara;
    }

    private void jButtonSacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSacuvajActionPerformed
//        String loz1 = new String(jPasswordFieldStara.getPassword());
//        String loz2 = new String(jPasswordFieldNova.getPassword());
//        if (registracija) {
//            if (loz1.isEmpty() || loz2.isEmpty()) {
//                JOptionPane.showMessageDialog(this, "Unesite nove lozinke!", "Greska", JOptionPane.ERROR_MESSAGE);
//                return;
//            }
//            MSSModelTabele ssmt = (MSSModelTabele) jTableSS.getModel();
//            List<MSS> lista = ssmt.getLista();
//            if (loz1.equals(loz2)) {
//                ubaciMenadzera(loz1);
//                ubaciMSS(lista);
//
//                JOptionPane.showMessageDialog(this, "Vas nalog je uspesno konfigurisan", "Obavestenje", JOptionPane.INFORMATION_MESSAGE);
//
//                this.dispose();
//                GlavnaForma gf = new GlavnaForma();
//                gf.setVisible(true);
//            } else {
//                JOptionPane.showMessageDialog(this, "Lozike nisu iste!", "Greska", JOptionPane.ERROR_MESSAGE);
//            }
//
//        } else {
//
//            proveriPromenuLozinke(loz1, loz2);
//            JOptionPane.showMessageDialog(this, "Vas nalog je uspesno konfigurisan", "Obavestenje", JOptionPane.INFORMATION_MESSAGE);
//
//        }


    }//GEN-LAST:event_jButtonSacuvajActionPerformed

    private void jButtonIzmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIzmeniActionPerformed
        jButtonSacuvaj.setEnabled(true);
        jLabelNL.setVisible(true);
        jLabelSL.setVisible(true);
        jPasswordFieldNova.setVisible(true);
        jPasswordFieldStara.setVisible(true);
        jButtonDodajSS.setEnabled(true);
        jButtonObrisiSS.setEnabled(true);
        jComboBoxSS.setEnabled(true);
        jButtonUgasiNalog.setEnabled(false);
        jTextFieldDatum.setEnabled(true);

    }//GEN-LAST:event_jButtonIzmeniActionPerformed

    private void jButtonUgasiNalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUgasiNalogActionPerformed
//        int odgovor = JOptionPane.showConfirmDialog(this, "Kada ugasite nalog, prijava nece biti moguca.\n Potvrdite brisanje: ", "Upozorenje", JOptionPane.YES_NO_OPTION);
//        if (odgovor == JOptionPane.YES_OPTION) {
//            Menadzer men = Controller.getInstance().getUlogovani();
//            men.setAktivanNalog(false);
//            JOptionPane.showMessageDialog(this, "Dovidjenja", "Poruka", JOptionPane.INFORMATION_MESSAGE);
//            System.exit(0);
//        } else {
//            return;
//        }

    }//GEN-LAST:event_jButtonUgasiNalogActionPerformed

    private void jButtonUgovoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUgovoriActionPerformed

        Cordinator.getInstance().otvoriProjektiFormu(men);

    }//GEN-LAST:event_jButtonUgovoriActionPerformed

    private void jButtonNazadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNazadActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonNazadActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MenadzerNalogForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MenadzerNalogForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MenadzerNalogForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MenadzerNalogForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MenadzerNalogForma().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDodajSS;
    private javax.swing.JButton jButtonIzmeni;
    private javax.swing.JButton jButtonNazad;
    private javax.swing.JButton jButtonObrisiSS;
    private javax.swing.JButton jButtonSacuvaj;
    private javax.swing.JButton jButtonUgasiNalog;
    private javax.swing.JButton jButtonUgovori;
    private javax.swing.JComboBox<StrucnaSprema> jComboBoxSS;
    private javax.swing.JLabel jLabelDatumRodj;
    private javax.swing.JLabel jLabelDatumSS;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelImePrezime;
    private javax.swing.JLabel jLabelJMBG;
    private javax.swing.JLabel jLabelNL;
    private javax.swing.JLabel jLabelPodaci;
    private javax.swing.JLabel jLabelSL;
    private javax.swing.JLabel jLabelSS;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordFieldNova;
    private javax.swing.JPasswordField jPasswordFieldStara;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableSS;
    private javax.swing.JTextField jTextFieldDatum;
    private javax.swing.JTextField jTextFieldDatumRodj;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldImePrezime;
    private javax.swing.JTextField jTextFieldJMBG;
    // End of variables declaration//GEN-END:variables

    public JComboBox<StrucnaSprema> getjComboBoxSS() {
        return jComboBoxSS;
    }

    public void setjComboBoxSS(JComboBox<StrucnaSprema> jComboBoxSS) {
        this.jComboBoxSS = jComboBoxSS;
    }

    public JTable getjTableSS() {
        return jTableSS;
    }

    public void setjTableSS(JTable jTableSS) {
        this.jTableSS = jTableSS;
    }

    private void inicijalizacijaReg() {
        jTextFieldJMBG.setText(men.getJmbg());
        jTextFieldImePrezime.setText(men.getImePrezime());
        jTextFieldEmail.setText(men.getEmail());
        jTextFieldDatumRodj.setText(new SimpleDateFormat("dd-MM-yyyy").format(men.getDatumRodjenja()));
        jButtonIzmeni.setVisible(false);
        jButtonUgasiNalog.setVisible(false);
        jButtonUgovori.setVisible(false);
        jTextFieldJMBG.setEnabled(false);
        jTextFieldImePrezime.setEnabled(false);
        jTextFieldEmail.setEnabled(false);
        jTextFieldDatumRodj.setEnabled(false);
        jLabelSL.setText(LanguageManager.getString("enter_pass"));
        jLabelNL.setText(LanguageManager.getString("enter_pass_2"));

    }

    private void ubaciMSS(List<MSS> lista) {
//        for (MSS mss : lista) {
//            if (!Controller.getInstance().kreirajMSS(mss)) {
//                JOptionPane.showMessageDialog(this, "Neuspesno ubacivanje strucnih sprema", "Greska", JOptionPane.ERROR_MESSAGE);
//                return;
//            }
//        }
//        if (!lista.isEmpty()) {
//            JOptionPane.showMessageDialog(this, "Uspesno ubacivanje strucnih sprema", "Obavestenje", JOptionPane.INFORMATION_MESSAGE);
//        }

    }

    private void ubaciMenadzera(String loz1) {

//        String kriptovana = Controller.getInstance().kriptuj(loz1);
//        if (kriptovana == null) {
//            System.out.println("greska");
//            return;
//        }
//        men.setLozinka(kriptovana);
//        men.setPrviLog(false);
//        Controller.getInstance().setUlogovani(men);
//        boolean uspesno = Controller.getInstance().promeniMenadzer(men);
//        if (uspesno) {
//            JOptionPane.showMessageDialog(this, "Usesno ste podesili svoj nalog!", "Obavestenje", JOptionPane.INFORMATION_MESSAGE);
//
//        } else {
//            JOptionPane.showMessageDialog(this, "Greska pri kreiranju naloga", "Greska", JOptionPane.ERROR_MESSAGE);
//        }
    }

    private void inicijalizacija() {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        jTextFieldDatum.setEnabled(false);
        jTextFieldJMBG.setText(men.getJmbg());
        jTextFieldImePrezime.setText(men.getImePrezime());
        jTextFieldEmail.setText(men.getEmail());
        jTextFieldDatumRodj.setText(format.format(men.getDatumRodjenja()));

        jTextFieldJMBG.setEnabled(false);
        jTextFieldImePrezime.setEnabled(false);
        jTextFieldEmail.setEnabled(false);
        jTextFieldDatumRodj.setEnabled(false);
        jButtonSacuvaj.setEnabled(false);
        jLabelNL.setVisible(false);
        jLabelSL.setVisible(false);
        jPasswordFieldNova.setVisible(false);
        jPasswordFieldStara.setVisible(false);

        jButtonDodajSS.setEnabled(false);
        jButtonObrisiSS.setEnabled(false);
        jComboBoxSS.setEnabled(false);
    }

    private void proveriPromenuLozinke(String loz1, String loz2) {
//        if (loz1.isEmpty() && loz2.isEmpty()) {
//            this.dispose();
//        } else if (!loz1.isEmpty() && !loz2.isEmpty()) {
//
//            String kriptovana = Controller.getInstance().kriptuj(loz1);
//            if (men.getLozinka().equals(kriptovana)) {
//                if (promeniLozinku(loz2)) {
//                    JOptionPane.showMessageDialog(this, "Lozinka je uspesno promenjena", "Obavestenje", JOptionPane.INFORMATION_MESSAGE);
//                }
//            }
//        } else {
//            JOptionPane.showMessageDialog(this, "Unesite staru i novu lozinku!", "Upozorenje", JOptionPane.ERROR_MESSAGE);
//        }

    }

    private boolean promeniLozinku(String loz2) {
//        men.setLozinka(Controller.getInstance().kriptuj(loz2));
//        return Controller.getInstance().promeniMenadzer(men);
//    
        return true;
    }

    private void blokirajOpcije() {

        inicijalizacija();
        jButtonIzmeni.setEnabled(false);
        jButtonUgasiNalog.setEnabled(false);

    }

    public void dodajSSActionListener(ActionListener actionListener) {
        jButtonDodajSS.addActionListener(actionListener);
    }

    public void obrisiActionListener(ActionListener actionListener) {
        jButtonObrisiSS.addActionListener(actionListener);
    }

    public void ugasiNalogActionListener(ActionListener actionListener) {
        jButtonUgasiNalog.addActionListener(actionListener);
    }

    public void sacuvajIzmeneActionListener(ActionListener actionListener) {
        jButtonSacuvaj.addActionListener(actionListener);
    }

    private void setLabels() {
        jLabelDatumRodj.setText(LanguageManager.getString("birthday"));
        jLabelEmail.setText(LanguageManager.getString("email"));
        jLabelDatumRodj.setText(LanguageManager.getString("date"));
        jLabelImePrezime.setText(LanguageManager.getString("name_surname"));
        jLabelJMBG.setText(LanguageManager.getString("umcn"));
        jLabelNL.setText(LanguageManager.getString("new_pass"));
        jLabelSL.setText(LanguageManager.getString("old_pass"));
        jLabelSS.setText(LanguageManager.getString("choose_education"));
        jLabelPodaci.setText(LanguageManager.getString("data"));

        jButtonDodajSS.setText(LanguageManager.getString("add_education_button"));
        jButtonIzmeni.setText(LanguageManager.getString("update_button"));
        jButtonNazad.setText(LanguageManager.getString("back_button"));
        jButtonObrisiSS.setText(LanguageManager.getString("delete_education_button"));
        jButtonSacuvaj.setText(LanguageManager.getString("save_changes_button"));
        jButtonUgasiNalog.setText(LanguageManager.getString("delete_acc_button"));
        jButtonUgovori.setText(LanguageManager.getString("projects"));
    }

}
