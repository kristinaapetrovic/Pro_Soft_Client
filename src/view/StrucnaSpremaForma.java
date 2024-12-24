/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;


import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import model.StrucnaSprema;

/**
 *
 * @author Korisnik
 */
public class StrucnaSpremaForma extends javax.swing.JFrame {

    /**
     * Creates new form StrucnaSpremaForma
     */
    public StrucnaSpremaForma() {
        initComponents();
        setLocationRelativeTo(null);
        
        setTitle("Strucne spreme");
        popuniTabelu();
        setDefaultCloseOperation(MenadzerNalogForma.DISPOSE_ON_CLOSE);
    }

    public JTable getjTableSS() {
        return jTableSS;
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
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNaziv = new javax.swing.JTextField();
        jButtonPretrazi = new javax.swing.JButton();
        jButtonOcistiFilter = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPanePrviTab = new javax.swing.JScrollPane();
        jTableSS = new javax.swing.JTable();
        jButtonKreiraj = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonDetalji.setText("Detalji");
        jButtonDetalji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDetaljiActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Kriterijumi pretrage");

        jLabel3.setText("Naziv");

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
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(jTextFieldNaziv))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonPretrazi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                                .addComponent(jButtonOcistiFilter)))
                        .addGap(38, 38, 38))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPretrazi)
                    .addComponent(jButtonOcistiFilter))
                .addGap(14, 14, 14))
        );

        jButton1.setText("Nazad");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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
        jScrollPanePrviTab.setViewportView(jTableSS);

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
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPanePrviTab, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonDetalji)
                    .addComponent(jButtonKreiraj)
                    .addComponent(jButton1))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jScrollPanePrviTab, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonDetalji)
                .addGap(31, 31, 31)
                .addComponent(jButtonKreiraj)
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addGap(65, 65, 65))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonKreirajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKreirajActionPerformed

        StrucnaSpremaKreirajForma sskf=new StrucnaSpremaKreirajForma(this, true);
        sskf.setVisible(true);

    }//GEN-LAST:event_jButtonKreirajActionPerformed

    private void jButtonDetaljiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDetaljiActionPerformed

//        int selektovano = jTableSS.getSelectedRow();
//
//        if (selektovano == -1) {
//            JOptionPane.showMessageDialog(this, "Odaberite strucnu spremu!", "Greska", JOptionPane.ERROR_MESSAGE);
//            return;
//        }
//        
//        StrucnaSpremaModelTabele ssmt = (StrucnaSpremaModelTabele) jTableSS.getModel();
//        StrucnaSprema ss = ssmt.getLista().get(selektovano);
//
//        StrucnaSpremaKreirajForma sskf=new StrucnaSpremaKreirajForma(this, rootPaneCheckingEnabled, ss);
//        sskf.setVisible(true);
        

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
//        StrucnaSprema ss = new StrucnaSprema(0, naziv, false);
//        List<StrucnaSprema> lista = new ArrayList<>();
//        boolean uspesno = Controller.getInstance().vratiListuStrucnaSprema(ss, lista);
//        if (uspesno) {
//            StrucnaSpremaModelTabele ssmt = new StrucnaSpremaModelTabele(lista);
//            jTableSS.setModel(ssmt);
//
//        } else {
//            JOptionPane.showMessageDialog(this, "Sistem ne moze da nadje strucnu spremu", "Greska", JOptionPane.ERROR_MESSAGE);
//        }

    }//GEN-LAST:event_jButtonPretraziActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(StrucnaSpremaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StrucnaSpremaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StrucnaSpremaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StrucnaSpremaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StrucnaSpremaForma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonDetalji;
    private javax.swing.JButton jButtonKreiraj;
    private javax.swing.JButton jButtonOcistiFilter;
    private javax.swing.JButton jButtonPretrazi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPanePrviTab;
    private javax.swing.JTable jTableSS;
    private javax.swing.JTextField jTextFieldNaziv;
    // End of variables declaration//GEN-END:variables

    public void popuniTabelu() {
//        List<StrucnaSprema> lista = new ArrayList<>();
//        boolean uspesno = Controller.getInstance().vratiListuSviStrucnaSprema(lista);
//        if (uspesno) {
//            StrucnaSpremaModelTabele ssmt = new StrucnaSpremaModelTabele(lista);
//            jTableSS.setModel(ssmt);
//          
//        } else {
//            JOptionPane.showMessageDialog(this, "Sistem ne moze da ucita listu strucnih sprema", "Greska", JOptionPane.ERROR_MESSAGE);
//        }

    }

    public void pretraziActionListener(ActionListener actionListener) {
        jButtonPretrazi.addActionListener(actionListener);
    }

    public void ocistiActionListener(ActionListener actionListener) {
        jButtonOcistiFilter.addActionListener(actionListener);
    }



    
}