/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterfazGrafica;

import DataBase.User;
import DataBase.UserList;
import FileManagerBi.ReaderManagerBinary;
import FileManagerBi.WriterManagerBinary;
import Game.Main;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class UserF extends javax.swing.JDialog {
    ReaderManagerBinary reader = new ReaderManagerBinary();
    WriterManagerBinary writer = new WriterManagerBinary();
    
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
        btLogIn = new javax.swing.JButton();
        btSignIn = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(150, 150));

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

        btLogIn.setText("Log In");
        btLogIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogInActionPerformed(evt);
            }
        });

        btSignIn.setText("Registrarse");
        btSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSignInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btNoSign)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btSignIn))
                            .addComponent(lbIndication)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btLogIn))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfUser, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(lbPassword))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(lbUser)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbIndication, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
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
                .addGap(46, 46, 46)
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
        JOptionPane.showMessageDialog(this, "Las Instruccion Son Las Siguientes:\n"
                            + "Seguiendo las pistas debera de introducir la palabra donde se le asigna\n"
                            + "Debera de Completar todas las palabras para comprobar y asi ver su resultado","Instrucciones\n"
                                    + "Precione '?' para obtener una pista, (Estas tiene un limite dependiendo del nivel)", JOptionPane.INFORMATION_MESSAGE);
        levels.setVisible(true);
        
    }//GEN-LAST:event_btNoSignActionPerformed

    private void btLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogInActionPerformed
        
//                        try {                 
//                            writer.open("UserFiles/UserInfo.ser");
//                            writer.writeAll();
//                            writer.close();
//                            System.out.println("Escritura Exitosa binaria en writer");
//                        }catch (IOException ex) {
//                            System.err.println("error de archivo binario en writer");
//                            System.err.println(ex.getMessage());
////                          ex.printStackTrace();          
//                        }
        
        //Metodo para logearse
//
//        try {
//            reader.open("UserFiles/UserInfo.ser");
//            if (reader.read().getNickname().equals(tfUser.getText())) {
//                reader.close(); //importante cerrar el archivo
//
//                reader.open("UserFiles/UserInfo.ser");
//                if (reader.read().getPassword().equals(pfPassword.getText())) {
//                    reader.close(); 
//                    JOptionPane.showMessageDialog(this, "Logeado Con Exitoso");                 

//                    //importante cerrar el archivo
//                }else {
//                JOptionPane.showMessageDialog(this, "Usuario O Contraseña Erroneos");
//                }
//            }else  {
//                JOptionPane.showMessageDialog(this, "Usuario O Contraseña Erroneos");
//                }
//                System.out.println("Lectura exitosa bianria en reader");
//        } catch (IOException ex) {
//            System.err.println("error de archivo binario en reader");
//            System.err.println(ex.getMessage());
//            //ex.printStackTrace();
//        } catch (ClassNotFoundException ex) {
//            System.err.println("error de casteo de objeto del archivo");
//            System.err.println(ex.getMessage());
//            //ex.printStackTrace();
//        }
        
        //Estructura Base
