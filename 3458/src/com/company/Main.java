package com.company;

import java.util.*;

public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        long[] x = new long[10000000];
        long[] y = new long[10000000];
        long a = 0;
        for (int i = 0; ; i++) {
            x[i] = keyboard.nextLong();
            y[i] = keyboard.nextLong();
            if (x[i] == 0 && y[i] == 0) {
                a = i;
                break;
            }
        }
        for (int i = 0; i < a; i++) {
            System.out.println((lcm(x[i], y[i]) / x[i]) * (lcm(x[i], y[i]) / y[i]));
        }
    }

    static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    static long lcm(long a, long b) {
        return (a * b / gcd(b, a % b));
    }
}
