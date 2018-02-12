package com.pramod.example;

public class ThirdLarNum {
    public static int getThirdLargestNum(int a[],int total){
        int temp;
        for(int i=0;i<total;i++){
            for(int j=i+1;j<total;j++){
                if (a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total-3];
    }

    public static void main(String[] args) {
        int a[] = {1,2,5,6,3,2};
        int b[] = {11,22,35,66,23,20,99};
        System.out.println("third largest "+getThirdLargestNum(a,6));
        System.out.println("third largest "+getThirdLargestNum(b,7));
    }
}
