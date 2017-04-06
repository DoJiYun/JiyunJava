package com.company;

import java.util.*;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        String a=keyboard.nextLine();
        String b=keyboard.nextLine();
        int l1=a.length();
        int l2=b.length();
        String[] x=new String[l1];
        String[] y=new String[l2];
       // int[] count=new int[l1];
        for (int i=0;i<l1;i++) {
            x[i]=a.substring(i,i+1);
            //System.out.println(x[i]);
        }
        for (int i=0;i<l2;i++) {
            y[i]=b.substring(i,i+1);
            //System.out.println(y[i]);
        }
        String result="";
        for (int i=0;i<l1;i++) {
            for (int j=0;j<l2;j++) {
                if (x[i].equals(y[j])) {
                    x[i]="";
                }
            }
            result+=x[i];
        }
        System.out.print(result);
    }
}
