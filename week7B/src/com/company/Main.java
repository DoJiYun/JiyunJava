package com.company;

import java.util.*;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        String t1=keyboard.nextLine();
        int t=Integer.parseInt(t1);

        String[] x=new String[t];
        int[] y=new int[t];
        int[] count=new int[201];
        int[] z=new int[t];
        for (int i=0;i<201;i++)
            count[i]=0;
        for (int i=0;i<t;i++) {
            x[i]=keyboard.nextLine();
            y[i]=Integer.parseInt(x[i]);
            if (y[i]<0) {
                count[y[i] + 201]++;
            }
            else {
                count[y[i]]++;
            }
            z[i]=y[i];
        }

        Arrays.sort(y);
        for (int i=0;i<t;i++) {
            if (y[i]<0) {
                if (i!=t-1) {
                    if (y[i] != y[i + 1])
                        System.out.println(y[i] + " " + count[y[i] + 201]);
                }
                else
                    System.out.print(y[i]+" "+count[y[i]]);
            }
            else {
                if (i!=t-1) {
                    if (y[i] != y[i + 1])
                        System.out.println(y[i] + " " + count[y[i]]);
                }
                else
                    System.out.print(y[i]+" "+count[y[i]]);
            }
        }
    }
}
