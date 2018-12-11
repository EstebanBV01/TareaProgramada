/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Crucigramas;
import java.awt.Color;
import java.awt.Dimension;
import javafx.scene.layout.Background;
import javax.swing.JTextField;
/**
 *
 * @author 
 */
public class GridField extends JTextField{
     private Word word;
     private JTextField cross;
     
    public GridField(){
        
    }

    /**
     * Metodo para colocarle un color blanco a los field
     */
    public void setWhite(){
        setBackground(Color.WHITE);
    }
    
    /**
     * Metodo para obtener una palabra
     * @return Una palabra
     */
    public Word getProduct() {
        return word;
    }
    
    /**
     * Metodo para asignarle un color negro a los field vacios
     */
    public void setBlack(){
        setBackground(Color.BLACK);
    }
    
    public void setposition(int X,int Y) {
         Dimension Tamano = this.getSize();
         X = X * Tamano.height;
         Y = Y * Tamano.width;
        this.setAlignmentX( X);
        this.setAlignmentY(Y);
    }    
    /**
     * Metodo para validar la letra
     */
    public void letterValidation() {
        
    }
}
