package com.company;

import java.util.Scanner;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int a;
            String b;
            a = keyboard.nextInt();
            b = Integer.toHexString(a);
            System.out.println(b);
        }
    }
}
