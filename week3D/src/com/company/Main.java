package com.company;

import java.util.Scanner;
public class Main {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        int y,m,d,j,k,s;
        double a1,a2,a3,h;

        y=keyboard.nextInt();
        m=keyboard.nextInt();
        d=keyboard.nextInt();
        if (m==1) {
            m=13;
            y=y-1;
        }
        else if (m==2) {
            m=14;
            y=y-1;
        }
        j=y/100;
        k=y%100;
        a1=(26*(m+1))/10;
        a2=k/4;
        a3=j/4;
        a1=(int)a1;
        a2=(int)a2;
        a3=(int)a3;

        h=d+a1+k+a2+a3+5*j;
        h=h%7;
        h=(int)h;

        if (h==1) {
            System.out.println("Sunday");
        }
        else if (h==2)
            System.out.println("Monday");
        else if (h==3)
            System.out.println("Tuesday");
        else if (h==4)
            System.out.println("Wednesday");
        else if (h==5)
            System.out.println("Thursday");
        else if (h==6)
            System.out.println("Friday");
        else
            System.out.println("Saturday");
    }
}