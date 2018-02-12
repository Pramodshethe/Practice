package com.pramod.example;
import java.util.Arrays;

public class SecondLarNum {
    public static int secondLargestNum(int a[],int total){
        Arrays.sort(a);
        return a[total-2];
    }
    public static void main(String[] args) {
        int a[] = {22,4,6,7,3,235,56};
        int b[] = {33,64,2,27,43,5,60};
        System.out.println("Second Largest Number: "+secondLargestNum(a,a.length));
        System.out.println("Second Largest Number: "+secondLargestNum(b,b.length));
    }
}
