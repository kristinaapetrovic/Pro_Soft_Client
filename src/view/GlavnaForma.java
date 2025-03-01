/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import condinator.Cordinator;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JLabel;
import language.LanguageManager;

/**
 *
 *
 * @author Korisnik
 */
public class GlavnaForma extends javax.swing.JFrame {

    /**
     * Creates new form GlavnaForma
     */
    public GlavnaForma() {
        initComponents();
        setTitle(LanguageManager.getString("main_form_title"));
        setLocationRelativeTo(null);
        setLabels();
        //jLabelIPM.setText(Controller.getInstance().getUlogovani().toString());

        setDefaultCloseOperation(GlavnaForma.DISPOSE_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                new PrijavaForma().setVisible(true);
            }
        });
    }

    public JLabel getjLabelIPM() {
        return jLabelIPM;
    }

    public void setjLabelIPM(JLabel jLabelIPM) {
        this.jLabelIPM = jLabelIPM;
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
        jLabelMenadzeri = new javax.swing.JLabel();
        jButtonMenadzeri = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabelProjekti = new javax.swing.JLabel();
        jButtonProjekti = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabelSponzori = new javax.swing.JLabel();
        jButtonSponzori = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabelDobrodosli = new javax.swing.JLabel();
        jLabelIPM = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuNalog = new javax.swing.JMenu();
        jMenuItemMojNalog = new javax.swing.JMenuItem();
        jMenuItemOdjaviSe = new javax.swing.JMenuItem();
        jMenuPodesavanja = new javax.swing.JMenu();
        jMenuItemMesto = new javax.swing.JMenuItem();
        jMenuItemSS = new javax.swing.JMenuItem();
        jMenuItemVA = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelMenadzeri.setText("Pogledajte menadzere");

        jButtonMenadzeri.setText("Menadzeri");
        jButtonMenadzeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenadzeriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabelMenadzeri, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonMenadzeri)
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMenadzeri)
                    .addComponent(jButtonMenadzeri))
                .addGap(24, 24, 24))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelProjekti.setText("Pogledajte projekte");

        jButtonProjekti.setText("Projekti");
        jButtonProjekti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProjektiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabelProjekti, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonProjekti, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProjekti)
                    .addComponent(jButtonProjekti))
                .addGap(30, 30, 30))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelSponzori.setText("Pogledajte sponzore");

        jButtonSponzori.setText("Sponzori");
        jButtonSponzori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSponzoriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabelSponzori, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                .addComponent(jButtonSponzori, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSponzori)
                    .addComponent(jButtonSponzori))
                .addGap(31, 31, 31))
        );

        jLabelDobrodosli.setText("Dobrodosli, ");

        jLabelIPM.setText("menadzer ip");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabelDobrodosli)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelIPM, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDobrodosli, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(jLabelIPM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jMenuNalog.setText("Nalog");

        jMenuItemMojNalog.setText("Moj nalog");
        jMenuItemMojNalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMojNalogActionPerformed(evt);
            }
        });
        jMenuNalog.add(jMenuItemMojNalog);

        jMenuItemOdjaviSe.setText("Odjavi se");
        jMenuItemOdjaviSe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemOdjaviSeActionPerformed(evt);
            }
        });
        jMenuNalog.add(jMenuItemOdjaviSe);

        jMenuBar1.add(jMenuNalog);

        jMenuPodesavanja.setText("Podesavanja");

        jMenuItemMesto.setText("Mesto");
        jMenuItemMesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMestoActionPerformed(evt);
            }
        });
        jMenuPodesavanja.add(jMenuItemMesto);

        jMenuItemSS.setText("Strucna sprema");
        jMenuItemSS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSSActionPerformed(evt);
            }
        });
        jMenuPodesavanja.add(jMenuItemSS);

        jMenuItemVA.setText("Vrste aktivnosti");
        jMenuItemVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVAActionPerformed(evt);
            }
        });
        jMenuPodesavanja.add(jMenuItemVA);

        jMenuBar1.add(jMenuPodesavanja);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVAActionPerformed
        Cordinator.getInstance().otvoriVrstaAktivnostiFormu();
    }//GEN-LAST:event_jMenuItemVAActionPerformed

    private void jButtonMenadzeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenadzeriActionPerformed
        Cordinator.getInstance().otvoriMenadzerForma();
    }//GEN-LAST:event_jButtonMenadzeriActionPerformed

    private void jButtonProjektiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProjektiActionPerformed
        Cordinator.getInstance().otvoriProjektiFormu();
    }//GEN-LAST:event_jButtonProjektiActionPerformed

    private void jButtonSponzoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSponzoriActionPerformed
        Cordinator.getInstance().otvoriSponzorForma();


    }//GEN-LAST:event_jButtonSponzoriActionPerformed

    private void jMenuItemMojNalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMojNalogActionPerformed
        Cordinator.getInstance().otvoriMenadzerNalogFormu(Cordinator.getInstance().getUlogovani(), false, true);
    }//GEN-LAST:event_jMenuItemMojNalogActionPerformed

    private void jMenuItemOdjaviSeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemOdjaviSeActionPerformed
        Cordinator.getInstance().otvoriPrijavaFormu();

        this.dispose();
    }//GEN-LAST:event_jMenuItemOdjaviSeActionPerformed

    private void jMenuItemMestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMestoActionPerformed
        Cordinator.getInstance().otvoriMestoFormu();
    }//GEN-LAST:event_jMenuItemMestoActionPerformed

    private void jMenuItemSSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSSActionPerformed

        Cordinator.getInstance().otvoriStrucnaSpremaFormu();
    }//GEN-LAST:event_jMenuItemSSActionPerformed

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
//            java.util.logging.Logger.getLogger(GlavnaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GlavnaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GlavnaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GlavnaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new GlavnaForma().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMenadzeri;
    private javax.swing.JButton jButtonProjekti;
    private javax.swing.JButton jButtonSponzori;
    private javax.swing.JLabel jLabelDobrodosli;
    private javax.swing.JLabel jLabelIPM;
    private javax.swing.JLabel jLabelMenadzeri;
    private javax.swing.JLabel jLabelProjekti;
    private javax.swing.JLabel jLabelSponzori;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemMesto;
    private javax.swing.JMenuItem jMenuItemMojNalog;
    private javax.swing.JMenuItem jMenuItemOdjaviSe;
    private javax.swing.JMenuItem jMenuItemSS;
    private javax.swing.JMenuItem jMenuItemVA;
    private javax.swing.JMenu jMenuNalog;
    private javax.swing.JMenu jMenuPodesavanja;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables

    private void setLabels() {
        jLabelDobrodosli.setText(LanguageManager.getString("welcome"));
        jLabelMenadzeri.setText(LanguageManager.getString("view_managers"));
        jLabelProjekti.setText(LanguageManager.getString("view_projects"));
        jLabelSponzori.setText(LanguageManager.getString("view_sponsors"));
        jButtonMenadzeri.setText(LanguageManager.getString("managers"));
        jButtonProjekti.setText(LanguageManager.getString("projects"));
        jButtonSponzori.setText(LanguageManager.getString("sponsors"));
        
        jMenuNalog.setText(LanguageManager.getString("account"));
        jMenuItemMojNalog.setText(LanguageManager.getString("my_account"));
        jMenuItemOdjaviSe.setText(LanguageManager.getString("logout"));
        jMenuItemMesto.setText(LanguageManager.getString("city"));
        jMenuItemSS.setText(LanguageManager.getString("education"));
        jMenuItemVA.setText(LanguageManager.getString("act_type"));
        jMenuPodesavanja.setText(LanguageManager.getString("settings"));
    }

}
