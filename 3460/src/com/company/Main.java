package com.company;

import java.util.Scanner;

public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        double[] x=new double[10000000];
        double[] y=new double[10000000];
        for (int i=0;;i++) {
            x[i]=keyboard.nextDouble();
            y[i]=3*x[i];
            if (x[i]==0)
                break;
        }

        for (int i=0;x[i]!=0;i++) {
            x[i]*=3;
            if (x[i]%2==0) {
                x[i]/=2;
                x[i]*=3;
                x[i]/=9;
                x[i]=Math.floor(x[i]);
            }
            else {
                x[i]=(x[i]+1)/2;
                x[i]*=3;
                x[i]/=9;
                x[i]=Math.floor(x[i]);
            }
        }
        for (int i=0;y[i]!=0;i++) {
            if(y[i]%2==0) {
                System.out.print((i+1)+". even ");
                System.out.printf("%.0f\n",x[i]);
            }
            else {
                System.out.print((i+1)+". odd ");
                System.out.printf("%.0f\n",x[i]);
            }
        }
    }
}
