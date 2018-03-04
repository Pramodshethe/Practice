//Finding Sum of Prime numbers
package com.pramod.example;

import java.util.Scanner;

public class SumOfPrimeNumber {
    public static void main(String[] args) {
        int sum = 0;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the Number: ");
            int number = scan.nextInt();
            for (int i = 2; i < number; i++) {
                int flag = 0;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0)
                        flag = 1;
                }
                if (flag == 0) {
                    System.out.print(i + " ");
                    sum = sum + i;
                }
            }
            System.out.println("Sum: " + sum);
        }while (true);
    }
}
/*
_____________OUTPUT____________
        Enter the Number until
        10
        2 3 5 7 Sum: 17
_______________________________*/