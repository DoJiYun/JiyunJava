package com.company;

import java.util.*;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        int t=keyboard.nextInt();
        keyboard.nextLine();
        String[] x=new String[t*2];
        long[] result=new long[t];
        for (int i=0;i<2*t;i++) {
            x[i]=keyboard.next();
        }
        for (int i=0;i<t;i++) {
            result[i] = Long.parseLong(x[2 * i], 2) + Long.parseLong(x[2*i+1],2);
        }
        for (int i=0;i<t;i++) {
            System.out.println(i + 1 + " " + Long.toBinaryString(result[i]));
        }
    }
}
