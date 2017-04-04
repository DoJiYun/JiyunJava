package com.company;
import java.util.Scanner;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        int t=keyboard.nextInt();
        int[] x=new int[t*2];
        for (int i=0;i<t*2;i++) {
            x[i]=keyboard.nextInt();
        }
        for (int i=0;i<t;i++) {
            boolean[] y=new boolean[x[2*i]];
            for (int l=0;l<x[2*i];l++) {
                y[l]=false;
            }
            for (int j=0;j<x[2*i];j++) {
                for (int k=1;k<x[2*i+1]+1;k++) {
                    if ((j+1)*k<=x[2*i]) {
                        y[(j+1)*k-1]=!y[(j+1)*k-1];
                    }
                }
            }
            if (y[x[2*i+1]-1]==false)
                System.out.println("close");
            else
                System.out.println("open");
        }
    }
}
