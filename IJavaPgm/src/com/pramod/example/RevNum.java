package com.pramod.example;

import java.util.Scanner;

public class RevNum {
    public static void main(String[] args) {
        int reverse = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number to Reverse");
        int num = scan.nextInt();
        while(num!=0){
            reverse = reverse * 10;
            reverse = reverse +num%10;
            num = num/10;
        }
        System.out.println("Reversed number is: "+reverse);
    }
}
