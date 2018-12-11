/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Crucigramas;
import java.awt.Color;
import javafx.scene.layout.Background;
import javax.swing.JTextField;
/**
 *
 * @author 
 */
public class GridField extends JTextField{
     private Word word;
     private JTextField[][] cross;
     public GridField(){
         
     }
     
     /**
      * Asignar un una palabra al field
      * @param word1 recibe una palabra por parametros 
      */
//    public GridField(Word word1) {
//        super(word1.toString());
//        this.word = word1;
//    }
    
    /**
     * 
     * @param x recibe un int 
     * @param y recibe un int 
     * @param ancho recibe un int 
     * @param alto recibe un int 
     */
    
    /**
     * Metodo para colocarle un color blanco a los field
     */
    public void action(){
        setBackground(Color.white);
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
    public void setColorBlack(){
        setBackground(Color.BLACK);
    }
    
    /**
     * Metodo para validar la letra
     */
    public void letterValidation() {
        
    }
}
