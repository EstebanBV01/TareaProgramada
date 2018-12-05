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

    public void open(String fileName) throws IOException {
        writer = new BufferedWriter(new FileWriter(fileName));
    }

    private void write(Word Word) throws IOException {
        writer.write(Word.toFileString() + "\n");
    }

    public void writeAll() throws IOException {
        for (int i = 0; i < Main.WORD_MANAGER.getLength(); i++) {
            write(Main.WORD_MANAGER.getWord(i));
        }
    }

    public void close() throws IOException {
        writer.close();
    }

}
