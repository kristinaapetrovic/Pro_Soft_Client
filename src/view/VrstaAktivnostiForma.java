/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import condinator.Cordinator;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.JTextField;
import language.LanguageManager;
/**
 *
 * @author Korisnik
 */
public class VrstaAktivnostiForma extends javax.swing.JFrame {

    /**
     * Creates new form VrstaAktivnostiForma
     */
    public VrstaAktivnostiForma() {
        initComponents();
        popuniTabelu();
        setLabels();
        setTitle(LanguageManager.getString("act_type"));
        setDefaultCloseOperation(MenadzerNalogForma.DISPOSE_ON_CLOSE);
        
    }

    public JTable getjTableVA() {
        return jTableVA;
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
        jLabelKritPret = new javax.swing.JLabel();
        jLabelNaziv = new javax.swing.JLabel();
        jTextFieldNaziv = new javax.swing.JTextField();
        jButtonPretrazi = new javax.swing.JButton();
        jButtonOcistiFilter = new javax.swing.JButton();
        jButtonNazad = new javax.swing.JButton();
        jScrollPanePrviTab = new javax.swing.JScrollPane();
        jTableVA = new javax.swing.JTable();
        jButtonKreiraj = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonDetalji.setText("Detalji");
        jButtonDetalji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDetaljiActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelKritPret.setText("Kriterijum pretrage:");

        jLabelNaziv.setText("Naziv");

        jButtonPretrazi.setText("Pretrazi");
        jButtonPretrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPretraziActionPerformed(evt);
            }
        });

        jButtonOcistiFilter.setText("Obrisi filter");
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
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelKritPret, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelNaziv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonPretrazi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonOcistiFilter)))
                        .addGap(27, 27, 27))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelKritPret)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNaziv)
                    .addComponent(jTextFieldNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPretrazi)
                    .addComponent(jButtonOcistiFilter))
                .addGap(14, 14, 14))
        );

        jButtonNazad.setText("Nazad");
        jButtonNazad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNazadActionPerformed(evt);
            }
        });

        jTableVA.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPanePrviTab.setViewportView(jTableVA);

        jButtonKreiraj.setText("Kreiraj");
        jButtonKreiraj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKreirajActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPanePrviTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonDetalji)
                            .addComponent(jButtonKreiraj)
                            .addComponent(jButtonNazad))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jButtonDetalji)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonKreiraj)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonNazad)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(jScrollPanePrviTab, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonKreirajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKreirajActionPerformed
        Cordinator.getInstance().otvotiVAKreirajFormu(this,null);
    }//GEN-LAST:event_jButtonKreirajActionPerformed

    private void jButtonDetaljiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDetaljiActionPerformed

//        int selektovano = jTableVA.getSelectedRow();
//
//        if (selektovano == -1) {
//
//            JOptionPane.showMessageDialog(this, "Odaberite vrstu aktivnosti!", "Greska", JOptionPane.ERROR_MESSAGE);
//            return;
//        }
//
//        
//        VrstaAktivnostiModelTabele vamt = (VrstaAktivnostiModelTabele) jTableVA.getModel();
//        VrstaAktivnosti va=vamt  .getLista().get(selektovano);
//        VrstaAktivnostiKreirajForma vakf=new VrstaAktivnostiKreirajForma(this, true, va);
//        vakf.setVisible(true);

    }//GEN-LAST:event_jButtonDetaljiActionPerformed

    public JTextField getjTextFieldNaziv() {
        return jTextFieldNaziv;
    }

    private void jButtonPretraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPretraziActionPerformed
//        String naziv = jTextFieldNaziv.getText();
//
//        if (naziv.isEmpty()) {
//            JOptionPane.showMessageDialog(this, "Unesite kriterijum pretrage", "Greska", JOptionPane.ERROR_MESSAGE);
//            return;
//        }
//
//        if ((!naziv.isEmpty() && !naziv.matches("^[a-zA-Z ]+$"))) {
//            JOptionPane.showMessageDialog(this, "Proverite unete podatke", "Greska", JOptionPane.ERROR_MESSAGE);
//            return;
//        }
//
//        VrstaAktivnosti vakt = new VrstaAktivnosti(0, naziv, false);
//        List<VrstaAktivnosti> lista = new ArrayList<>();
//        boolean uspesno = Controller.getInstance().vratiListuVrstaAktivnosti(vakt, lista);
//        if (uspesno) {
//            VrstaAktivnostiModelTabele vamt = new VrstaAktivnostiModelTabele(lista);
//            jTableVA.setModel(vamt);
//
//        } else {
//            JOptionPane.showMessageDialog(this, "Sistem ne moze da nadje vrstu aktivnosti", "Greska", JOptionPane.ERROR_MESSAGE);
//        }


    }//GEN-LAST:event_jButtonPretraziActionPerformed

    private void jButtonNazadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNazadActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonNazadActionPerformed

    private void jButtonOcistiFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOcistiFilterActionPerformed
//        jTextFieldNaziv.setText("");
//        popuniTabelu();
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
            java.util.logging.Logger.getLogger(VrstaAktivnostiForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VrstaAktivnostiForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VrstaAktivnostiForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VrstaAktivnostiForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VrstaAktivnostiForma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDetalji;
    private javax.swing.JButton jButtonKreiraj;
    private javax.swing.JButton jButtonNazad;
    private javax.swing.JButton jButtonOcistiFilter;
    private javax.swing.JButton jButtonPretrazi;
    private javax.swing.JLabel jLabelKritPret;
    private javax.swing.JLabel jLabelNaziv;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPanePrviTab;
    private javax.swing.JTable jTableVA;
    private javax.swing.JTextField jTextFieldNaziv;
    // End of variables declaration//GEN-END:variables

    public void popuniTabelu() {
//        List<VrstaAktivnosti> lista = new ArrayList<>();
//        boolean uspesno = Controller.getInstance().vratiListuSviVrstaAktivnosti(lista);
//        if (uspesno) {
//            VrstaAktivnostiModelTabele vamt = new VrstaAktivnostiModelTabele(lista);
//            jTableVA.setModel(vamt);
//            
//        } else {
//            JOptionPane.showMessageDialog(this, "Sistem ne moze da ucita listu strucnih sprema", "Greska", JOptionPane.ERROR_MESSAGE);
//        }
    }

    public void filterActionListener(ActionListener actionListener) {
        jButtonPretrazi.addActionListener(actionListener);
    }

    public void ocistiActionListener(ActionListener actionListener) {
        jButtonOcistiFilter.addActionListener(actionListener);
    }

    public void detaljiActionListener(ActionListener actionListener) {
        jButtonDetalji.addActionListener(actionListener);
    }

    private void setLabels() {
        jLabelKritPret.setText(LanguageManager.getString("criteria"));
        jLabelNaziv.setText(LanguageManager.getString("act_type_name"));
        
        jButtonDetalji.setText(LanguageManager.getString("details_button"));
        jButtonKreiraj.setText(LanguageManager.getString("create_button"));
        jButtonNazad.setText(LanguageManager.getString("back_button"));
        jButtonOcistiFilter.setText(LanguageManager.getString("remove_criteria_button"));
        jButtonPretrazi.setText(LanguageManager.getString("search_button"));
       
    }

    

   
}
