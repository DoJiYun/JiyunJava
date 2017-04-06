package com.company;

import java.util.*;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        int t=keyboard.nextInt();
        int p=keyboard.nextInt();
        double[] x1=new double[t];
        double[] y1=new double[t];
        double[] x2=new double[p];
        double[] y2=new double[p];
        double[][] result=new double[p][t];
        for (int i=0;i<t;i++) {
            x1[i]=keyboard.nextDouble();
            y1[i]=keyboard.nextDouble();
        }
        for (int i=0;i<p;i++) {
            x2[i]=keyboard.nextDouble();
            y2[i]=keyboard.nextDouble();
        }

        for (int i=0;i<p;i++) {
            for (int j=0;j<t;j++) {
                result[i][j]=Math.pow(x2[j]-x1[i],2)+Math.pow(y2[j]-y1[i],2);
            }
        }
        for (int i=0;i<p;i++) {
            for (int j=0;j<t;j++) {
                System.out.println(result[i][j]);
            }
        }
    }
}
