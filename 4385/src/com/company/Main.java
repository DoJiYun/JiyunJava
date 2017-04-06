package com.company;

import java.util.*;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
	    int t=keyboard.nextInt();
        for (int i=0;i<t;i++) {
            int a=keyboard.nextInt();
            int[] x=new int[a];
            for (int j=0;j<a;j++) {
                x[j]=keyboard.nextInt();
            }
            Arrays.sort(x);
            //int result=0;
            //int gcd=x[0];
            //int max=GCD(x[0],x[1])*2;
            int[] result=new int[a];
            for (int j=0;j<a;j++) {
                int gcd=x[0];
                int max=GCD(x[0],x[1])*2;
                int count=0;
                for (int k=j+1;k<a;k++) {
                    count++;
                    gcd=GCD(gcd,x[k]);
                    max=Math.max(max,gcd*(count+1));
                }
                result[j]=max;
            }
            for (int j=0;j<a;j++) {
                System.out.println(result[j]);
            }
        }
    }

    private static int GCD(int a,int b) {
        if (b==0) {
            return a;
        }
        return GCD(b,a%b);
    }
}
