
package JuegoDeLaVida.InteraccionUs;

import JuegoDeLaVida.Logico.LogicaDeNavegacion;
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
       LogicaDeNavegacion logica=new LogicaDeNavegacion();
       ManejoInterfazGraf interfaz=new ManejoInterfazGraf();
        interfaz.startMenu();
       
    
    
    }
    
}
