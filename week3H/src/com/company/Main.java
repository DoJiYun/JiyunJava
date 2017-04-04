package com.company;

import java.util.Scanner;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
	    double x1,y1,w1,h1,x2,y2,w2,h2;
        x1=keyboard.nextDouble();
        y1=keyboard.nextDouble();
        w1=keyboard.nextDouble();
        h1=keyboard.nextDouble();
        x2=keyboard.nextDouble();
        y2=keyboard.nextDouble();
        w2=keyboard.nextDouble();
        h2=keyboard.nextDouble();

        if (Math.abs(x1-x2)+w2/2<=w1/2 && Math.abs(y1-y2)+h2/2<=h1/2) {
            System.out.println("inside");
        }
        else if ((Math.abs(w1/2-w2/2)<=Math.abs(x1-x2) && Math.abs(x1-x2)<w1/2+w2/2) && (Math.abs(h1/2-h2/2)<=Math.abs(y1-y2) && Math.abs(y1-y2)<h1/2+h2/2)) {
            System.out.println("attach");
        }
        else
            System.out.println("outside");
    }
}
