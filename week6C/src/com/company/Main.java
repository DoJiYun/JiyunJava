package com.company;

import java.util.Scanner;

public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        String t=keyboard.nextLine();
        int k=Integer.parseInt(t);
        String[] x=new String[k];
        for (int i=0;i<k;i++) {
            x[i]=keyboard.nextLine();
        }
        for (int i=0;i<k;i++) {
            if (isLength(x[i])==1 && isHave(x[i])==1 && isCount(x[i])==1)
                System.out.println("Valid");
            else
                System.out.println("Invalid");
        }
    }

    public static int isLength(String a) {
        int x=a.length();
        if (x>=8)
            return 1;
        return 0;
    }

    public static int isHave(String a) {
        int x=a.length();
        int count=0;
        for (int j=0;j<x;j++) {
            char z=a.charAt(j);
            if (('0'<=z && z<='9') || ('A'<=z && z<='Z') || ('a'<=z && z<='z'))
                count++;
        }
        if (count==x)
            return 1;
        else
            return 0;
    }

    public static int isCount(String a) {
        int x=a.length();
        int count=0;
        for (int j=0;j<x;j++) {
            char z=a.charAt(j);
            if (('0'<=z && z<='9'))
                count++;
        }
        if (count>=2)
            return 1;
        else
            return 0;
    }
}