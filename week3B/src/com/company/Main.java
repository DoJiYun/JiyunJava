package com.company;

import java.util.Scanner;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        double a,b,c,d,e,f;
        double x,y,out;
        a=keyboard.nextDouble();
        b=keyboard.nextDouble();
        c=keyboard.nextDouble();
        d=keyboard.nextDouble();
        e=keyboard.nextDouble();
        f=keyboard.nextDouble();
        out=a*d-b*c;
        x=e*d-b*f;
        x=x/(a*d-b*c);
        y=a*f-e*c;
        y=y/(a*d-b*c);
        if (out!=0) {
            x = x * 10;
            x = (int) x;
            x = x / 10;

            y = y * 10;
            y = (int) y;
            y = y / 10;

            double max, min;
            max = Math.max(x, y);
            min = Math.min(x, y);
            if ((max*10)%10==0) {
                max=(int)max;
                System.out.println(max+" "+min);
            }
            else if ((min*10)%10==0) {
                min=(int)min;
                System.out.println(max+" "+min);
            }
            else if ((max*10)%10==0 && (min*10)%10==0) {
                max=(int)max;
                min=(int)min;
                System.out.println(max+" "+min);
            }
            else {
                System.out.println(max + " " + min);
            }
        }
        else if (out==0)
        {
            System.out.println("no solution\n");
        }
    }
}