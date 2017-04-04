package com.company;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Fan1 fan1 = new Fan1();
        for (int i = 0; i < n; i++) {
            String op = sc.next();
            String val = sc.next();
            if (op.compareTo("speed") == 0) {
                if (val.compareTo("SLOW") == 0) fan1.setSpeed(Fan1.SLOW);
                else if (val.compareTo("FAST") == 0) fan1.setSpeed(Fan1.FAST);
                else fan1.setSpeed(Fan1.MEDIUM);
            } else if (op.compareTo("radius") == 0) {
                fan1.setRadius(Double.parseDouble(val));
            } else if (op.compareTo("color") == 0) {
                fan1.setColor(val);
            } else if (op.compareTo("on") == 0) {
                if (val.compareTo("true") == 0) fan1.setOn(true);
                else fan1.setOn(false);
            }
        }
        System.out.println(fan1.toString());
    }
}

class Fan1 {
    static final int SLOW=1;
    static final int MEDIUM=2;
    static final int FAST=3;
    private static int speed=SLOW;
    private static boolean on=false;
    private static double radius=5.00;
    private static String color="blue";
    Fan1(int speed1,boolean onoff1,double radius1,String x) {
        speed=speed1;
        on=onoff1;
        radius=radius1;
        color=x;
    }
    Fan1() {}

    public static void setSpeed(int speed) {
        Fan1.speed = speed;
    }

    public static void setColor(String color) {
        Fan1.color = color;
    }

    public static void setRadius(double radius) {
        Fan1.radius = radius;
    }

    public static void setOn(boolean on) {
        Fan1.on = on;
    }

    public String toString() {
        String k=String.format("%.2f", radius);
        String x="";
        if (on) {
            x+="speed "+speed;
            x+="\n";
            x+="color "+color;
            x+="\n";
            x+="radius "+k;
            return x;
        }
        else {
            x+="color "+color;
            x+="\n";
            x+="radius "+k;
            x+="\n";
            x+="fan is off";
            return x;
        }
    }
}