package com.company;

import java.util.Scanner;

public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
	    int x=keyboard.nextInt();

        double[] y=new double[2*x];

        for (int i=0;i<2*x;i++) {
            y[i]=keyboard.nextDouble();
        }

        double a,b;

        for (int i=0;i<x;i++) {
            a=(y[2*i]+y[2*i+1])/2;
            b=y[2*i]-a;
           // System.out.println(a+" "+b);
            if (a<0 || b<0 || a!=(int)a)
                System.out.println("impossible");
            else
                System.out.printf("%.0f %.0f\n",a,b);
        }
    }
}
