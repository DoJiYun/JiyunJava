package com.company;

import java.util.*;

public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        int a=keyboard.nextInt();
        int b=keyboard.nextInt();
        int x=keyboard.nextInt();
        int[] I=new int[a];
        int[] J=new int[b];
        for (int i=0;i<a;i++) {
            I[i]=keyboard.nextInt();
        }
        for (int i=0;i<b;i++) {
            J[i]=keyboard.nextInt();
        }

        int diff=Math.abs(I[0]+J[0]-x);


        int l=0,r=b-1;
        int res_l=l,res_r=r;

        while (l<a && r>=0) {
            if (Math.abs(I[l]+J[r]-x)<diff) {
                res_l=l;
                res_r=r;
                diff=Math.abs(I[l]+J[r]-x);
            }
            if (I[l]+J[r]>x)
                r--;
            else
                l++;
        }
        System.out.println(Math.abs(I[res_l]+J[res_r]-x));
    }
}