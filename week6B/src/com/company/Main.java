package com.company;

import java.util.Scanner;

public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        String k=keyboard.nextLine();
        int x=Integer.parseInt(k);

        String[] m=new String[x];
        int[] length=new int[x];
        String[] reverse=new String[x];
        for (int i=0;i<x;i++) {
            m[i] = keyboard.nextLine();
            length[i]=m[i].length();
            reverse[i]="";
        }
        for (int i=0;i<x;i++) {
            for (int j=length[i]-1;j>=0;j--) {
                reverse[i]=reverse[i]+m[i].charAt(j);
            }
            System.out.println(reverse[i]);
        }
    }
}