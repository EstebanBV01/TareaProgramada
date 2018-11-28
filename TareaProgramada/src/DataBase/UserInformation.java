/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

/**
 *
 * @author Johan
 */
public class UserInformation {
    User[] userInfo;
    static final int SIZE=3;

    public UserInformation(User[] userInfo) {
        this.userInfo = userInfo;
    }
    public UserInformation(){
        userInfo=new User[SIZE];
    }
    public User[] getUserInfo() {
        return userInfo;
    }
    /**
     * 
     * @return retorna el tmaño del vector 
     */
    public  int getLength() {
        return userInfo.length;
    }

    public void setUserInfo(User[] userInfo) {
        this.userInfo = userInfo;
    }
    public void vecString(){
        for (User user : userInfo) {
            System.out.println(" "+user+" ");
        }
    }
    
}
