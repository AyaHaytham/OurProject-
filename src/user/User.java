package user;

import java.util.*;

public class User {
    public int userId;
    public String userName;
    Map <Integer,String> users=new HashMap<Integer, String>();
    private static int counter=0;
    public User(){}
    public User(int Id,String name){
    userName=name;}

    public User(String name){
        userName=name;
        userId=counter++;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
