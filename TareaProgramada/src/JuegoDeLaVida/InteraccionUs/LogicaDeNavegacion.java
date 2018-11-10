
package JuegoDeLaVida.InteraccionUs;

import JuegoDeLaVida.Datos.Celda;
import javax.swing.JOptionPane;

/**
 *
 * @author Esteban BV, Fernanda AA, Juan Carlos VA
 */
public class LogicaDeNavegacion {
    
    /**
     * Metodo para crear la ventana grafica de la matriz
     * @param nueva Recibe una matriz para crear la ventana grafica
     */
 public void stringMatrix(Celda[][] nueva){
     
        String cadena = "";
        for (int f = 0; f < nueva.length; f++) {
            for (int c = 0; c < nueva.length; c++) {
               
                if(nueva[f][c].getEstado() == true )
                {
                    cadena += "⬛" +" | ";
                }
                else
                {
                    cadena += "□" +" | ";
                }
            }
            cadena += "\n";
        }
        JOptionPane.showMessageDialog(null,cadena+"\n");
       }       
}
