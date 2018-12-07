/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterfazGrafica;
import java.io.*;
import javax.swing.JOptionPane;
/**
 *
 * @author juan carlos,fernanda, esteban
 * @version 7/12/2018
 */
public class Levels extends javax.swing.JDialog  {

    /**
     * Creates new form Levels
     * @param parent
     * @param modal
     */
    public Levels(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btBack = new javax.swing.JButton();
        lbInstructions = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btVhard = new javax.swing.JButton();
        btHard = new javax.swing.JButton();
        btEasy = new javax.swing.JButton();
        btMedium = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btBack.setText("Volver");
        btBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });

        lbInstructions.setFont(new java.awt.Font("Eras Medium ITC", 1, 18)); // NOI18N
        lbInstructions.setText("Escoja Un Nivel De Dificultad");

        btVhard.setText("Muy Difícil");
        btVhard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btVhard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVhardActionPerformed(evt);
            }
        });

        btHard.setText("Difícil");
        btHard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btHard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHardActionPerformed(evt);
            }
        });

        btEasy.setText("Fácil");
        btEasy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btEasy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEasyActionPerformed(evt);
            }
        });

        btMedium.setText("Medio");
        btMedium.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btMedium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMediumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btEasy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btMedium, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btHard, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btVhard, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEasy, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btHard, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btMedium, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btVhard, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lbInstructions)
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btBack)
                .addGap(156, 156, 156))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbInstructions)
                .addGap(37, 37, 37)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btBack)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        dispose();
    }//GEN-LAST:event_btBackActionPerformed

    private void btVhardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVhardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btVhardActionPerformed

    private void btHardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btHardActionPerformed

    private void btEasyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEasyActionPerformed
        Crossword easy=new Crossword(this,true);
        //dispose();//creo que hace falta?
        easy.setVisible(true);
    }//GEN-LAST:event_btEasyActionPerformed

    private void btMediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMediumActionPerformed
        Crossword easy=new Crossword(this,true);
        //dispose();//creo que hace falta?
        easy.setVisible(true);
    }//GEN-LAST:event_btMediumActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBack;
    private javax.swing.JButton btEasy;
    private javax.swing.JButton btHard;
    private javax.swing.JButton btMedium;
    private javax.swing.JButton btVhard;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbInstructions;
    // End of variables declaration//GEN-END:variables
}
