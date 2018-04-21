
package com.educationit.java.standard.integrator.service.impl;


import com.educationit.java.standard.integrator.service.INotification;


public class EmailNoticication implements INotification {


    @Override
    public String send (String destination, String msg) {

        return "Send notification [" + msg + "] by email to " + destination;
    }

    public void print (String destination, String msg) {

        System.out.println ("Send notification [" + msg + "] by email to " + destination);
    }
}