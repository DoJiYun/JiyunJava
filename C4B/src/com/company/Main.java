package com.company;

import java.util.*;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        int t=keyboard.nextInt();
        double[] a=new double[t];
        for (int i=0;i<t;i++) {
            a[i]=keyboard.nextDouble();
        }
        for (int i=0;i<t;i++) {
            System.out.println(a[i]);
        }
    }
}
