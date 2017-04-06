package com.company;

import java.util.Scanner;

public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        int t=keyboard.nextInt();
        int[] x=new int[t];

        for (int i=0;i<t;i++) {
            x[i]=keyboard.nextInt();
            double avg=0;
            double count=0;
            double[] y=new double[x[i]];
            for (int j=0;j<x[i];j++) {
                y[j] = keyboard.nextInt();
            }
            for (int j=0;j<x[i];j++) {
                avg+=y[j];
            }
            avg/=x[i];
            for (int j=0;j<x[i];j++) {
                if (y[j]>avg) {
                    count++;
                }
            }
            //System.out.println(count);
            //System.out.println(x[i]);
            double result=count/x[i]*100;
            System.out.printf("%.3f%%\n",result);
        }
    }
}
