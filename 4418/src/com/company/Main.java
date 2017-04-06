package com.company;

import java.util.*;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
	    int[] x=new int[3];
        for (int i=0;i<3;i++) {
            x[i]=keyboard.nextInt();
        }

        Arrays.sort(x);
        if (x[0]==x[1] && x[1]==x[2]) {
            System.out.println("Equilateral triangle");
        }
        else if (x[0]==x[1] || x[1]==x[2]) {
            System.out.println("Isosceles triangle");
        }
        else
        {
            System.out.println("Triangle");
        }
    }
}
