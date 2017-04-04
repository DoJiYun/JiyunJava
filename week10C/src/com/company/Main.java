package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            double x1, y1, x2, y2, x3, y3, x4, y4, x5, y5;
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

            MyRectangle2D r1 = new MyRectangle2D(x1, y1, x2, y2);
            MyRectangle2D r2 = new MyRectangle2D(x3, y3, x4, y4);

            System.out.printf("Area is %.1f\n", r1.getArea());
            System.out.printf("Perimeter is %.1f\n", r1.getPerimeter());
            System.out.println(r1.contains(x5, y5));
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

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    MyRectangle2D() {
        x=0;
        y=0;
        width=1;
        height=1;
    }

    double getArea() {
        return width*height;
    }

    double getPerimeter() {
        return 2*(width+height);
    }

    boolean contains(double x1, double y1) {
        if (Math.abs(x1-x)<=width/2 && Math.abs(y1-y)<=height/2)
            return true;
        else
            return false;
    }

    boolean contains(MyRectangle2D r) {
        if (Math.abs(x-r.x)+r.width/2<=width/2 && Math.abs(y-r.y)+r.height/2<=height/2) {
            return true;
        }
        /*else if (Math.abs(r.centerx-centerx)+width/2<=r.width/2 && Math.abs(r.centery-centery)+height/2<=r.height/2) {
            return true;
        }*/
        else
            return false;
    }

    boolean overlaps(MyRectangle2D r) {
        if (!contains(r) && !(Math.abs(x-r.x)>(width+r.width)/2 || Math.abs(y-r.y)>(height+r.height)/2)) {
            return true;
        }
        else
            return false;
    }
}