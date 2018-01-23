//Finding Prime number
import java.util.Scanner;

public class PrimeNum {
    static void checkprime(int n) {
        int i, m = 0, flag = 0;
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println(n + "Is not a prime number");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " Is  not a prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("Is a prime number");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scan.nextInt();
        scan.close();
        checkprime(num);
    }
}
