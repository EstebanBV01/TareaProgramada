/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;
import java.io.*;

/**
 *
 * @author Johan
 */
public class User implements Serializable { 
    private String nickname;
    private String password;
/**
 * 
 * @param nickname
 * @param password 
 */
    public User(String nickname, String password) {
        this.nickname = nickname;
        this.password = password;
    }

    public User() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
   

    public String toString() {
        return "Nickname: " + nickname + ", Password: " + password;
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
