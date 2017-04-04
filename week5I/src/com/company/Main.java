package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        int a=keyboard.nextInt();
        int[] x=new int[a];
        double[] sum=new double[a];
        for (int i=0; i<a; i++)
            x[i]=keyboard.nextInt();
        for (int i=0; i<a; i++)
            sum[i]=1;
        for (int j=0; j<a; j++) {
            for (int i=1; i<=x[j]; i++) {
                sum[j]=sum[j]+(1/factorial(i));
            }
        }
        for (int i=0;i<a;i++) {
            sum[i] = Math.floor(sum[i] * 1000000) / 1000000;
            System.out.printf("%.6f\n", sum[i]);
        }
    }

    public static double factorial(int n) {

        if (n == 1) return 1;

        else return n * factorial(n - 1);

    }
}
