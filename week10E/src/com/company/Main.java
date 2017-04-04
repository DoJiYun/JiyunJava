package com.company;

import javafx.geometry.*;
import java.awt.geom.Line2D;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            double x1, y1, x2, y2, x3, y3, x4, y4, x5, y5, x6, y6, x7, y7;
            x1 = sc.nextDouble();
            y1 = sc.nextDouble();
            x2 = sc.nextDouble();
            y2 = sc.nextDouble();
            x3 = sc.nextDouble();
            y3 = sc.nextDouble();
            x4 = sc.nextDouble();
            y4 = sc.nextDouble();
            x5 = sc.nextDouble();
            y5 = sc.nextDouble();
            x6 = sc.nextDouble();
            y6 = sc.nextDouble();
            x7 = sc.nextDouble();
            y7 = sc.nextDouble();

            Triangle2D r1 = new Triangle2D(x1, y1, x2, y2, x3, y3);
            Triangle2D r2 = new Triangle2D(x4, y4, x5, y5, x6, y6);

            System.out.printf("Area is %.1f\n", r1.getArea());
            System.out.printf("Perimeter is %.1f\n", r1.getPerimeter());
            System.out.println(r1.contains(x7, y7));
            if (r1.contains(r2)) {
                System.out.println("contain");
            } else if (r1.overlaps(r2)) {
                System.out.println("overlaps");
            } else {
                System.out.println("no overlap");
            }
        }
    }
}

class Triangle2D {
    MyPoint p1;
    MyPoint p2;
    MyPoint p3;
    public Triangle2D() {
        p1 = new MyPoint(0, 0);
        p2 = new MyPoint(1, 1);
        p3 = new MyPoint(2, 5);
    }

    public Triangle2D(double x1,double y1,double x2,double y2,double x3,double y3) {
        p1=new MyPoint(x1,y1);
        p2=new MyPoint(x2,y2);
        p3=new MyPoint(x3,y3);
    }

    public double getArea() {
        double area=Math.abs(p1.x * p2.y + p2.x * p3.y + p3.x * p1.y - p2.x * p1.y - p3.x * p2.y - p1.x * p3.y);
        area/=2;
        return area;
    }
    public double getPerimeter() {
        double length=0;
        length+=Math.pow(Math.pow(p1.x-p2.x,2)+Math.pow(p1.y-p2.y,2),0.5);
        length+=Math.pow(Math.pow(p3.x-p2.x,2)+Math.pow(p3.y-p2.y,2),0.5);
        length+=Math.pow(Math.pow(p1.x-p3.x,2)+Math.pow(p1.y-p3.y,2),0.5);
        return length;
    }
    public boolean contains(double x, double y) {
        MyPoint p=new MyPoint(x,y);
        double area1=0.5*Math.abs(p1.x * p2.y + p2.x * p.y + p.x * p1.y - p2.x * p1.y - p.x * p2.y - p1.x * p.y);
        double area2=0.5*Math.abs(p.x * p2.y + p2.x * p3.y + p3.x * p.y - p2.x * p.y - p3.x * p2.y - p.x * p3.y);
        double area3=0.5*Math.abs(p1.x * p.y + p.x * p3.y + p3.x * p1.y - p.x * p1.y - p3.x * p.y - p1.x * p3.y);
        double sum=area1+area2+area3;
        if (Double.compare(sum,getArea())==0) {
            return true;
        }
        else
            return false;
    }
    public boolean contains(Triangle2D t) {
        boolean check1=false,check2=false,check3=false;
        if (contains(t.p1.x,t.p1.y))
            check1=true;
        if (contains(t.p2.x,t.p2.y))
            check2=true;
        if (contains(t.p3.x,t.p3.y))
            check3=true;
        if (check1 && check2 && check3)
            return true;
        else
            return false;
    }
    public boolean overlaps(Triangle2D t) {
       /* Line2D l1=new Line2D.Double(p1.x,p1.y,p2.x,p2.y);
        Line2D l2=new Line2D.Double(p2.x,p2.y,p3.x,p3.y);
        Line2D l3=new Line2D.Double(p1.x,p1.y,p3.x,p3.y);
        Line2D l4=new Line2D.Double(t.p1.x,t.p1.y,t.p2.x,t.p2.y);
        Line2D l5=new Line2D.Double(t.p1.x,t.p1.y,t.p3.x,t.p3.y);
        Line2D l6=new Line2D.Double(t.p3.x,t.p3.y,t.p2.x,t.p2.y);*/
        Line2D[] l=new Line2D[6];
        l[0]=new Line2D.Double(p2.x,p2.y,p3.x,p3.y);
        l[1]=new Line2D.Double(p1.x,p1.y,p2.x,p2.y);
        l[2]=new Line2D.Double(p1.x,p1.y,p3.x,p3.y);
        l[3]=new Line2D.Double(t.p1.x,t.p1.y,t.p2.x,t.p2.y);
        l[4]=new Line2D.Double(t.p1.x,t.p1.y,t.p3.x,t.p3.y);
        l[5]=new Line2D.Double(t.p3.x,t.p3.y,t.p2.x,t.p2.y);
        boolean check=true;
        for (int i=0;i<3;i++) {
            for (int j=3;j<6;j++) {
                if (l[i].intersectsLine(l[j])) {
                    check=false;
                    break;
                }
            }
        }
        return !check;

    }


    class MyPoint {
        double x, y;

        public MyPoint(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }
}

