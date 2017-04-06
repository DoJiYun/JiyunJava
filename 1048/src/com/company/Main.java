package com.company;

import java.util.*;

public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        int t=keyboard.nextInt();

        for (int i=0;i<t;i++) {
            int x=keyboard.nextInt();
            int[] y=new int[x];
            double sum=0;
            for (int j=0;j<x;j++) {
                y[j]=keyboard.nextInt();
                sum+=y[j];
            }
            sum/=4;
            if (Math.floor(sum)!=sum) {
                System.out.println("no");
            }
            else {
                if (x==4) {
                    for (int j=0;j<4;j++) {
                        if (y[j]!=sum)
                            System.out.println("no");
                        else
                            System.out.println("yes");
                    }
                }
            }
            System.out.println(sum);

        }

    }
}
