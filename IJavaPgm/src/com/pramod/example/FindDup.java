package com.pramod.example;

import java.util.Scanner;

public class FindDup {
    static void duplicate(int a[],int n){
        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                if (a[i] == a[j]){
                    System.out.println("duplicate element found: "+a[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {2,3,4,5,6,4,};
        duplicate(a,a.length);
    }
}
