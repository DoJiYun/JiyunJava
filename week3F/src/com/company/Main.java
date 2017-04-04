package com.company;

import java.util.Scanner;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        double x1,x2,y1,y2,x3,x4,y3,y4;
        double m1,m2;

        x1=keyboard.nextDouble();
        y1=keyboard.nextDouble();
        x2=keyboard.nextDouble();
        y2=keyboard.nextDouble();
        x3=keyboard.nextDouble();
        y3=keyboard.nextDouble();
        x4=keyboard.nextDouble();
        y4=keyboard.nextDouble();

        double a,b,c,d,e,f;
        a=(y1-y2);
        b=x2-x1;
        c=y3-y4;
        d=x4-x3;
        e=(y1-y2)*x1-(x1-x2)*y1;
        f=(y3-y4)*x3-(x3-x4)*y3;
        if ((y1-y2)*(x4-x3)-(x2-x1)*(y3-y4)==0)
            System.out.println("parallel");
        else {
            m1=(e*d-b*f)/(a*d-b*c);
            m2=(a*f-e*c)/(a*d-b*c);
            if (m1<0 && m2>0) {
                m1=(-1)*m1;
                m1=Math.floor(m1*10)/10;
                m1=(-1)*m1;
                m2=Math.floor(m2*10)/10;
                System.out.printf("%.1f %.1f",m1,m2);
            }
            else if (m1>0 && m2<0) {
                m2=(-1)*m2;
                m2=Math.floor(m2*10)/10;
                m2=(-1)*m2;
                m1=Math.floor(m1*10)/10;
                System.out.printf("%.1f %.1f",m1,m2);
            }
            else if (m1<0 && m2<0) {
                m1=(-1)*m1;
                m1=Math.floor(m1*10)/10;
                m1=(-1)*m1;
                m2=(-1)*m2;
                m2=Math.floor(m2*10)/10;
                m2=(-1)*m2;
                System.out.printf("%.1f %.1f",m1,m2);
            }
            else {
                m1=Math.floor(m1*10)/10;
                m2=Math.floor(m2*10)/10;
                System.out.printf("%.1f %.1f",m1,m2);
            }
        }
    }
}
