package com.company;

import java.util.*;

public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args){

        int count[] = new int[10];
        for (int i=0;i<10;i++)
            count[i]=0;

        while(keyboard.hasNext()){
            String a = keyboard.nextLine();
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) >= '0' && a.charAt(i) <= '9'){
                    count[a.charAt(i)-'0']++;
                }
            }
        }
        int max=count[0];
        for (int i=1;i<10;i++) {
            max = Math.max(max, count[i]);
        }
        //System.out.println(max);
        for (int i=max;i>0;i--) {
            for (int j=0;j<10;j++) {
                if (i<=count[j]) {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.printf("----------\n0123456789");
    }
}