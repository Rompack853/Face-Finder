package com.facefinderserver.Login;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "user")
@Inheritance(strategy=InheritanceType.JOINED)
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "userID")
    private String userID = null;

    @Column(name = "secret")
    private String secret = null;

    /**
     * @return the userID
     */
    public String getUserID(){
        return userID;
    }

    /**
     * The Credentials can only be set ONE TIME!
     * @param userID the userID to set
     */
    public boolean setUserID(String userID){
        if(this.userID == null) {
            this.userID = userID;
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

}
