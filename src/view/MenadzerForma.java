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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import model.Menadzer;
import modeliTabela.MenadzerModelTabele;
//import modeliTabela.MenadzerModelTabele;

/**
 *
 * @author Korisnik
 */
public class MenadzerForma extends javax.swing.JFrame {

    /**
     * Creates new form MenadzerForma
     */
    public MenadzerForma() {
        initComponents();
        setTitle("Menadzeri");

        popuniTabelu();
        setDefaultCloseOperation(MenadzerForma.DISPOSE_ON_CLOSE);
        osluskivanje();
    }

    public JTable getjTableMenadzeri() {
        return jTableMenadzeri;
    }

    public void setjTableMenadzeri(JTable jTableMenadzeri) {
        this.jTableMenadzeri = jTableMenadzeri;
    }

    public JTextField getjTextFieldIP() {
        return jTextFieldIP;
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonDetalji = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldIP = new javax.swing.JTextField();
        jButtonPretrazi = new javax.swing.JButton();
        jButtonOcisti = new javax.swing.JButton();
        jButtonNazad = new javax.swing.JButton();
        jScrollPaneTab1 = new javax.swing.JScrollPane();
        jTableMenadzeri = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonDetalji.setText("Detalji");
        jButtonDetalji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDetaljiActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Kriterijumi pretrage");

        jLabel2.setText("Ime i prezime");

        jButtonPretrazi.setText("Pretrazi");
        jButtonPretrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPretraziActionPerformed(evt);
            }
        });

        jButtonOcisti.setText("Ocisti filter");
        jButtonOcisti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOcistiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jButtonPretrazi, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonOcisti))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldIP, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(145, 145, 145)))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPretrazi)
                    .addComponent(jButtonOcisti))
                .addGap(24, 24, 24))
        );

        jButtonNazad.setText("Nazad");
        jButtonNazad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNazadActionPerformed(evt);
            }
        });

        jTableMenadzeri.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPaneTab1.setViewportView(jTableMenadzeri);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPaneTab1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonNazad)
                    .addComponent(jButtonDetalji))
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jScrollPaneTab1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(71, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonDetalji)
                        .addGap(53, 53, 53)
                        .addComponent(jButtonNazad)
                        .addGap(106, 106, 106))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDetaljiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDetaljiActionPerformed

        int sel = jTableMenadzeri.getSelectedRow();

        if (sel == -1) {
            JOptionPane.showMessageDialog(this, "Odaberite menadzera", "Greska", JOptionPane.ERROR_MESSAGE);
            return;
        }
        MenadzerModelTabele mmt = (MenadzerModelTabele) jTableMenadzeri.getModel();
        Menadzer menadzer = mmt.getLista().get(sel);
        Cordinator.getInstance().otvoriMenadzerNalogFormu(menadzer, false, false);

    }//GEN-LAST:event_jButtonDetaljiActionPerformed

    private void jButtonPretraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPretraziActionPerformed
//
//        String imePrezime = jTextFieldIP.getText();
//
//        if (imePrezime.isEmpty() || !imePrezime.matches("^[A-Z][a-zA-Z ]*$")) {
//            JOptionPane.showMessageDialog(this, "Proverite unesene podatke", "Greska", JOptionPane.ERROR_MESSAGE);
//            jTextFieldIP.setBorder(new LineBorder(Color.RED, 3));
//            return;
//        }
//
//        Menadzer kriterijumMen = new Menadzer();
//
//        kriterijumMen.setImePrezime(imePrezime);
//        List<Menadzer> lista = new ArrayList<>();
//
//        boolean uspesno = Controller.getInstance().vratiListuMenadzer(kriterijumMen, lista);
//        if (uspesno) {
//            MenadzerModelTabele mmt = new MenadzerModelTabele(lista);
//            jTableMenadzeri.setModel(mmt);
//            jTextFieldIP.setBorder(new LineBorder(Color.BLACK));
//        } else {
//            JOptionPane.showMessageDialog(this, "Sistem ne moze da nadje menadzera", "Greska", JOptionPane.ERROR_MESSAGE);
//        }


    }//GEN-LAST:event_jButtonPretraziActionPerformed

    private void jButtonNazadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNazadActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonNazadActionPerformed

    private void jButtonOcistiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOcistiActionPerformed
//        jTextFieldIP.setText("");
//        popuniTabelu();
    }//GEN-LAST:event_jButtonOcistiActionPerformed

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
//            java.util.logging.Logger.getLogger(MenadzerForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MenadzerForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MenadzerForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MenadzerForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MenadzerForma().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDetalji;
    private javax.swing.JButton jButtonNazad;
    private javax.swing.JButton jButtonOcisti;
    private javax.swing.JButton jButtonPretrazi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPaneTab1;
    private javax.swing.JTable jTableMenadzeri;
    private javax.swing.JTextField jTextFieldIP;
    // End of variables declaration//GEN-END:variables

    private void popuniTabelu() {

//        List<Menadzer> lista = new ArrayList<>();
//        boolean uspesno = Controller.getInstance().vratiListuSviMenadzer(lista);
//        if (uspesno) {
//            MenadzerModelTabele mmt = new MenadzerModelTabele(lista);
//            jTableMenadzeri.setModel(mmt);
//
//        } else {
//            JOptionPane.showMessageDialog(this, "Sistem ne moze da ucita listu menadzera", "Greska", JOptionPane.ERROR_MESSAGE);
//        }
    }

    private void osluskivanje() {
//        jTextFieldIP.addFocusListener(new FocusListener() {
//            @Override
//            public void focusGained(FocusEvent e) {
//
//                jTextFieldIP.setBorder(new LineBorder(Color.black, 1));
//
//            }
//
//            @Override
//            public void focusLost(FocusEvent e) {
//            }
//
//        });
    }

    public void pretraziActionListener(ActionListener actionListener) {
        jButtonPretrazi.addActionListener(actionListener);
    }

    public void ocistiFilterActionListener(ActionListener actionListener) {
        jButtonOcisti.addActionListener(actionListener);
    }
    

}
