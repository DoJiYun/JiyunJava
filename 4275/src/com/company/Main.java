package com.company;

import java.util.Scanner;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
	    int a=keyboard.nextInt();
        int b=keyboard.nextInt();
        int[] x= new int[a];
        for (int i=0; i<a; i++) {
            x[i] = keyboard.nextInt();
        }
        int[] y=new int[2*b];
        for (int j=0; j<2*b; j++) {
            y[j]=keyboard.nextInt();
        }
        int[] sum=new int[b];
        for (int k=0; k<b; k++) {
            int a1,a2;
            a1=y[2*k];
            a2=y[2*k+1];
            for (int a3=a1; a3<=a2; a3++)
                sum[k]+=x[a3];
        //    System.out.println(sum[k]);
        }
        int m=sum[0];
        for (int j=1; j<b; j++) {
            m=Math.max(m,sum[j]);
        }
        System.out.println(m);
    }
}
