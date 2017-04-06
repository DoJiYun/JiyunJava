package com.company;

import java.util.*;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        int t=keyboard.nextInt();
        int[] x=new int[t];
        int m=0;
        int n=0;
        for (int i=0;i<t;i++) {
            x[i]=keyboard.nextInt();
            m+=x[i];
            if (m>n) {
                n=m;
            }
            else if (m<0) {
                m=0;
            }
        }
        System.out.println(n);
    }
}
