package com.company;

import java.util.*;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        String t1=keyboard.nextLine();
        int t=Integer.parseInt(t1);

        String[] x=new String[t];
        int[] y=new int[t];

        for (int i=0;i<t;i++) {
            x[i]=keyboard.nextLine();
            y[i] = Integer.parseInt(x[i]);
        }

        int max=y[0];
        for (int i=1;i<t;i++) {
            max=Math.max(max,y[i]);
        }

        for (int i=0;i<t;i++) {
            if (y[i]>=max-10)
                System.out.println("A");
            else if(y[i]>=max-20 && y[i]<max-10)
                System.out.println("B");
            else if(y[i]>=max-30 && y[i]<max-20)
                System.out.println("C");
            else if (y[i]>=max-40 && y[i]<max-30)
                System.out.println("D");
            else
                System.out.println("F");
        }
    }
}
