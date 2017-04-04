package com.company;

import java.util.Scanner;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        double a,b,a1,b1;

        a=keyboard.nextDouble();
        b=keyboard.nextDouble();
        a1=Math.abs(a);
        b1=Math.abs(b);
        if (a1<5 && b1<2.5) {
            System.out.println("in");
        }
        else if (a1==5 && b1<=2.5){
            System.out.println("on");
        }
        else if (a1<=5 && b1==2.5)
            System.out.println("on");
        else
            System.out.println("out");
    }
}
