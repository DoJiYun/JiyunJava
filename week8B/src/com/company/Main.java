package com.company;

import java.util.Scanner;

public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        int[] a=new int[9];
        int[] b=new int[9];
        int[] c=new int[9];

        for (int i=0;i<9;i++)
            a[i]=keyboard.nextInt();
        for (int i=0;i<9;i++)
            b[i]=keyboard.nextInt();

        c[0]=a[0]*b[0]+a[1]*b[3]+a[2]*b[6];
        c[1]=a[0]*b[1]+a[1]*b[4]+a[2]*b[7];
        c[2]=a[0]*b[2]+a[1]*b[5]+a[2]*b[8];

        c[3]=a[3]*b[0]+a[4]*b[3]+a[5]*b[6];
        c[4]=a[3]*b[1]+a[4]*b[4]+a[5]*b[7];
        c[5]=a[3]*b[2]+a[4]*b[5]+a[5]*b[8];

        c[6]=a[6]*b[0]+a[7]*b[3]+a[8]*b[6];
        c[7]=a[6]*b[1]+a[7]*b[4]+a[8]*b[7];
        c[8]=a[6]*b[2]+a[7]*b[5]+a[8]*b[8];

        System.out.println(c[0]+" "+c[1]+" "+c[2]);
        System.out.println(c[3]+" "+c[4]+" "+c[5]);
        System.out.println(c[6]+" "+c[7]+" "+c[8]);
    }
}
