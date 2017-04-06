package com.company;

import java.util.*;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
	    int t=keyboard.nextInt();
        int[] a=new int[t];

        for (int i=0;i<t;i++) {
            a[i]=keyboard.nextInt();
        }
        int[] sum=new int[t];

        for (int i=0;i<t;i++) {
            for (int j=1;j<=a[i];j++) {
                sum[i]+=j*(j+1)*(j+2)/2;
            }
        }

        for (int i=0;i<t;i++) {
            System.out.println((i+1)+" "+a[i]+" "+sum[i]);
        }
    }
}
