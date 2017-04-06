package com.company;

import java.util.*;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        int t=keyboard.nextInt();
        for (int i=0;i<t;i++) {
            double x1=keyboard.nextDouble();
            double y1=keyboard.nextDouble();
            double x2=keyboard.nextDouble();
            double y2=keyboard.nextDouble();
            double dx = x2 - x1;
            double dy = y2 - y1;
            double rad = Math.atan2(dy, dx);
            double degree = (rad * 180) / Math.PI;
            degree=Math.toRadians(degree);

            degree=Math.floor(degree*10000)/10000;
            double x=6371009*degree;
            double y=Math.pow((Math.pow(x2 - x1, 2)+Math.pow(y2-y1,2)),1/2);
            System.out.println(x+" "+y);

            System.out.println(degree);
            System.out.println(x);
        }
    }
}
