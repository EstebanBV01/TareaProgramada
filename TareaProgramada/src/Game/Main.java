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
public final static WordList LIST_MANAGER = new WordList();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        WriterManager writer=new WriterManager();
//        writer.write("crucigramasNvl-1.txt");
//        WordList[] list=new WordList[9];
        Word w1=new Word(0, "v", 0, 6, 0, 0,"pruebaLAFC");
        Index index = new Index();
        index.setVisible(true);
//        for (int i = 0; i < 10; i++) {
//            LIST_MANAGER.addWord(list[i].getWordList());
//        }
        WriterManager writer = new WriterManager();
        try {
            writer.open("crucigrama-Nvl-1.txt");  //probar el parametro apend en new FileWriter(fileName, true)
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
