package com.company;

import java.util.Scanner;
public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        double m;
        double f,l,ll,f1;
        double i,j;
        double a;
        i = 3.2808;
        j=39.3701;
        m = keyboard.nextDouble();
        l=m*j;
        f=l/12;
        a=Math.floor(f);

        l=12*(f-a);
        l=Math.floor(l);

        System.out.printf("%.0f\n",a);
        System.out.printf("%.0f",l);
    }
}
