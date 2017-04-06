package com.company;

import java.util.*;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
	    int t=keyboard.nextInt();
        long[] x=new long[t];
        for (int i=0;i<t;i++) {
            x[i]=keyboard.nextLong();
        }
        long[] count=new long[t];
        Arrays.fill(count,0);
        for (int i=0;i<t;i++) {
            for (int j=1;j<=x[i];j++) {
                String a=String.valueOf(x[i]);
                for (int k=1;k<a.length();k++) {
                    if (j % Math.pow(10,k) == 0) {
                        count[i]++;
                    }
                }
            }
        }
        for (int i=0;i<t;i++) {
            System.out.println(count[i]);
        }
    }
}
