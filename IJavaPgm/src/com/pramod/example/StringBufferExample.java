package com.pramod.example;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer("Pramod");
        System.out.println("Before: "+sb);
        sb.reverse();
        System.out.println("After: "+sb);

    }
}
