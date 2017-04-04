package com.company;

import java.util.Scanner;

public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
	    int t=keyboard.nextInt();

        int[] x=new int[t*2];

        for(int i=0; i<2*t; i++) {
            x[i]=keyboard.nextInt();
        }

        for(int i=0;i<t;i++) {
            System.out.println(GCD(x[2*i],x[2*i+1]));
        }
    }
    private  static int GCD(int a,int b) {
        if (b==0) {
            return a;
        }
        return GCD(b,a%b);
    }
}
