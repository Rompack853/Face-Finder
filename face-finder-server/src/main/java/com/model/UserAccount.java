package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column(name = "username")
    private String username = null;

    @Column(name = "secret")
    private String secret = null;

    /**
     * @return the usernanme
     */
    public String getUsername(){
        return username;
    }

    /**
     * The Credentials can only be set ONE TIME!
     * @param username the userID/username to set
     */
    public boolean setUsername(String username){
        if(this.username == null) {
            this.username = username;
            return true;
        }
        return false;
    }//setUserID

    /**
     * @return the secret
     */
    public String getSecret(){
        return secret;
    }

    /**
     * @param secret
     */
    public void setSecret(String secret){
        this.secret = secret;
    }
}