package com.educationit.java.standard.integrator.beans;

public class Main {



    public static void main (String[] args) {

        User u = new User ("Homer", "Simpson", "hsimpson@gmail.com",
                         true,"hsimpson", "123");

        System.out.println (u.getUserName ());

    }
}
