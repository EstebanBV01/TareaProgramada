package JuegoDeLaVida.Datos;

import javax.swing.JOptionPane;

/**
 *
 * @author EstebanBV, Fernanda, Juan Carlos
 * @version 28/10/2018
 */
public class Cuadricula {

    
    Celda[][] juego;
    public int SIZE=3;
    Celda c=new Celda(true);
     Celda CeldaMuerta = new Celda(false);
   
    public Cuadricula(){
         this.juego = new Celda[SIZE][SIZE];
    }
    public Cuadricula(int cant) {
        this.juego = new Celda[cant][cant];
        
          for (int f = 0; f < juego.length; f++) {
            for (int c = 0; c < juego.length; c++) {
                this.juego[f][c]=CeldaMuerta;
                }
            }
        
    }

   public void random(int cantDeCeldas) {
       for(int i=0;i<=cantDeCeldas;i++){
        int numero = (int) (Math.random() * (juego.length -1));
        int numero2 = (int) (Math.random() * (juego.length -1));
            this.juego[numero][numero2]=c;
        }
    }
      public void setPositions(Celda[][] matriz){
        int fila,col=0;   
        boolean desicion=true;
        do {         
            fila=Integer.parseInt(JOptionPane.showInputDialog("digite la fila que desee"));
            col=Integer.parseInt(JOptionPane.showInputDialog("digite la columna que desee"));
            matriz[fila][col]=c;
            desicion=Boolean.parseBoolean(JOptionPane.showInputDialog("desea añadir otra?"));
        } while (desicion==true);  
    }

    public int getSize() {
        return juego.length;
    }

    public Celda[][] getMatriz() {
        return juego;
    }

    public void setMatriz(Celda[][] newCelda) {
        this.juego = newCelda;
    }
}
