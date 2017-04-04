package com.company;

import java.util.Scanner;

public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
	    int x=keyboard.nextInt();
        double[] y=new double[x];
        for (int i=0;i<x;i++)
            y[i]=keyboard.nextDouble();
        double[] sum=new double[x];
        for (int i=0;i<x;i++)
            sum[i]=0;
        for (int j=0;j<x;j++) {
            for (int i = 0; i < y[j]; i++) {
                sum[j] = sum[j] + 4 * (Math.pow(-1, i+2) / (2 * i + 1));
            }
        }
        for (int i=0;i<x;i++) {
            sum[i]=Math.floor(sum[i]*10000)/10000;
            System.out.println(sum[i]);
        }
    }
}
