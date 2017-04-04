package com.company;

import java.util.Scanner;

public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        double x1,x2,x3,y1,y2,y3,area;
        x1=keyboard.nextDouble();
        y1=keyboard.nextDouble();
        x2=keyboard.nextDouble();
        y2=keyboard.nextDouble();
        x3=keyboard.nextDouble();
        y3=keyboard.nextDouble();
        area=x1*y2+x2*y3+x3*y1-x2*y1-x3*y2-x1*y3;
        area=Math.abs(area);
        area=area/2;
        area=area*10;
        area=(int)area;
        area=area/10;
        System.out.println(area);

    }
}
