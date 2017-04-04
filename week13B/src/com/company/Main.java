package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        GeometricObject[] aObject = new GeometricObject[N];
        for (int i = 0; i < N; i++) {
            String shape = sc.next();
            if (shape.equals("Square")) {
                aObject[i] = new Square(sc.nextDouble());
            } else if (shape.equals("Rectangle")) {
                aObject[i] = new Rectangle(sc.nextDouble(), sc.nextDouble());
            }
        }
        for (int i = 0; i < aObject.length; i++) {
            if (aObject[i] instanceof Colorable)
                ((Colorable) aObject[i]).howToColor();
            System.out.println("area: " + aObject[i].getArea());
            System.out.println("perimeter: " + aObject[i].getPerimeter());
        }
    }
}
interface Colorable {
    void howToColor();
}

abstract class GeometricObject implements Colorable {


    double lx, ly;
    String id;

    public String toString() {
        String result = "";
        result += id;
        result+='\n';
        result+="howToColor: xxx"+'\n';
        return result;
    }


    public double getArea() {
        return lx * ly;
    }

    public double getPerimeter() {
        return (lx + ly) * 2;
    }
}

class Square extends GeometricObject {

    //double lx;
    //static double ly;
    Square(double x) {
        id = "Square";
        lx = x;
        ly = x;
    }

    @Override
    public void howToColor() {
        System.out.println(id);
        System.out.println("howToColor: xxx");
    }
}

class Rectangle extends GeometricObject {
    //double lx,ly;
    Rectangle(double x, double y) {
        id = "Rectangle";
        lx = x;
        ly = y;
    }

    @Override
    public void howToColor() {
        System.out.println(id);
        System.out.println("howToColor: xxx");
    }
}