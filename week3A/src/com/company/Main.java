package com.company;

import java.util.Scanner;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        double a,b,c;
        double m,n,x1,x2;
        a=keyboard.nextDouble();
        b=keyboard.nextDouble();
        c=keyboard.nextDouble();
        m=b*b-4*a*c;
        n=Math.pow(m,0.5);
        x1=(-b+n)/(2*a);
        x2=(-b-n)/(2*a);
        x1=Math.floor(x1*10)/10;
        x2=Math.floor(x2*10)/10;
        if (a>0) {
            if (m>=0) {
                System.out.println(x1);
            }
            else
                System.out.println("complex");
        }
        else {
            if (m >= 0)
                System.out.println(x2);
            else
                System.out.println("complex");
        }
    }
}