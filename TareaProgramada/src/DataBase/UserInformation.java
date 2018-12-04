/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;
import DataBase.User;

/**
 *
 * @author Johan
 */
public class UserInformation {
    int count = 0;
    User[] userlist;
    static final int SIZE=4;

    public UserInformation(User[] userInfo) {
        this.userlist = userInfo;
    }
    
    public UserInformation(){
        userlist=new User[SIZE];
    }
    
    public User[] getUserInfo() {
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
        User[] vec = new User[count + 1];
        for (int i = 0; i < vec.length; i++) {
            vec[i] = userlist[i];
        }
        userlist = vec;
    }
    
    public void addUser (User user) {
        if (userlist.length-1 != count) {
            if (user != null) {
                userlist[count] = user;
                count++;
            }
        }else {
            this.bigger();
            if (user != null) {
                userlist[count] = user;
                count++;
            }
        }
    }

    public void addProduct(User product) {
        userlist[count++] = product;
    }
    
    public User getUser (int index) {
        return userlist[index];
    }
    
}
