/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;
import java.io.*;

/**
 *
 * @author juancarlos, fernanda ,esteban
 * @version 9/12/2018
 */
public class User implements Serializable { 
    private String nickname;
    private String password;
    private int progress;
    private boolean instructions;
/**
 * 
 * @param nickname
 * @param password 
 */
    public User(String nickname, String password, int progress, boolean instructions) {
        this.nickname = nickname;
        this.password = password;
        this.progress = progress;
        this.instructions = instructions;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public boolean isInstructions() {
        return instructions;
    }

    public void setInstructions(boolean instructions) {
        this.instructions = instructions;
    }
    

    public String toString() {
        return "Nickname: " + nickname + ", Password: " + password + ", Progress: " + progress;
    } 
}
