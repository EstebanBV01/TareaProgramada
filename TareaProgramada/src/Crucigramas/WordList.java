/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Crucigramas;

/**
 *
 * @author fernanda,juan_carlos.esteban
 */
public class WordList {
    int count = 0;
    Word[] wordlist;
    static final int SIZE=4;
    
    private Word newWord;
    public WordList(Word word){
    this.newWord=word;
    }
    
    /**
     * Metodo para crear un vector (Constructor)
     * @param Un vector de palabras
     */
    public WordList(Word[] userInfo) {
        this.wordlist = userInfo;
    }
    
    /**
     * Constructor predeterminado
     */
    public WordList(){
        wordlist=new Word[SIZE];
    }
    
    /**
     * Metodo para obtener el vector
     * @return Un vector de palabras
     */
    public Word[] getWordInfo() {
        return wordlist;
    }
    /**
     * 
     * @return retorna el tmaño del vector 
     */
    public  int getLength() {
        return wordlist.length;
    }

    /**
     * Metodo para definir una lista de palabras
     * @param wordInfo Un vector de palabras
     */
    public void setWordlist(Word[] wordInfo) {
        this.wordlist = wordInfo;
    }
    
    /**
     * Imprime el vector
     */
    public void vecString(){
        for (Word word : wordlist) {
            System.out.println(" "+word+" ");
        }
    }
    
    /**
     * Metodo para Obtener toda la lista
     * @return Un String
     */
    public String getListString() {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += wordlist[i] + "\n";
        }
        return text;
    }
    
    /**
     * Metodo para agrandar el vector
     */
    public void bigger() {
        Word[] vec = new Word[wordlist.length+1];
        for (int i = 0; i < vec.length-1; i++) {
            vec[i]=wordlist[i];
        }
        wordlist = vec;
    }
    
    /**
     * Segundo metodo para agrandar 
     */
    private void bigger2() {
        Word[] vec = new Word[wordlist.length + 2];
        System.arraycopy(wordlist, 0, vec, 0, wordlist.length);
        wordlist = vec;
    }
    
    /**
     * Metodo para añadir nuevas palabras al vector
     * @param word Nueva Palabra
     */
    public void addWord (Word word) {
        if(word!=null){
            if (count>=wordlist.length) {
             this.bigger();
                wordlist[count] = word;
                count++;
            
            }else {
                if (word != null) {
                    wordlist[count] = word;
                    count++;
                }
            }
        }
    }
    
    /**
     * Segundo metodo para agregar
     * @param product una letra
     */
    public void addProduct(Word product) {
        wordlist[count++] = product;
    }
    
    /**
     * Metodo para obtener el contador del vector
     * @return 
     */
    public int getWordCount(){return count;}
    public Word getWord (int index) {
        return wordlist[index];
    }
    
}
