package com.company;

import java.util.*;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
	    int t=keyboard.nextInt();
        for (int i=0;i<t;i++) {
            int m=keyboard.nextInt();
            int n=1;
            double x=1;
            double y=0;
            while (true) {
                x = Math.sqrt(m * n);
                y = Math.floor(x);
                if (x==y) {
                    break;
                }
                n++;
            }
            System.out.println((m*n)+" = "+m+" x "+n);
            //System.out.println(m+" "+n+" "+x+" "+y);
        }
    }
}