//        try {
//            reader.open("UserFiles/UserInfo.ser");
//            if (reader.read().getPassword().equals(pfPassword.getText())) {
//                JOptionPane.showMessageDialog(this, "Logeado Con Exitoso");
//                Levels levels = new Levels(this, true);
//                levels.setVisible(true);
//            }else  {
//                JOptionPane.showMessageDialog(this, "Usuario O Contraseña Erroneos");
//                }
//                reader.close(); //importante cerrar el archivo
//                System.out.println("Lectura exitosa bianria en reader");
//        } catch (IOException ex) {
//            System.err.println("error de archivo binario en reader");
//            System.err.println(ex.getMessage());
//            //ex.printStackTrace();
//        } catch (ClassNotFoundException ex) {
//            System.err.println("error de casteo de objeto del archivo");
//            System.err.println(ex.getMessage());
//            //ex.printStackTrace();
//        }
        for (int i = 0; i < Main.User_Mananger.getLength(); i++) {
            if (Main.User_Mananger.getUser(i).isInstructions() == false) {
                        Levels levels = new Levels(this, true);
        JOptionPane.showMessageDialog(this, "¡A Ingresado Sin Registrarse!");
        JOptionPane.showMessageDialog(this, "Las Instruccion Son Las Siguientes:\n"
                            + "Seguiendo las pistas debera de introducir la palabra donde se le asigna\n"
                            + "Debera de Completar todas las palabras para comprobar y asi ver su resultado","Instrucciones\n"
                                    + "Precione '?' para obtener una pista, (Estas tiene un limite dependiendo del nivel)", JOptionPane.INFORMATION_MESSAGE);
        levels.setVisible(true);
            } else{
                Levels levels = new Levels(this, true);
                levels.setVisible(true);
            }
        }


    }//GEN-LAST:event_btLogInActionPerformed

    private void pfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfPasswordActionPerformed
        
    }//GEN-LAST:event_pfPasswordActionPerformed

    private void btSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSignInActionPerformed
        
        User newUser = new User(tfUser.getText(), pfPassword.getText(), 0, false);
        
//        try {
//            reader.open("UserFiles/UserInfo.ser");
//            reader.readAll();
//            reader.close();
//        } catch (IOException ex) {
//            System.err.println("error de archivo binario en reader");
//            System.err.println(ex.getMessage());
//            ex.printStackTrace();
//        } catch (ClassNotFoundException ex) {
//            System.err.println("error de casteo de objeto del archivo");
//            System.err.println(ex.getMessage());
//            ex.printStackTrace();
//        }
        
        if (tfUser.getText().length() >= 6 || tfUser.getText().length() <= 3){
            JOptionPane.showMessageDialog(this, "Menor Al Minimo O Mayor Al Maximo");
        }else {
            for (int i = 0; i < Main.User_Mananger.getLength(); i++) {
                if (Main.User_Mananger.getUser(i)!= null) {
                    if (Main.User_Mananger.getUser(i).getNickname().equals(tfUser.getText())) {
                        JOptionPane.showMessageDialog(this, "Nombre De Usuario Existente");
                        i = Main.User_Mananger.getLength();
                        
                    }else { 
                        i = Main.User_Mananger.getLength();
                        Main.User_Mananger.addNewUser(newUser);
                        Main.User_Mananger.vecString(); 
                        
                    }
                }else {
                    i = Main.User_Mananger.getLength();     
                        Main.User_Mananger.addNewUser(newUser);
                        Main.User_Mananger.vecString();               
                }
            }   
        }
        

        
        

//         for (int i = 0; i < Main.User_Mananger.getLength(); i++) {
//         if (Main.User_Mananger.getUser(i)!= null) {
//           
//                if (Main.User_Mananger.getUser(i).getNickname().equals(tfUser.getText())) {
//                    JOptionPane.showMessageDialog(this, "Nombre De Usuario Existente");
//                    i = Main.User_Mananger.getLength();
//                }else {
//                    Main.User_Mananger.addNewUser(newUser);
//                    Main.User_Mananger.vecString();            
//                }
//        }else {
//                Main.User_Mananger.addNewUser(newUser);
//                Main.User_Mananger.vecString();                 
//            }
//        }
//        


//                    try {
//                        reader.open("UserFiles/UserInfo.ser");
//                        reader.readAll();
//                        reader.close();
//                    } catch (IOException ex) {
//                        System.err.println("error de archivo binario en reader");
//                        System.err.println(ex.getMessage());
//                        //ex.printStackTrace();
//                    } catch (ClassNotFoundException ex) {
//                        System.err.println("error de casteo de objeto del archivo");
//                        System.err.println(ex.getMessage());
//                        //ex.printStackTrace();
//                    }

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
