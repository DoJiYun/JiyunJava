package com.company;

import java.util.Scanner;

public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        String k = keyboard.nextLine();
        int k1 = Integer.parseInt(k);
        String[] x=new String[k1];
        //String[] reverse=new String[k1];
        int[] y=new int[k1];
        //1int[] length=new int[x];
        int[] count=new int[k1];
        for (int i=0;i<k1;i++) {
            x[i] = keyboard.nextLine();
            y[i] = Integer.parseInt(x[i]);
            count[i]=0;
        }
        for (int i=0;i<k1;i++) {
            for (int j=2;j<y[i]-1;j++) {
                if (isPrime(j)==1) {
                    if (isPrime(j+2)==1) {
                        count[i]++;
                        // System.out.println(j);//
                    }
                }
            }
        }
        for (int i=0;i<k1;i++)
            System.out.println(count[i]);
    }
    public static String reverseString(String s) {
        return ( new StringBuffer(s) ).reverse().toString();
    }

    public static int isPrime(int number) {
        for (int i=2;i<=(number/2);i++) {
            if (number%i==0)
                return 0;
        }
        return 1;
    }
}