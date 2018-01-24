//Checking Palindrome number
import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        do {
            int temp, r, sum = 0;
            System.out.println("Enter the number to check Palindrome");
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            temp = n;
            while (n > 0) {
                r = n % 10;
                sum = (sum * 10) + r;
                n = n / 10;
            }
            if (temp == sum) {
                System.out.println(temp + " is palindrome number");
            } else {
                System.out.println(temp + " is not a palindrome number");
            }
        }while(true);
    }
}
