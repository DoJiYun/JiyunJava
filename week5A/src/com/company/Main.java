package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        int a=keyboard.nextInt();
        String[] x=new String[a];
        int[] y=new int[a];
        int[] z=new int[a];
        int count=0;

        for (int i=0;i<a;i++) {
            x[i]=keyboard.next();
            y[i]=keyboard.nextInt();
        }
        for (int i=0; i<a; i++) {
            z[i]=y[i];
        }

        int max=y[0];
        for (int i=1;i<a;i++)
            max=Math.max(max,y[i]);

        for (int i=0;i<a;i++) {
            if (max==y[i]) {
                System.out.println(x[i]+" "+y[i]);
            }
            else
                continue;
        }

        Arrays.sort(z);
        for (int i=0; i<a; i++) {
            if (z[a - 2] == y[i])
                System.out.println(x[i]+" "+y[i]);
        }
    }
}
