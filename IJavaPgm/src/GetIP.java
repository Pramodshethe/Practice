package com.pramod.example;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIP {
    public static void main(String[] args) {
        try {
            InetAddress inet = InetAddress.getLocalHost();
            System.out.println("My IP address is: "+inet.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
}
