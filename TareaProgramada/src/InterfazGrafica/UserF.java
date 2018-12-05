/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterfazGrafica;

import DataBase.User;
import DataBase.UserInformation;
import FileManagerBi.ReaderManagerBinary;
import FileManagerBi.WriterManagerBinary;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class UserF extends javax.swing.JDialog {
    public static UserInformation User_Mananger;
    
    public UserF(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        lbIndication = new javax.swing.JLabel();
        lbUser = new javax.swing.JLabel();
        lbPassword = new javax.swing.JLabel();
        tfUser = new javax.swing.JTextField();
        btBack = new javax.swing.JButton();
        btNoSign = new javax.swing.JButton();
        pfPassword = new javax.swing.JPasswordField();
        btSignIn = new javax.swing.JButton();
        btLogIn = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbIndication.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbIndication.setText("Digite Su Nombre De Usuario Y Contraseña:");

        lbUser.setText("Usuario");

        lbPassword.setText("Contraseña");

        tfUser.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUserActionPerformed(evt);
            }
        });

        btBack.setText("Volver");
        btBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });

        btNoSign.setText("Sin Registro");
        btNoSign.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btNoSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNoSignActionPerformed(evt);
            }
        });

        pfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfPasswordActionPerformed(evt);
            }
        });

        btSignIn.setText("Registrarse");
        btSignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSignInActionPerformed(evt);
            }
        });

        btLogIn.setText("Log In");
        btLogIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbUser)
                .addGap(173, 173, 173))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(lbPassword))
                    .addComponent(lbIndication)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfUser, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btLogIn))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btNoSign)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSignIn)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbIndication, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lbUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btBack)
                    .addComponent(btLogIn))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNoSign)
                    .addComponent(btSignIn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUserActionPerformed

    }//GEN-LAST:event_tfUserActionPerformed

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        dispose();
    }//GEN-LAST:event_btBackActionPerformed

    private void btNoSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNoSignActionPerformed
        Levels levels = new Levels(this, true);
        JOptionPane.showMessageDialog(this, "¡A Ingresado Sin Registrarse!");
        levels.setVisible(true);
        
    }//GEN-LAST:event_btNoSignActionPerformed

    private void btLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogInActionPerformed
        
        //Metodo para logearse
        
//        ReaderManagerBinary reader = new ReaderManagerBinary();
//        try {
//            reader.open("UserFiles/UserInfo.ser");
//            for (int i = 0; i < User_Mananger.getLength(); i++) {
//            User_Mananger.addUser(reader.read());
//            }
//            if (reader.read().getNickname() == tfUser.getText())  {
//                JOptionPane.showMessageDialog(this, "Se Ha Logeado Con Exito");
//                Levels levels = new Levels(this, true);
//                levels.setVisible(true);
//            }else {
//                JOptionPane.showMessageDialog(this, "Usuario O Constraseña Incorrectos");
//            }
//            reader.close();
//        }catch (IOException ex) {
//            System.err.println("error de archivo");
//            System.err.println(ex.getMessage());
//            //ex.printStackTrace();
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(UserF.class.getName()).log(Level.SEVERE, null, ex);
//        }
        //ex.printStackTrace(); 
    }//GEN-LAST:event_btLogInActionPerformed

    private void pfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfPasswordActionPerformed
        
    }//GEN-LAST:event_pfPasswordActionPerformed

    private void btSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSignInActionPerformed
        
        User newUser = new User(tfUser, pfPassword);
        WriterManagerBinary writer = new WriterManagerBinary();
        try {
            writer.open("UserFiles/UserInfo.ser");
            writer.write(newUser);
            writer.close();
            System.err.println("Escritura Exitosa");
        }catch (IOException ex) {
            System.err.println("error de archivo");
            System.err.println(ex.getMessage());
            //ex.printStackTrace();    
        }
    }//GEN-LAST:event_btSignInActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBack;
    private javax.swing.JButton btLogIn;
    private javax.swing.JButton btNoSign;
    private javax.swing.JButton btSignIn;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lbIndication;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbUser;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JTextField tfUser;
    // End of variables declaration//GEN-END:variables
}
