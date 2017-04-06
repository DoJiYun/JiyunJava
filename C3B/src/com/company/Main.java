package com.company;

import java.util.Scanner;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
	    int a=keyboard.nextInt();
        for(int i=0;i<a/2;i++) {
            for (int j=0;j<a/2-i;j++)
                System.out.printf(" ");
            for (int j=0;j<i*2+1;j++)
                System.out.printf("*");
            System.out.printf("\n");
        }
        for(int i=0;i<a;i++)
            System.out.printf("*");
        System.out.printf("\n");
        for(int i=a/2-1;i>=0;i--)
        {
            for(int j=0;j<a/2-i;j++)
                System.out.printf(" ");
            for(int j=0;j<i*2+1;j++)
                System.out.printf("*");
            System.out.printf("\n");
        }
    }
}
