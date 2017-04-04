package com.company;

import java.util.Scanner;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
	    double x1,x2,y1,y2,r1,r2,r3,r;
        double x,y,l;
        x1=keyboard.nextDouble();
        y1=keyboard.nextDouble();
        x2=keyboard.nextDouble();
        y2=keyboard.nextDouble();
        r=6371.01;
        r1=Math.toRadians(x1);
        r2=Math.toRadians(x2);
        r3=Math.toRadians(y1-y2);

        l=r*Math.acos(Math.sin(r1)*Math.sin(r2)+Math.cos(r1)*Math.cos(r2)*Math.cos(r3));

        l=Math.round(l*100d)/100d;
        System.out.println(l);
    }
}
