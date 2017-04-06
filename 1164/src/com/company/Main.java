package com.company;

import java.util.*;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
	    int t=keyboard.nextInt();
        for (int jiyun=0;jiyun<t;jiyun++) {
            int n=keyboard.nextInt();
            int m=keyboard.nextInt();
            int l=keyboard.nextInt();

            int[] x=new int[m];
            int[] y=new int[m];
            int[] input=new int[l];
            int[] result=new int[l];
            for (int i=0;i<m;i++) {
                x[i]=keyboard.nextInt();
                y[i]=keyboard.nextInt();
            }
            for (int i=0;i<l;i++) {
                input[i]=keyboard.nextInt();
            }

            for (int i=0;i<l;i++) {
                for (int j=0;j<m;j++) {
                    if (input[i]==x[j] || input[i]==y[j])
                        result[i]++;
                }
            }
            for (int i=0;i<l;i++) {
                System.out.println(result[i]);
            }
        }
    }
}
