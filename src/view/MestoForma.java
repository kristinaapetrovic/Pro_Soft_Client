/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;


import condinator.Cordinator;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import language.LanguageManager;
import model.Mesto;


/**
 *
 * @author Korisnik
 */
public class MestoForma extends javax.swing.JFrame {

    /**
     * Creates new form MestoForma
     */
    public MestoForma() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle(LanguageManager.getString("city"));
        setLabels();
        popuniTabelu();
        setDefaultCloseOperation(MenadzerNalogForma.DISPOSE_ON_CLOSE);
    }

    public JTable getjTableMesta() {
        return jTableMesta;
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
        jLabelKriterijum = new javax.swing.JLabel();
        jLabelPB = new javax.swing.JLabel();
        jLabelNaziv = new javax.swing.JLabel();
        jTextFieldPostanski = new javax.swing.JTextField();
        jTextFieldNaziv = new javax.swing.JTextField();
        jButtonPretrazi = new javax.swing.JButton();
        jButtonOcistiFilter = new javax.swing.JButton();
        jScrollPanePrviTab = new javax.swing.JScrollPane();
        jTableMesta = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButtonKreiraj = new javax.swing.JButton();
        jButtonDetalji = new javax.swing.JButton();
        jButtonNazad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelKriterijum.setText("Kriterijum pretrage");

        jLabelPB.setText("Postanski broj");

        jLabelNaziv.setText("Naziv");

        jButtonPretrazi.setText("Pretrazi");
        jButtonPretrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPretraziActionPerformed(evt);
            }
        });

        jButtonOcistiFilter.setText("Ocisti filter");
        jButtonOcistiFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOcistiFilterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelKriterijum, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPB, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNaziv)
                            .addComponent(jTextFieldPostanski))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonOcistiFilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonPretrazi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelKriterijum)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPB)
                    .addComponent(jTextFieldPostanski, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPretrazi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNaziv)
                    .addComponent(jTextFieldNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOcistiFilter))
                .addGap(14, 14, 14))
        );

        jTableMesta.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPanePrviTab.setViewportView(jTableMesta);

        jButtonKreiraj.setText("Kreiraj");
        jButtonKreiraj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKreirajActionPerformed(evt);
            }
        });

        jButtonDetalji.setText("Detalji");
        jButtonDetalji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDetaljiActionPerformed(evt);
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
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonNazad)
                    .addComponent(jButtonDetalji)
                    .addComponent(jButtonKreiraj))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButtonKreiraj)
                .addGap(29, 29, 29)
                .addComponent(jButtonDetalji)
                .addGap(27, 27, 27)
                .addComponent(jButtonNazad)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPanePrviTab, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPanePrviTab, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonKreirajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKreirajActionPerformed
        Cordinator.getInstance().otvoriMestoKreirajFomru(this, null);

    }//GEN-LAST:event_jButtonKreirajActionPerformed

    private void jButtonDetaljiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDetaljiActionPerformed
//        int selektovano = jTableMesta.getSelectedRow();
//        if (selektovano == -1) {
//            JOptionPane.showMessageDialog(this, "Odaberite mesto!", "Greska", JOptionPane.ERROR_MESSAGE);
//            return;
//        }
//
//        
//
//        MestoModelTabele mmt = (MestoModelTabele) jTableMesta.getModel();
//        Mesto mesto = mmt.getLista().get(selektovano);
//
//        MestoKreirajForma mkf = new MestoKreirajForma(this, true, mesto);
//        mkf.setVisible(true);

    }//GEN-LAST:event_jButtonDetaljiActionPerformed

    public JTextField getjTextFieldNaziv() {
        return jTextFieldNaziv;
    }

    public JTextField getjTextFieldPostanski() {
        return jTextFieldPostanski;
    }

    private void jButtonPretraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPretraziActionPerformed
//
//        String naziv = jTextFieldNaziv.getText();
//        String posBroj = jTextFieldPostanski.getText();
//
//        if (naziv.isEmpty() && posBroj.isEmpty()) {
//            JOptionPane.showMessageDialog(this, "Unesite barem jedan kriterijum pretrage", "Greska", JOptionPane.ERROR_MESSAGE);
//            return;
//        }
//
//        
//        if ((!naziv.isEmpty() && !naziv.matches("^[a-zA-Z ]+$")) || (!posBroj.isEmpty() && !posBroj.matches("\\d{5}"))) {
//            JOptionPane.showMessageDialog(this, "Proverite unete podatke", "Greska", JOptionPane.ERROR_MESSAGE);
//            return;
//        }
//
//        Mesto mesto = new Mesto(posBroj, naziv, false);
//        List<Mesto> lista = new ArrayList<>();
//        boolean uspesno = Controller.getInstance().vratiListuMesto(mesto, lista);
//        if (uspesno) {
//            MestoModelTabele mmt = new MestoModelTabele(lista);
//            jTableMesta.setModel(mmt);
//        } else {
//            JOptionPane.showMessageDialog(this, "Sistem ne moze da nadje mseto", "Greska", JOptionPane.ERROR_MESSAGE);
//        }


    }//GEN-LAST:event_jButtonPretraziActionPerformed

    private void jButtonNazadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNazadActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonNazadActionPerformed

    private void jButtonOcistiFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOcistiFilterActionPerformed
        jTextFieldNaziv.setText("");
        jTextFieldPostanski.setText("");
        popuniTabelu();
    }//GEN-LAST:event_jButtonOcistiFilterActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MestoForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MestoForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MestoForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MestoForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MestoForma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDetalji;
    private javax.swing.JButton jButtonKreiraj;
    private javax.swing.JButton jButtonNazad;
    private javax.swing.JButton jButtonOcistiFilter;
    private javax.swing.JButton jButtonPretrazi;
    private javax.swing.JLabel jLabelKriterijum;
    private javax.swing.JLabel jLabelNaziv;
    private javax.swing.JLabel jLabelPB;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPanePrviTab;
    private javax.swing.JTable jTableMesta;
    private javax.swing.JTextField jTextFieldNaziv;
    private javax.swing.JTextField jTextFieldPostanski;
    // End of variables declaration//GEN-END:variables

    public void popuniTabelu() {
//
//        List<Mesto> lista = new ArrayList<>();
//        boolean uspesno = Controller.getInstance().vratiListuSviMesto(lista);
//        if (uspesno) {
//            MestoModelTabele mmt = new MestoModelTabele(lista);
//            jTableMesta.setModel(mmt);
//        } else {
//            JOptionPane.showMessageDialog(this, "Sistem ne moze da ucita listu mesta", "Greska", JOptionPane.ERROR_MESSAGE);
//        }

    }

    public void pretraziActionListener(ActionListener actionListener) {
        jButtonPretrazi.addActionListener(actionListener);
    }

    public void ocistiActionListener(ActionListener actionListener) {
        jButtonOcistiFilter.addActionListener(actionListener);
    }

    public void detaljiActionListener(ActionListener actionListener) {
        jButtonDetalji.addActionListener(actionListener);
    }

    private void setLabels() {
        jLabelKriterijum.setText(LanguageManager.getString("criteria"));
        jLabelNaziv.setText(LanguageManager.getString("city_name"));
        jLabelPB.setText(LanguageManager.getString("postal_code"));
        jButtonDetalji.setText(LanguageManager.getString("details_button"));
        jButtonKreiraj.setText(LanguageManager.getString("create_button"));
        jButtonNazad.setText(LanguageManager.getString("back_button"));
        jButtonOcistiFilter.setText(LanguageManager.getString("remove_criteria_button"));
        jButtonPretrazi.setText(LanguageManager.getString("search_button"));
    }



    
}
