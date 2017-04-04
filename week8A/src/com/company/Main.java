package com.company;

import java.util.*;

public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int t = keyboard.nextInt();
        int[] x = new int[7];
        String[] y = new String[t];
        int[] sum = new int[t];
        for (int i = 0; i < t; i++) {
            y[i] = keyboard.next();
            for (int j = 0; j < 7; j++) {
                x[j] = keyboard.nextInt();
                sum[i] += x[j];
            }
        }
        int[] save = new int[t];
        for (int i = 0; i < t; i++)
            save[i] = sum[i];
        Arrays.sort(sum);
        for (int i=t-1;i>=0;i--) {
            for (int j=0;j<t;j++) {
                if (save[j]==sum[i]) {
                    if (i!=0 && sum[i]==sum[i-1]) {
                        //System.out.println(y[j]+"1: "+sum[i]);
                        //j++;
                        break;
                    }
                    else
                        System.out.println(y[j]+" "+sum[i]);
                }
            }
        }
    }
}
