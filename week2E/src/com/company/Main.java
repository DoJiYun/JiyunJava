package com.company;

import java.util.Scanner;

public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        double w,h;
        double kg1,m1;
        double bmi;

        w=keyboard.nextDouble();
        h=keyboard.nextDouble();
        kg1=w*0.45359237;
        m1=h*0.0254;

        bmi=kg1/m1;
        bmi=bmi/m1;
        bmi=bmi*100;
        bmi=(int)bmi;
        bmi=bmi/100;
        System.out.println(bmi);
    }
}
