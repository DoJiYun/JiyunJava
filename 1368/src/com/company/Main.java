package com.company;

import java.util.Scanner;

public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
	    int dog,group;
        dog=keyboard.nextInt();
        group=keyboard.nextInt();

        int[] a=new int[dog];
        int[] b=new int[group];
        int[] c=new int[group];
        int[] max=new int[group];
        int[] min=new int[group];
        int[] gap=new int[group];

        for (int i=0; i<dog; i++) {
            a[i]=keyboard.nextInt();
        }
        for (int i=0; i<group; i++) {
            b[i]=keyboard.nextInt();
            c[i]=keyboard.nextInt();
        }
        for (int i=0; i<group; i++) {
            max[i]=a[b[i]-1];
            min[i]=a[b[i]-1];
        }
        for (int i=0; i<group; i++) {
            for (int j = b[i]; j <= c[i]; j++) {
                    max[i] = Math.max(a[j-1], max[i]);
                    min[i] = Math.min(a[j-1], min[i]);
            }
        }
        for (int i=0; i<group; i++) {
            System.out.println(max[i]-min[i]);
        }
    }
}
