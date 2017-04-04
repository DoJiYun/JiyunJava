package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        GeometricObject1[] aCircle1 = new Circle1[N];
        for (int i = 0; i < N; i++) {
            aCircle1[i] = new Circle1(sc.nextDouble(), sc.next(), sc.nextDouble());
        }
        Arrays.sort(aCircle1);
        for (GeometricObject1 c1 : aCircle1) {
            System.out.println(c1);
        }
    }
}

class GeometricObject1 implements Comparable<GeometricObject1> {
    /*static double radius;
    static String color;
    static double weight;*/
    public GeometricObject1(){}
    /*public String toString() {
        String result="radius:"+this.radius+", color:"+this.color+", weight:"+this.weight;
        return result;
    }*/


    public int compareTo(GeometricObject1 o) {
        return 1;
    }
    public static int max(double x, double y) {
        if (x>y) return 1;
        else if (x==y) return 0;
        else return -1;
    }
}

class Circle1 extends GeometricObject1 {
    double radius,weight;
    String color;
    Circle1(double x, String y, double z) {
        radius=x;
        color=y;
        weight=z;
    }

    public int compareTo(GeometricObject1 k) {
        return GeometricObject1.max(this.radius,((Circle1)k).radius);
    }
    public String toString() {
        return String.format("radius:%.1f, color:%s, weight:%.1f",radius,color,weight);
    }
}