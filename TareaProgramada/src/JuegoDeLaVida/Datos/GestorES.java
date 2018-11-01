/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JuegoDeLaVida.Datos;

import javax.swing.JOptionPane;

/**
 *
 * @author estebanbv
 */
public class GestorES {
    public void soliciarInt(int msj){
       int g= Integer.parseInt(JOptionPane.showInputDialog(msj));
    }
}
