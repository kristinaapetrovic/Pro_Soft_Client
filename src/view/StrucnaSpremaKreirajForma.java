/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import condinator.Cordinator;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import language.LanguageManager;
import model.StrucnaSprema;

/**
 *
 * @author Korisnik
 */
public class StrucnaSpremaKreirajForma extends javax.swing.JDialog {

    private StrucnaSpremaForma roditelj;
    private StrucnaSprema strucnaSprema;

    /**
     * Creates new form StrucnaSpremaKreirajForma
     */
    public StrucnaSpremaKreirajForma(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLabels();
        setTitle(LanguageManager.getString("create_education_title"));
        roditelj = (StrucnaSpremaForma) parent;
        popuniFormuKreiraj();
    }

    public StrucnaSpremaKreirajForma(java.awt.Frame parent, boolean modal, StrucnaSprema strucnaSprema) {
        super(parent, modal);
        initComponents();
        setLabels();
        setTitle(LanguageManager.getString("update_education_title"));
        this.strucnaSprema = strucnaSprema;
        roditelj = (StrucnaSpremaForma) parent;
        popuniFormuDetalji();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNaziv = new javax.swing.JLabel();
        jTextFieldNaziv = new javax.swing.JTextField();
        jButtonKreiraj = new javax.swing.JButton();
        jButtonIzmeni = new javax.swing.JButton();
        jButtonSacuvaj = new javax.swing.JButton();
        jButtonObrisi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelNaziv.setText("Naziv strucne spreme");

        jButtonKreiraj.setText("Kreiraj");
        jButtonKreiraj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKreirajActionPerformed(evt);
            }
        });

        jButtonIzmeni.setText("Izmeni");
        jButtonIzmeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIzmeniActionPerformed(evt);
            }
        });

        jButtonSacuvaj.setText("Sacuvaj");
        jButtonSacuvaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSacuvajActionPerformed(evt);
            }
        });

        jButtonObrisi.setText("Obrisi");
        jButtonObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonObrisiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jTextFieldNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonIzmeni)
                        .addGap(49, 49, 49)
                        .addComponent(jButtonSacuvaj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(jButtonObrisi)
                        .addGap(40, 40, 40)
                        .addComponent(jButtonKreiraj)
                        .addGap(31, 31, 31))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabelNaziv)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonKreiraj)
                    .addComponent(jButtonIzmeni)
                    .addComponent(jButtonSacuvaj)
                    .addComponent(jButtonObrisi))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonKreirajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKreirajActionPerformed
        String naziv = jTextFieldNaziv.getText();

        if (!validacija(naziv)) {
            JOptionPane.showMessageDialog(this, LanguageManager.getString("check_data"), LanguageManager.getString("error"), JOptionPane.ERROR_MESSAGE);
            jTextFieldNaziv.setBorder(new LineBorder(Color.RED, 3));
            return;
        }
        if (ubaciUbazu(naziv)) {
            JOptionPane.showMessageDialog(this, LanguageManager.getString("create_education_succes"), LanguageManager.getString("success"), JOptionPane.INFORMATION_MESSAGE);
            Cordinator.getInstance().getStrucnaSpremaForma().azurirajTabelu();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, LanguageManager.getString("create_education_error"), LanguageManager.getString("error"), JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonKreirajActionPerformed

    private void jButtonIzmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIzmeniActionPerformed

        jTextFieldNaziv.setEnabled(true);
        jButtonSacuvaj.setEnabled(true);
        jButtonObrisi.setEnabled(false);

    }//GEN-LAST:event_jButtonIzmeniActionPerformed

    private void jButtonSacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSacuvajActionPerformed
        String naziv = jTextFieldNaziv.getText();

        if (!validacija(naziv)) {
            JOptionPane.showMessageDialog(this, LanguageManager.getString("check_data"), LanguageManager.getString("error"), JOptionPane.ERROR_MESSAGE);
            jTextFieldNaziv.setBorder(new LineBorder(Color.RED, 3));
            return;
        }
        if (izmeniSS(naziv)) {
            JOptionPane.showMessageDialog(this, LanguageManager.getString("update_education_succes"), LanguageManager.getString("success"), JOptionPane.INFORMATION_MESSAGE);
            Cordinator.getInstance().getStrucnaSpremaForma().azurirajTabelu();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this,  LanguageManager.getString("update_education_error"), LanguageManager.getString("error"), JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jButtonSacuvajActionPerformed

    private void jButtonObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonObrisiActionPerformed

        int odgovor = JOptionPane.showConfirmDialog(this, LanguageManager.getString("delete_education_question"), LanguageManager.getString("confirmation"), JOptionPane.YES_NO_OPTION);
        if (odgovor != JOptionPane.YES_OPTION) {
            return;
        }
        obrisiSS(strucnaSprema);
        this.dispose();

    }//GEN-LAST:event_jButtonObrisiActionPerformed

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
//            java.util.logging.Logger.getLogger(StrucnaSpremaKreirajForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(StrucnaSpremaKreirajForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(StrucnaSpremaKreirajForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(StrucnaSpremaKreirajForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                StrucnaSpremaKreirajForma dialog = new StrucnaSpremaKreirajForma(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIzmeni;
    private javax.swing.JButton jButtonKreiraj;
    private javax.swing.JButton jButtonObrisi;
    private javax.swing.JButton jButtonSacuvaj;
    private javax.swing.JLabel jLabelNaziv;
    private javax.swing.JTextField jTextFieldNaziv;
    // End of variables declaration//GEN-END:variables
    private boolean validacija(String naziv) {
        return naziv.matches("^[A-Z][a-zA-Z ]*$");
    }

    private boolean ubaciUbazu(String naziv) {
        StrucnaSprema ss = new StrucnaSprema(0, naziv, false);
        return komunikacijaKlijent.Komunikacija.getInstance().kreirajStrucnaSprema(ss);

    }

    private void popuniFormuKreiraj() {
        jButtonIzmeni.setVisible(false);
        jButtonObrisi.setVisible(false);
        jButtonSacuvaj.setVisible(false);
    }

    private void popuniFormuDetalji() {

        jTextFieldNaziv.setText(strucnaSprema.getNazivStrucnaSprema());
        jTextFieldNaziv.setEnabled(false);
        jButtonSacuvaj.setEnabled(false);
        jButtonKreiraj.setVisible(false);

    }

    private boolean izmeniSS(String naziv) {
        this.strucnaSprema.setNazivStrucnaSprema(naziv);
        return komunikacijaKlijent.Komunikacija.getInstance().promeniStrucnaSprema(strucnaSprema);
  
        
    }

    private void obrisiSS(StrucnaSprema ss) {

        if (obrisiIzBaze(ss)) {
            Cordinator.getInstance().getStrucnaSpremaForma().azurirajTabelu();

        }

    }

    private boolean obrisiIzBaze(StrucnaSprema ss) {
        ss.setObrisana(true);
        boolean uspesno = komunikacijaKlijent.Komunikacija.getInstance().obrisiStrucnaSprema(strucnaSprema);
        if (uspesno) {
            JOptionPane.showMessageDialog(this,LanguageManager.getString("delete_education_success"), LanguageManager.getString("success"), JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else {
            JOptionPane.showMessageDialog(this, LanguageManager.getString("delete_education_error"), LanguageManager.getString("error"), JOptionPane.ERROR_MESSAGE);
            return false;
        }

    }

    private void setLabels() {
        jLabelNaziv.setText(LanguageManager.getString("education_name"));
        
        jButtonIzmeni.setText(LanguageManager.getString("update_button"));
        jButtonKreiraj.setText(LanguageManager.getString("create_button"));
        jButtonObrisi.setText(LanguageManager.getString("delete_button"));
        jButtonSacuvaj.setText(LanguageManager.getString("save_changes_button"));
    }
}
