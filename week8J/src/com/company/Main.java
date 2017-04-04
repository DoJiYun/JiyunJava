package com.company;

import java.util.*;

public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        int t=keyboard.nextInt();
        boolean check1=false;
        boolean check2=false;
        for (int i=0;i<t;i++) {
            int[] x=new int[4];
            int[] y=new int[4];
            int[] save=new int[4];
            for (int j=0;j<4;j++) {
                x[j]=keyboard.nextInt();
                y[j]=keyboard.nextInt();
            }
            double x1=(x[0]+x[1]+x[2]+x[3])/4;
            double y1=(y[0]+y[1]+y[2]+y[3])/4;

            /*double s1=Math.pow(x1-x[0],2);
            double s2=Math.pow(x1-x[1],2);
            double s3=Math.pow(x1-x[2],2);
            double s4=Math.pow(x1-x[3],2);*/
            double[] s=new double[3];
            s[0]=Math.pow(x[1]-x[0],2)+Math.pow(y[1]-y[0],2);
            s[1]=Math.pow(x[2]-x[0],2)+Math.pow(y[2]-y[0],2);
            s[2]=Math.pow(x[3]-x[0],2)+Math.pow(y[3]-y[0],2);

            Arrays.sort(s);

            if (s[0]==s[1])
                check1=true;
            if (s[0]*2==s[2])
                check2=true;
            if (check1 && check2) {
                System.out.println("square");
            }
            else
                System.out.println("not square");
            /*if (s1==s2 && s1==s3 && s1==s4) {
                check1=true;
            }

            if ((x[0]-x[1])/(y[0]-y[1])==(x[3]-x[2])/(y[3]-y[2]) || ((x[0]-x[1])/(y[0]-y[1]))*((x[3]-x[2])/(y[3]-y[2]))==-1) {
                check2=true;
            }

            if (check1 && check2) {
                System.out.println("square");
            }
            else
                System.out.println("not square");*/
        }
    }
}
