package com.pramod.example;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the sentence to COUNT words: ");
        String st = scan.nextLine();
        char ch[] = st.toCharArray();
        int count = 0;
        for (int i=0;i<st.length();i++){
            if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ')
                count++;
        }
        System.out.println("Number of words are: "+count);
    }
}

/*_________OUTPUT______
* Enter the sentence to COUNT words:
hi hello how are you
Number of words are: 5
 ______________________ */