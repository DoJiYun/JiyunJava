package com.company;

import java.util.*;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
	    int t=keyboard.nextInt();
        int[] x=new int[t];
        int[] y=new int[t];
        boolean[] check=new boolean[t];
        for (int i=0;i<t;i++) {
            x[i]=keyboard.nextInt();
            y[i]=keyboard.nextInt();
            check[i]=false;
        }
        for (int i=0;i<t;i++) {
            if (x[i] == y[i]) {
                check[i]=true;
            }
            else if (x[i]-y[i]==2) {
                check[i]=true;
            }
        }
        for (int i=0;i<t;i++) {
            if (!check[i]) {
                System.out.println("No Number");
            }
            else {
                if (x[i]==y[i] && x[i]%2==0) {
                    System.out.println(x[i]+y[i]);
                }
                else if (x[i]==y[i] && x[i]%2==1) {
                    System.out.println(x[i]+y[i]-1);
                }
                else if (x[i]!=y[i] && x[i]%2==0) {
                    System.out.println(x[i]+y[i]);
                }
                else if (x[i]!=y[i] && x[i]%2==1) {
                    System.out.println(x[i]+y[i]-1);
                }
            }
        }
    }
}
