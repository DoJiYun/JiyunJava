package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            double side1 = sc.nextDouble();
            double side2 = sc.nextDouble();
            double side3 = sc.nextDouble();

            GeometricObject triangle = new Triangle(side1, side2, side3);
            String color = sc.next();
            triangle.setColor(color);

            boolean filled = sc.nextBoolean();
            triangle.setFilled(filled);
            DecimalFormat df = new DecimalFormat("##.00");
            System.out.println("The area is " + df.format(triangle.getArea()));
            System.out.println("The perimeter is " + df.format(triangle.getPerimeter()));
            System.out.println(triangle);
        }
    }
}

abstract class GeometricObject {
    private String color = "white";
    private boolean filled;

    /**
     * Default construct
     */
    protected GeometricObject() {
    }

    /**
     * Construct a geometric object
     */
    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /**
     * Getter method for color
     */
    public String getColor() {
        return color;
    }

    /**
     * Setter method for color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Getter method for filled. Since filled is boolean,
     * so, the get method name is isFilled
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * Setter method for filled
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * Abstract method findArea
     */
    public abstract double getArea();

    /**
     * Abstract method getPerimeter
     */
    public abstract double getPerimeter();
}

class Triangle extends GeometricObject {
    static double side1 = 1.0;
    static double side2 = 1.0;
    static double side3 = 1.0;

    Triangle() {

    }

    @Override
    public double getArea() {
        double s = side1 + side2 + side3;
        s /= 2;
        double area = s * (s - side1) * (s - side2) * (s - side3);
        area = Math.sqrt(area);
        return area;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    Triangle(double x, double y, double z) {
        side1 = x;
        side2 = y;
        side3 = z;
    }

    DecimalFormat df=new DecimalFormat("##.00");

    public String toString() {
        String x = "";
        x += ("Triangle: side1 = ");
        x += df.format(side1);
        x += " side2 = ";
        x += df.format(side2);
        x += " side3 = ";
        x += df.format(side3);
        return x;
    }

    public static void setSide1(double x) {
        Triangle.side1 = x;
    }

    public static void setSide2(double x) {
        Triangle.side2 = x;
    }

    public static void setSide3(double x) {
        Triangle.side3 = x;
    }

    public static double getSide1() {
        return side1;
    }

    public static double getSide2() {
        return side2;
    }

    public static double getSide3() {
        return side3;
    }


}