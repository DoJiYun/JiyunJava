package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        int x = 0;
        x = keyboard.nextInt();
        int[] y = new int[x];

        for (int i = 0; i < x; i++) {
            y[i] = keyboard.nextInt();
        }
        for (int i=0;i<x;i++) {
            Object tmp[] = primeFactor(y[i]);
            if (y[i] != 1) {
                for (int j = 0; j < tmp.length-1; j++) {
                    System.out.print(tmp[j] + " ");
                }
                System.out.print(tmp[tmp.length-1]);
                System.out.println();
            } else
                System.out.println("1");
        }
    }

    static Object[] primeFactor(int number) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int n = 2;

        while (number > 1) {
            if (number % n == 0) {
                number = number / n;
                list.add(n);
            } else {
                n++;
            }
        }
        return list.toArray();
    }
}