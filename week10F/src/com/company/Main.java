package com.company;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[][] points = new double[N][2];
        for (int i = 0; i < N; i++) {
            points[i][0] = sc.nextDouble();
            points[i][1] = sc.nextDouble();
        }
        MyRectangle2D boundingRectangle = MyRectangle2D.getRectangle(points);
        System.out.printf("x, y: %.1f, %.1f\n", boundingRectangle.getX(), boundingRectangle.getY());
        System.out.printf("w, h: %.1f, %.1f\n", boundingRectangle.getWidth(), boundingRectangle.getHeight());
    }
}

class MyRectangle2D {
    double x;
    double y;
    double width;
    double height;
    MyRectangle2D(double x1, double y1,double w, double h) {
        x=x1;
        y=y1;
        width=w;
        height=h;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public static MyRectangle2D getRectangle(double[][] k) {
        double maxx=k[0][0];
        double maxy=k[0][1];
        double minx=k[0][0];
        double miny=k[0][1];
        for (int i=1;i<k.length;i++) {
            if (maxx<k[i][0]) {
                maxx=k[i][0];
            }
            if (minx>k[i][0]) {
                minx=k[i][0];
            }
            if (maxy<k[i][1]) {
                maxy=k[i][1];
            }
            if (miny>k[i][1]) {
                miny=k[i][1];
            }
        }
        MyRectangle2D result=new MyRectangle2D(maxx/2+minx/2,maxy/2+miny/2,Math.abs(maxx-minx),Math.abs(maxy-miny));
        return result;
    }
}