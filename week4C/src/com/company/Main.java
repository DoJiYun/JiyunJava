package com.company;

import java.util.Scanner;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        double s,a,b;
        int n;

        n=keyboard.nextInt();
        s=keyboard.nextDouble();

        a=(n*s*s)/(4*Math.tan(Math.PI/n));
        if (a>0) {
            a=Math.floor(100*a);
            a/=100;
        }
        else {
            a*=-1;
            a=Math.floor(100*a);
            a/=100;
            a*=-1;
        }
        System.out.printf("%.2f",a);
    }
}
