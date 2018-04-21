
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

    @Override
    public int hashCode () {

        return this.getEmail ().hashCode ();
    }

    @Override
    public boolean equals (Object obj) {

        if (obj instanceof User) {

            User o = (User)obj;

            if (o.getEmail ().equals ("")) {

                return false;
            }

            return o.getEmail ().equals (this.getEmail ());

        } else {

            return false;
        }
    }

    @Override
    public String toString () {

        return this.getName () + " " + this.getLastName ();
    }
}