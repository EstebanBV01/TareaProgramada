
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
            boolean decision=true;
            int cant = Integer.parseInt(JOptionPane.showInputDialog(null, "Tamaño Juego"));
            Cuadricula cuadri = new Cuadricula(cant);
            reglasGame.fillMatrix(cuadri.getMatriz());
            int celdasAle = Integer.parseInt(JOptionPane.showInputDialog(null, "Espacios Aleatorios"));
            cuadri.random(celdasAle);
            int fila=Integer.parseInt(JOptionPane.showInputDialog("Digite La Fila Que Desea"));
            int col=Integer.parseInt(JOptionPane.showInputDialog("Digite La Columna Que Desea"));
            do {
                cuadri.setPositions(fila, col);
                logic.stringMatrix(cuadri.getMatriz());
                decision = Boolean.parseBoolean(JOptionPane.showInputDialog("Desea añadir otra? \n[true] Para Si! \n[false] Para No!"));
                }  while (decision == true); 
                reglasGame.Rules(cuadri.getMatriz());
                reglasGame.encuentraVivos(cuadri.getMatriz());
            
        }

        
         
    }

