import java.util.Scanner;

public class MatrixMulti {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the base of the matrices ");
         n = scan.nextInt();
        int a[][] = new int[n][n];
        int b[][] = new int[n][n];
        //int a[][] = {{1,1,1,},{2,2,2},{3,3,3}};
        //int b[][] = {{1,1,1},{2,2,2},{3,3,3}};
        int c[][] = new int[n][n];
        System.out.println("Enter the elements of 1st matrices");
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                a[i][j] = scan.nextInt();
            }
        }

        System.out.println("Enter the elements of 2nd matrices");
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                b[i][j] = scan.nextInt();
            }
        }

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                c[i][j] = 0;
                for (int k=0;k<3;k++){
                    c[i][j]+= a[i][k] * b[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
