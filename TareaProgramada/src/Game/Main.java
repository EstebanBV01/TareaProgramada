package Game;

import Crucigramas.Word;
import Crucigramas.WordList;
import FileManager.WriterManager;
import InterfazGrafica.Index;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juanka,fernanda,esteban
 */
import java.io.*;
public class Main {
public final static Word WORD_MANAGER = new Word();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Word w1=new Word(0, 0, 0,"V","laPalabra", "laDescripcion");
        Index index = new Index();
        index.setVisible(true);
        Word[] vec={w1,w1,w1};
        Word word=new Word(vec);
        System.out.println(word.getListString());
        System.out.println("** "+vec[1].toFileString());
        
        
        
        WriterManager writer = new WriterManager();
        try {
            writer.open("UserFiles/UserInfo.ser");  //probar el parametro apend en new FileWriter(fileName, true)
            writer.writeAll();
            writer.close(); //importante cerrar el archivo 
            System.out.println("Escritura exitosa");
        } catch (IOException ex) {
            System.err.println("error de archivo");
            System.err.println(ex.getMessage());
            //ex.printStackTrace();
        }
    }
    
}
