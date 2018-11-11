
package JuegoDeLaVida.InteraccionUs;

import JuegoDeLaVida.Datos.Cuadricula;
import JuegoDeLaVida.Logico.Reglas;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import JuegoDeLaVida.Datos.Celda;

/**
 *
 * @author Esteban BV, Fernanda AA, Juan Carlos VA
 * @version 9/11/2018
 */

/**
 * Metodo creado para inicar el juego con sus devidas funciones 
 * 
 */

public class ManejoInterfazGraf {
        int count = 1;
        ImageIcon icontest = new ImageIcon("logo1.jpg");
        Reglas reglasGame = new Reglas();
        LogicaDeNavegacion logic = new LogicaDeNavegacion();
        boolean decision=true;
        int opcion=0;
        int celdasAle=0;
        int valor=0;
        Object [] colores ={"si","no"}; 
        Cuadricula[][] vector=new Cuadricula[21][21];
        public void startGame () {
            JOptionPane.showMessageDialog(null, "Bienvenido al juego de la vida\nAutores:\nMaria Fernanda Alvarado Astorga\nJuan Carlos Valverde Araya\nEsteban Barrantes Vargas ");
          do{  
            valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Tamaño Juego...>8 y <20"));
            }while(valor<8||valor>20);
           Cuadricula cuadri = new Cuadricula(valor);
            reglasGame.fillMatrix(cuadri.getMatriz());
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "digite 1 para asignar posiciones aleatorias\n"
                                                                            + "digite 2 para asignarlas manualmente"));
            switch(opcion){
                case 1:
                     celdasAle = Integer.parseInt(JOptionPane.showInputDialog(null, "Espacios Aleatorios"));
                    cuadri.random(celdasAle);                 
                break;
                case 2:
                    do {
                        int fila=Integer.parseInt(JOptionPane.showInputDialog("Digite La Fila Que Desea"));
                        int col=Integer.parseInt(JOptionPane.showInputDialog("Digite La Columna Que Desea"));
                        cuadri.setPositions(fila, col);
                        logic.stringMatrix(cuadri.getMatriz());
                        decision = Boolean.parseBoolean(JOptionPane.showInputDialog("Desea añadir otra? \n[true] Para Si! \n[false] Para No!"));               
                    }while (decision == true);
                break;
            }  
            //////////////////
              do{                    
                  logic.stringMatrix(reglasGame.Rules(cuadri.getMatriz()));
                  reglasGame.encuentraVivos(cuadri.getMatriz());
                  cuadri.setMatriz(reglasGame.Rules(cuadri.getMatriz()));
                    JOptionPane.showMessageDialog(null,"hay:"+reglasGame.encuentraVivos(cuadri.getMatriz())+"_cedas vivas");
                   decision = Boolean.parseBoolean(JOptionPane.showInputDialog("desea volver a jugar?\n[true] [false]"));               
                  //decision = Boolean.parseBoolean((String) JOptionPane.showInputDialog(null,"Selecciona un color", "Elegir",JOptionPane.QUESTION_MESSAGE,null,colores, colores[0]));
                count += 1;
            }while(decision==true); 
        }  
    }

