package com.pramod.example;

public class SwapTwoNum {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Before Swap value of a: "+a+" And b: "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swap value of a: "+a+" And b: "+b);
    }

}
/*_________________OUTPUT_______________
    Before Swap value of a: 5 And b: 10
    After Swap value of a: 10 And b: 5
  ______________________________________
     */