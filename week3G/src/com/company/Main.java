package com.company;

import java.util.Scanner;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
	    double x1,x2,line;
        x1=keyboard.nextDouble();
        x2=keyboard.nextDouble();

        line=x1+2*x2-200;

        if (x1>=0 && x2>=0) {
            if(line<0) {
                if (x1 == 0 && x2 <= 100)
                    System.out.println("on");
                else if (x2 == 0 && x1 <= 200)
                    System.out.println("on");
                else
                    System.out.println("in");
            }
            else if(line==0)
                System.out.println("on");

            else
                System.out.println("out");
        }

        else
            System.out.println("out");
    }
}
