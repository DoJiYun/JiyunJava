package com.company;

import java.util.*;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
	    int t=keyboard.nextInt(); int p=keyboard.nextInt();
        int[] x1=new int[t];
        int[] y1=new int[t];
        int[] x2=new int[p];
        int[] y2=new int[p];

        for (int i=0;i<t;i++) {
            x1[i]=keyboard.nextInt();
            y1[i]=keyboard.nextInt();
        }
        for (int i=0;i<p;i++) {
            x2[i]=keyboard.nextInt();
            y2[i]=keyboard.nextInt();
        }


    }
}
