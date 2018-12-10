/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;
import Crucigramas.Word;
import DataBase.User;
import java.io.Serializable;

/**
 *
 * @author Johan
 */
public class UserList implements Serializable{
    int count = 0;
    User[] userlist;
    static final int SIZE=4;

    /**
     * Constructor de vector
     * @param userInfo un vector
     */
    public UserList(User[] userInfo) {
        this.userlist = userInfo;
    }
    
    /**
     * Constructor predetermiando
     */
    public UserList(){
        userlist=new User[SIZE];
    }
    
    /**
     * Obtener Un usuario definido
     * @param index posicion
     * @return Un usario
     */
    public User getUser(int index) {
        return userlist[index];
    }
    
    /**
     * Metodo para obtener el vector 
     * @return Un vector
     */
    public User[] getUserList() {
        return userlist;
    }
    
    /**
     * 
     * @return retorna el tmaño del vector 
     */
    public  int getLength() {
        return userlist.length;
    }

    /**
     * Metodo para imprimir el vector
     */
    public void vecString(){
        for (User user : userlist) {
            System.out.println(" "+user+" ");
        }
    }
    
    /**
     * Metodo para obtener el vector en formato String
     * @return 
     */
    public String getListString() {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += userlist[i] + "\n";
        }
        return text;
    }
    
    /**
     * Metodo para agrandar el vector
     */
    public void bigger() {
        User[] temp = new User[userlist.length*2];
        System.arraycopy(userlist, 0, temp, 0, userlist.length);
        userlist = temp;
    }
    
    /**
     * Metodo para añadir nuevos usuarios
     * @param newUser Nuevo usuario
     */
    public void addNewUser (User newUser) {
        if(userlist.length == count) {
            bigger();
            if (newUser != null) {
                userlist[count] = newUser;
                count++;
                
            }else {
                userlist[count] = newUser;
                count++;
            }
            
        }else if (newUser != null){            
            userlist[count] = newUser;
            count++;
        }
    } 
}
