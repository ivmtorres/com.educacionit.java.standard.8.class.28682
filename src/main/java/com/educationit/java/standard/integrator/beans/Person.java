
package com.educationit.java.standard.integrator.beans;


import java.time.LocalDate;


public class Person {


    private String name;

    private String lastName;

    private String email;

    private boolean enabled;

    private LocalDate creation;


    public Person (String name, String lastName, String email,
                   boolean enabled, LocalDate creation) {

        this.name  = name;
        this.lastName = lastName;
        this.email    = email;
        this.enabled  = enabled;
        this.creation = creation;
    }


    public String getName () {

        return name;
    }

    public void setName (String name) {

        this.name = name;
    }

    public String getLastName () {

        return lastName;
    }

    public void setLastName (String lastName) {

        this.lastName = lastName;
    }

    public String getEmail () {

        return email;
    }

    public void setEmail (String email) {

        this.email = email;
    }

    public boolean isEnabled () {

        return enabled;
    }

    public void setEnabled (boolean enabled) {

        this.enabled = enabled;
    }

    public LocalDate getCreation () {

        return creation;
    }

    public void setCreation (LocalDate creation) {

        this.creation = creation;
    }
}
