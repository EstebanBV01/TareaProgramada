/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileManager;

import Crucigramas.Word;
import Game.Main;
import static Game.Main.WORD_MANAGER;
import java.io.*;

/**
 *
 * @author juancarlos,fernanda,esteban
 * @version 8/12/2018
 */
public class ReaderManager {
        private BufferedReader reader;

    public void open(String fileName) throws FileNotFoundException {
        reader = new BufferedReader(new FileReader(fileName));
    }
    /**
     * metodo para leer linea por linea
     * @return retorna la palabra leída
     * @throws IOException 
     */
     private Word read() throws IOException {
       Word word=null;
      // Word word2=null;
        String line = reader.readLine(); //retorna null cuando no hay más registros
        String datos[];
        if (line != null) {
            datos = line.split("/");
            //word = new Word(
              //      Character.getNumericValue(datos[0].charAt(0)), Character.getNumericValue(datos[0].charAt(2)),
                //    Character.getDirectionality(datos[1].charAt(1)), datos[3], datos[4], datos[5]);
                word=new Word(Integer.parseInt(datos[0]),
                     Integer.parseInt(datos[1]), Integer.parseInt(datos[2]),datos[3],datos[4], datos[5]);           
            int n=Character.getNumericValue(datos[0].charAt(0));
        }
        return word;
    }
     public void readAll() throws IOException {
        Word newWord;
        while ((newWord = read()) != null) {
            System.out.println("leyendo");
            Main.WORD_MANAGER.addWord(newWord);
        }
        System.out.println("wlwmen"+WORD_MANAGER.getListString());
    }
/**
 * metodo para sacar filas y columnas
 * @throws IOException 
 */
     private int getRowCols() throws IOException {
       Word word=null;
       int rowCol=0;
        String line = reader.readLine(); //retorna null cuando no hay más registros
        String datos[];
        if (line != null) {
            datos = line.split("/");
                word=new Word(Integer.parseInt(datos[0]),
                    Integer.parseInt(datos[1]), Integer.parseInt(datos[2]),datos[3],datos[4], datos[5]);           
             rowCol=Character.getNumericValue(datos[0].charAt(0));
        }
        return rowCol;
    }
     /**
      * metodo para cerrar el archivo de texto
      * @throws IOException 
      */
    public void close() throws IOException {
        reader.close();
    }
}
