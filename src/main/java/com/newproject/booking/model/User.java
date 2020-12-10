package com.newproject.booking.model;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;


    private String userName;


   private String emailAddress;


   private String password;


    public User() {
    }

    public User(Integer userId, String userName, String emailAddress, String password) {
        this.userId = userId;
        this.userName = userName;
        this.emailAddress = emailAddress;
        this.password = password;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
