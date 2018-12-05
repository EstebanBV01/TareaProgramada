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

    public WordList(Word[] userInfo) {
        this.wordlist = userInfo;
    }
    
    public WordList(){
        wordlist=new Word[SIZE];
    }
    
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

    public void setWordlist(Word[] wordInfo) {
        this.wordlist = wordInfo;
    }
    public void vecString(){
        for (Word word : wordlist) {
            System.out.println(" "+word+" ");
        }
    }
    public String getListString() {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += wordlist[i] + "\n";
        }
        return text;
    }
    
    public void bigger() {
        Word[] vec = new Word[wordlist.length+1];
        for (int i = 0; i < vec.length-1; i++) {
            vec[i]=wordlist[i];
        }
        wordlist = vec;
    }
    private void bigger2() {
        Word[] vec = new Word[wordlist.length + 2];
        System.arraycopy(wordlist, 0, vec, 0, wordlist.length);
        wordlist = vec;
    }
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

    public void addProduct(Word product) {
        wordlist[count++] = product;
    }
    
    public Word getWord (int index) {
        return wordlist[index];
    }
    
}
