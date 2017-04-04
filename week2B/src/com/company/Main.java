package com.company;

import java.util.Scanner;
public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        double r, l, a, v;
        r = keyboard.nextDouble();
        l = keyboard.nextDouble();
        a = r*r*3.14159;
        v = a*l;
        a=Math.floor(a*10)/10;
        v=Math.floor(v*10)/10;
        System.out.printf("%.1f\n%.1f",a,v);
    }
}