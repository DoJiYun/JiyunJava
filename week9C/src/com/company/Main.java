package com.company;

import java.util.*;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
	    int t=keyboard.nextInt();
        long k=0;
        java.util.Date date=new java.util.Date(k);

        long[] x=new long[t];
        for (int i=0;i<t;i++) {
            x[i]=keyboard.nextLong();
            date.setTime(x[i]);
            System.out.println(date.toString());
        }

    }
}
