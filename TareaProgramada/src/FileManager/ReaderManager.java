/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileManager;

import Crucigramas.Word;
import Game.Main;
import java.io.*;

/**
 *
 * @author Johan
 */
public class ReaderManager {
        private BufferedReader reader;

    public void open(String fileName) throws FileNotFoundException {
        reader = new BufferedReader(new FileReader(fileName));
    }
    /**
     * metodo para abrir el archivo texto
     * @return 
     */   
    public String[] open2(String fileName,int arrLength)throws FileNotFoundException ,IOException{
        String str;
        int cont=0;
        String[] array;
        FileReader fileReader=new FileReader(fileName);
        this.reader=new BufferedReader(fileReader);
        array=new String[arrLength];
        while((str=reader.readLine())!=null){
            array[cont]=str;
            cont++;
        }
        reader.close();
        return array;
    }
    /**
     * metodo para leer linea por linea
     * @return retorna la palabra leída
     * @throws IOException 
     */
    public Word read() throws IOException {
        Word word1 = null;
        String line = reader.readLine(); //retorna null cuando no hay más registros
        String datos[];
        if (line != null) {
           // word1 = new Word();
            datos = line.split("/");
            //////
            word1=new Word(Integer.parseInt(datos[0]),Integer.parseInt(datos[1]), Integer.parseInt(datos[2]),datos[3],datos[4], datos[5]);
            
            ///
        }
        return word1;
    }
//    public void readAll() throws IOException {
//        for (int i = 0; i < Main.WORD_MANAGER.getLength(); i++) {
//            read(Main.WORD_MANAGER.getWord(i));
//        }
//    }
    public void close() throws IOException {
        reader.close();
    }
}
