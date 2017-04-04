package com.company;

import java.util.Scanner;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        double r,s,a,angle;
        r=keyboard.nextDouble();

        angle=Math.toRadians(36);
        s=2*r*Math.sin(angle);
        a=(5*s*s)/(4*Math.tan(angle));
        a=Math.round(a*100d)/100d;

        System.out.println(a);

    }
}
