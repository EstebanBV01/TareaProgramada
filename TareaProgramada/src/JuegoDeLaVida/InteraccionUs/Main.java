
package JuegoDeLaVida.InteraccionUs;

import JuegoDeLaVida.Datos.Celda;
import JuegoDeLaVida.Datos.Cuadricula;
import JuegoDeLaVida.Logico.LogicaDeNavegacion;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author EstebanBV
 * @version 28/10/2018
 */
public abstract class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ImageIcon icontest = new ImageIcon("logo1.jpg");
        int[] parte = {1,2,3,4,5,6};
        //Cuadricula logica= new Cuadricula();
       Cuadricula interfaz=new Cuadricula();
       int cant = Integer.parseInt(JOptionPane.showInputDialog(null,"Datos"));
        //(JOptionPane.showInputDialog(null, "Normal Message", "Title", JOptionPane.WARNING_MESSAGE, icontest, new Object[] { "3", "4", "5", "6", "7", "0" }, args));
       
       LogicaDeNavegacion log=new LogicaDeNavegacion(cant-1);
       log.regla();
        //interfaz.startMenu();
      // int size = Integer.parseInt(JOptionPane.showInputDialog("Introduzca El Tamaño Del Panel"));
        //logica.setSize(size);
        log.stringMatrix();
        //System.out.println(logica.getSize());//
    
    }
    
}
