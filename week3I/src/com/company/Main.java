package com.company;

import java.util.Scanner;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
	    double x1,x2,x0,y1,y2,y0;

        x0=keyboard.nextDouble();
        y0=keyboard.nextDouble();
        x1=keyboard.nextDouble();
        y1=keyboard.nextDouble();
        x2=keyboard.nextDouble();
        y2=keyboard.nextDouble();

        double a,b,angle;
        a=x1-x0;
        b=y1-y0;
        angle=a/b;

        if (a/b>0 || a/b<0) {
            if (a*(y2-y0)-(x2-x0)*b>0) {
                System.out.println("left");
            }
            else if (a*(y2-y0)-(x2-x0)*b==0) {
                System.out.println("on the line");
            }
            else
                System.out.println("right");
        }


        else if (a==0) {
            if (y2==0)
                System.out.println("on the line");
            else if (y2!=0) {
                if (x0>x1) {
                    if (y2>0)
                        System.out.println("right");
                    else
                        System.out.println("left");
                }
                else {
                    if (y2>0)
                        System.out.println("left");
                    else
                        System.out.println("right");
                }
            }
        }

        else if (b==0) {
            if (x2==0)
                System.out.println("on the line");
            else if (x2!=0) {
                if (y0>y1) {
                    if (x2<0)
                        System.out.println("right");
                    else
                        System.out.println("left");
                }
                else {
                    if (x2<0)
                        System.out.println("left");
                    else
                        System.out.println("right");
                }
            }
        }
    }
}