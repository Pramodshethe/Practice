//Using Recursion
public class FibRecExp {
    static int n1 = 0,n2 = 1,n3;
    static void recfib(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
            recfib(count-1);
        }
    }

    public static void main(String[] args) {
        int count = 10;
        System.out.println(n1+""+n2);
        recfib(count-2);

    }
}
