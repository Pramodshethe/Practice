package com.pramod.example;


import java.util.Collections;
import java.util.List;
import java.lang.Integer;
import java.util.Arrays;

public class LargestNumber {
    public static int largestnum(Integer a[],int total){
        List<Integer> list = Arrays.asList(a);
        Collections.sort(list);
        int element = list.get(total-1);
        return element;
    }

    public static void main(String[] args) {
        Integer a[] = {22,4,6,7,3,235,56};
        Integer b[] = {33,64,2,27,43,5,60};
        System.out.println("Largest Number: "+largestnum(a,a.length));
        System.out.println("Largest Number: "+largestnum(b,b.length));

    }
}
