package com.company;

import java.util.*;

public class Main {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        int t=keyboard.nextInt();
        keyboard.nextLine();
        String[] x=new String[t];
        for (int i=0;i<t;i++) {
            x[i]=keyboard.nextLine();
        }
        Arrays.sort(x);
        String[] y=new String[t];
        for (int i=0;i<t;i++) {
            y[i]=x[t-i-1];
        }
        String k=y[0];
        for (int i=1;i<t;i++) {
            k=isPrefix(k, y[i]);
        }
        System.out.println(k);
    }

    public static String isPrefix(String a,String b) {
        int l1=a.length();
        int l2=b.length();
        if (l1<l2) {
            String x=a;
            a=b;
            b=x;
            int y=l1;
            l1=l2;
            l2=y;
        }
        for (int j=l2;;j--) {
            for (int i=0;i+j<=l2;i++) {
                String x=b.substring(i,i+j);
                if (a.contains(x)) {
                    return x;
                }
            }
        }
    }
}