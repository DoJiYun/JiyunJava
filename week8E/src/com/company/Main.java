package com.company;


import java.util.*;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args)  {
        int t=keyboard.nextInt();

        int[][] x=new int[t][2];

        for (int i=0;i<t;i++) {
            for (int j=0;j<2;j++)
                x[i][j]=keyboard.nextInt();
        }

        for (int i=0;i<t;i++) {
            for (int j=0;j<t;j++) {
                if (x[i][0] < x[j][0]) {
                    int a = x[i][0];
                    x[i][0] = x[j][0];
                    x[j][0] = a;
                    a = x[i][1];
                    x[i][1] = x[j][1];
                    x[j][1] = a;
                }
            }
        }

        for (int i=0;i<t-1;i++) {
            for (int j=i+1;j<t;j++) {
                if (x[i][0]==x[j][0]) {
                    if (x[i][1]>x[j][1]) {
                        int a=x[i][1];
                        x[i][1]=x[j][1];
                        x[j][1]=a;
                    }
                }
            }
        }

        for (int i=0;i<t;i++) {
                System.out.println(x[i][0]+" "+x[i][1]);
        }
    }
}
