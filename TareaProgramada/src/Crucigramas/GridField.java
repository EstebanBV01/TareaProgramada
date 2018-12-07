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
     public GridField(){
         
     }
    public GridField(Word word1) {
        super(word1.toString());
        this.word = word1;
    }
    public GridField(int x, int y ,int ancho,int alto){
        //setText((x)+"-"+(y));
        setText("       ");
        this.action();
    }
    public void action(){
        setBackground(Color.white);
    }
    public Word getProduct() {
        return word;
    }
    public void setColorBlack(){
    
    }
    

}
