package com.company;

import java.util.*;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void  main(String[] args) {
	    int t=keyboard.nextInt();
        for (int i=0;i<t;i++) {
            int r=keyboard.nextInt();
            int c=keyboard.nextInt();
            int n=keyboard.nextInt();

            char[][] x=new char[r][c];
            String[] y=new String[r];
            for (int j=0;j<r;j++) {
                y[j]=keyboard.nextLine();
            }
            for (int j=0;j<r;j++) {
                for (int k=0;k<c;k++) {
                    x[j][k]=y[j].charAt(k);
                }
            }

            for (int j=0;j<r;j++) {
                for (int k=0;k<c;k++) {
                    System.out.println(x[j][k]);
                }
            }
        }
    }
}
