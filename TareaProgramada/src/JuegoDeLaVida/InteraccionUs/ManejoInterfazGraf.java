
package JuegoDeLaVida.InteraccionUs;

import JuegoDeLaVida.Datos.Celda;
import JuegoDeLaVida.Datos.Cuadricula;
import JuegoDeLaVida.Logico.Reglas;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class ManejoInterfazGraf {
    
        ImageIcon icon = new ImageIcon("logo1.png");
        Reglas reglasGame = new Reglas();
        LogicaDeNavegacion logic = new LogicaDeNavegacion();
//        Cuadricula[][] cuad= new Cuadricula[][]{};
        
        public void startGame () {
            int cant = Integer.parseInt(JOptionPane.showInputDialog(null, "Tamaño Juego"));
            Cuadricula cuadri = new Cuadricula(cant);
            int celdasAle = Integer.parseInt(JOptionPane.showInputDialog(null, "Espacios Aleatorios"));
            cuadri.random(celdasAle);
            logic.stringMatrix(cuadri.getMatriz());
            
            
        }

        
         
    }

