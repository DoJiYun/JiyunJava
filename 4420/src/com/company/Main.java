package com.company;

import java.util.*;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        int t=keyboard.nextInt();
        for (int i=1;i<t+1;i++) {
            int j=0;
            while (i+j<5) {
                System.out.print(" ");
                j++;
            }
            for (int k=0;k<i*2-1;k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
