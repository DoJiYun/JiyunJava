package com.company;

import java.util.*;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {

        while (true) {
            int a=keyboard.nextInt();
            int b=keyboard.nextInt();
            if (a==0 && b==0)
                break;
            else {
                int[] x = new int[a];
                int[] y = new int[b];
                for (int i = 0; i < a; i++) {
                    x[i] = keyboard.nextInt();
                }
                for (int i = 0; i < b; i++) {
                    y[i] = keyboard.nextInt();
                }
                int count = 0;
                for (int i = 0; i < a; i++) {
                    for (int j = 0; j < b; j++) {
                        if (x[i] == y[j])
                            count++;
                    }
                }
                System.out.println(count);
            }
        }
    }
}