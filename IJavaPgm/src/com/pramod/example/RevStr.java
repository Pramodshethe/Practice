package com.pramod.example;

import java.util.Scanner;

public class RevStr {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String you want reverse: ");

        String rev = scanner.nextLine();
        String temp = "";
        for (int i = rev.length()-1; i >= 0 ; i--){
            temp = temp + rev.charAt(i);
        }
        System.out.println("Given String is: "+rev +"\n and Reversed String is: "+temp);
    }
}
/*____________OUTPUT_____________
  Enter the String you want reverse
  abcd
  Given String is: abcd
  and Reversed String is: dcba
  _______________________________
*/