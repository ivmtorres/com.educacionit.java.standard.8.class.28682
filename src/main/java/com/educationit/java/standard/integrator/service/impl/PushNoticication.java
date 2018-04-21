
package com.educationit.java.standard.integrator.service.impl;


import com.educationit.java.standard.integrator.service.INotification;


public class PushNoticication implements INotification {


    @Override
    public String send (String destination, String msg) {

        return "Send notification [" + msg + "] by push to " + destination.toUpperCase ();
    }

    public void printf (String destination, String msg) {

        System.out.println ("Send notification [" + msg + "] by push to " + destination.toUpperCase ());
    }
}