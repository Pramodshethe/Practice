package com.pramod.example;

import java.util.Scanner;

public class DecToBinary {
    public void printBinary(int number){
        int binary[] = new int[25];
        int index = 0;
        while(number > 0){
            binary[index++] =number%2;
            number = number/2;
        }
        for(int i=index-1;i>=0;i--){
            System.out.print("Binary:  "+binary[i]);
        }
    }

    public static void main(String[] args) {
        DecToBinary dtb = new DecToBinary();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number convert to Binary");
        int num = scan.nextInt();
        dtb.printBinary(num);
    }
}
/*
__________________OUTPUT__________________

        Enter the number convert to Binary
        10
        Binary: 1010
__________________________________________
*/
