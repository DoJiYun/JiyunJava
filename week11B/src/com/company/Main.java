package com.company;

import java.util.*;
import javafx.geometry.*;
import java.awt.geom.Line2D;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        int t=keyboard.nextInt();
        double[] k=new double[t*2];
        for (int i=0;i<t;i++) {
            k[2*i]=keyboard.nextDouble();
            k[2*i+1]=keyboard.nextDouble();
        }
        double x=0,y=0;
        for (int i=0;i<t;i++) {
            x+=k[2*i];
            y+=k[2*i+1];
        }
        x/=(double)t;
        y/=(double)t;
        //System.out.println(x+" "+y);
        double sum=0;
        double[] a=new double[t];
        for (int i=0;i<t-1;i++) {
            Triangle2D l=new Triangle2D(k[2*i],k[2*i+1],k[2*i+2],k[2*i+3],x,y);
            a[i]=l.getArea();
            sum+=a[i];
            //System.out.println(i+": "+a[i]);
        }
        Triangle2D my=new Triangle2D(k[0],k[1],k[2*t-2],k[2*t-1],x,y);
        a[t-1]=my.getArea();
        sum+=a[t-1];
        System.out.printf("The total area is %.2f",sum);
        //System.out.println(sum);

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

