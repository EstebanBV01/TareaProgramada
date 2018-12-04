/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Crucigramas;

/**
 *
 * @author Johan
 */
public class WordList {

    private Word[] wordList;
    private int counter;

    public WordList(Word[] wordList, int counter) {
        this.wordList = wordList;
        this.counter = counter;
    }
    public WordList(){
        wordList=new Word[5];
    }
    public void biggerVector(){
        Word[] vec=new Word[counter+1];
        for (int i = 0; i < vec.length; i++) {
            vec[i]=wordList[i];
        }
        wordList=vec;
    
    }
    public void addWord(Word word) {
        if (wordList.length-1 != counter) {
            if (word != null) {
                wordList[counter] = word;
                counter ++;
            }
        }else{
            this.biggerVector();
            if (word != null) {
                wordList[counter] = word;
                counter++;
            }
        }
    }
     public String getListString() {
        String text = "";
        for (int i = 0; i < counter; i++) {
            text += wordList[i] + "\n";
        }
        return text;
    }
    public Word[] getWordList() {
        return wordList;
    }
    public Word getWord(int index) {
        return wordList[index];
    }
    public int getCounter() {
        return counter;
    }
    public int getSize(){return wordList.length;}
    @Override
    public String toString() {
        return "WordList{" + "wordList=" + wordList + ", counter=" + counter + '}';
    }
    
}
