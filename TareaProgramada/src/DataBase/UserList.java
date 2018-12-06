/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;
import Crucigramas.Word;
import DataBase.User;

/**
 *
 * @author Johan
 */
public class UserList {
    int count = 0;
    User[] userlist;
    static final int SIZE=4;

    public UserList(User[] userInfo) {
        this.userlist = userInfo;
    }
    
    public UserList(){
        userlist=new User[SIZE];
    }
    
    public User getUser(int index) {
        return userlist[index];
    }
    
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

    public void setUserlist(User[] userInfo) {
        this.userlist = userInfo;
    }
    public void vecString(){
        for (User user : userlist) {
            System.out.println(" "+user+" ");
        }
    }
    public String getListString() {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += userlist[i] + "\n";
        }
        return text;
    }
    
    public void bigger() {
        User[] vec = new User[userlist.length*2];
        for (int i = 0; i < vec.length; i++) {
            vec[i] = userlist[i];
        }
        userlist = vec;
    }
    
    
    public void addNewUser (User newUser) {
        if(newUser != null) {
            if (userlist.length <= count) {
                this.bigger();
                userlist[count] = newUser;
                count++;
                
            }else {
                userlist[count] = newUser;
                count++;
            }
            
        }else {            
            userlist[count] = newUser;
            count++;
        }
    } 
}
