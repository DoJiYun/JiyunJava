package com.company;


import java.util.*;

public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        int t=keyboard.nextInt();
        keyboard.nextLine();
        String[] x=new String[t];
        int[] y=new int[t];
        int[] z=new int[t];
        for (int i=0;i<t;i++) {
            x[i]=keyboard.nextLine();
            int a=x[i].indexOf(" ");
            //System.out.println(a);
            String j=x[i].substring(a+1);
            y[i]=Integer.parseInt(j);
            //System.out.println(y[i]);
            z[i]=y[i];
        }
        Arrays.sort(y);
        for (int i=0;i<t;i++) {
            if (y[t-1]==z[i]) {
                System.out.println(x[i]);
            }
        }
        for (int i=0;i<t;i++) {
            if (y[t-2]==z[i]) {
                System.out.println(x[i]);
            }
        }
    }
}