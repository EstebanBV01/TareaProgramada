/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileManager;
import java.io.*;
import Game.Main;
import Crucigramas.Word;
import Crucigramas.WordList;
import javax.swing.JOptionPane;

public class WriterManager {

    private BufferedWriter writer;

    
    /**
     * Metodo para abrir un archivo
     * @param fileName ubicacion del archivo
     * @throws IOException captura de errores
     */
    public void open(String fileName) throws IOException {
        writer = new BufferedWriter(new FileWriter(fileName));
    }

    /**
     * Metodo para escribir en el archivo una palabra
     * @param Word Palabra a escribir
     * @throws IOException Captura de errores
     */
    private void write(Word Word) throws IOException {
        writer.write(Word.toFileString() + "\n");
    }

    /**
     * Metodo para escribir todo en el vector
     * @throws IOException Captura de errores
     */
    public void writeAll() throws IOException {
        for (int i = 0; i < Main.WORD_MANAGER.getLength(); i++) {
            write(Main.WORD_MANAGER.getWord(i));
        }
    }

    /**
     * Metodo para cerrar la escritura del archivo
     * @throws IOException Captura de errores 
     */
    public void close() throws IOException {
        writer.close();
    }

}
