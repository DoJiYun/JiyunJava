package com.company;

import java.util.Scanner;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        int ip;
        double op;
        double a=1.00417;
        ip=keyboard.nextInt();

        op=(1+a+a*a+a*a*a+a*a*a*a+a*a*a*a*a)*ip*a;
        op=op*10;
        op=(int)op;
        op=op/10;
        System.out.println(op);
    }
}

