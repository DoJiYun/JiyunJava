package com.company;

import java.util.Scanner;
public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int a,h,t,o,sum;
        a = keyboard.nextInt();
        h=a/100;
        t=(a-h*100)/10;
        o=(a-h*100-t*10);
        sum=h+t+o;
        System.out.println(sum);
    }
}