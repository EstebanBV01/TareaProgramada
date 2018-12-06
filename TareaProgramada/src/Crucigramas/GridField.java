/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Crucigramas;
import javax.swing.JTextField;
/**
 *
 * @author Johan
 */
public class GridField extends JTextField{
     private Word word;

    public GridField(Word word1) {
        super(word1.toString());
        this.word = word1;
    }

    public Word getProduct() {
        return word;
    }
}
