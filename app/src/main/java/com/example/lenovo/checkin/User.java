package com.example.lenovo.checkin;

/**
 * Created by LENOVO on 3/6/2018.
 */

public class User {
    private String userID;
    private String userName;
    private String userEmail;
    private String userImage;

    public User(String userID, String userName, String userEmail) {
        this.userID = userID;
        this.userEmail = userEmail;
        this.userName = userName;
    }
    public User(){}
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
