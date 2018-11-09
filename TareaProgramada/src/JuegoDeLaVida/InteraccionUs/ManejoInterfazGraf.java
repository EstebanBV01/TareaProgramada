
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
        Reglas reglasGame = new Reglas();
        LogicaDeNavegacion logic = new LogicaDeNavegacion();
       // Cuadricula[][] cuad= new Cuadricula[][]{};
        public void startGame () {
            int cant = Integer.parseInt(JOptionPane.showInputDialog(null, "Tamaño Juego"));
            Cuadricula cuadri = new Cuadricula(cant);
            reglasGame.fillMatrix(cuadri.getMatriz());
            int celdasAle = Integer.parseInt(JOptionPane.showInputDialog(null, "Espacios Aleatorios"));
            cuadri.random(celdasAle);
            cuadri.setPositions(cuadri.getMatriz());
            logic.stringMatrix(cuadri.getMatriz());
            //reglasGame.Rules(cuadri.getMatriz());
            reglasGame.encuentraVivos(cuadri.getMatriz());
            
            
            
        }

        
         
    }

