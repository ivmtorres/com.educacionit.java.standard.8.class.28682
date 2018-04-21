
package com.educationit.java.standard.integrator.beans;


import java.time.LocalDate;


public class User extends Person {

    private String userName;

    private String password;


    public User (String name, String lastName, String email,
                 boolean enabled, String userName, String password) {


        super (name, lastName, email,
               false, LocalDate.now ());

        this.userName = userName;
        this.password = password;
    }


    public String getUserName () {

        return userName;
    }

    public void setUserName (String userName) {

        this.userName = userName;
    }

    public String getPassword () {

        return password;
    }

    public void setPassword (String password) {

        this.password = password;
    }
}