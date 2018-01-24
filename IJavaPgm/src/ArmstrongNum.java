//Checking the given number is Armstrong number or not

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        do {
            int temp,a,c=0;
            System.out.println("Enter the number to test the Armstrong number: ");
            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();
            temp = number;
            while (number > 0) {
                a = number % 10;
                number = number / 10;
                c = c + (a * a * a);
            }
            if (temp == c) {
                System.out.println(temp + " is Armstrong number");
            } else {
                System.out.println(temp + " is not Armstrong number");
            }
        }while (true);
    }
}
