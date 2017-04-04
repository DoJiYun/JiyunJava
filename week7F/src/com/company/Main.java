package com.company;

import java.util.Scanner;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        boolean[] a=new boolean[100];
        for (int i=0;i<100;i++)
            a[i]=false;
        int t=keyboard.nextInt();
        int[] x=new int[t];
        for (int i=0;i<t;i++)
            x[i]=keyboard.nextInt();
        //a[0]=!a[0];
        //System.out.println(a[0]);
        for (int i=0;i<100;i++) {
            for (int j=1;j<101;j++) {
                if((i+1)*j<=100) {
                    a[(i+1)*j-1]=!a[(i+1)*j-1];
                }
            }
        }

        for (int i=0;i<t;i++) {
            if (a[x[i] - 1] == false)
                System.out.println("close");
            else
                System.out.println("open");
        }
    }
}
