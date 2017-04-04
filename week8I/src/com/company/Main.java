package com.company;

import java.util.*;

public class Main {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c, d;
        int x1 = 0, y1 = 0, k = 1;
        int i = keyboard.nextInt();
        int j = keyboard.nextInt();
        int result = 0;
        int[][] x = new int[i][j];
        for (a = 0; a < i; ++a) {
            for (b = 0; b < j; ++b)
                x[a][b] = keyboard.nextInt();
        }
        for (a = 0; a < i; ++a)
            for (b = 0; b < j; ++b)
                if (x[a][b] == 1) {
                    for (; a + k <= i && b + k <= j; ++k) {
                        for (c = a; c < a + k; ++c) {
                            for (d = b; d < b + k; ++d)
                                if (x[c][d] != 1)
                                    break;
                            if (d != b + k)
                                break;
                        }
                        if (c != a + k)
                            break;
                        if (k > result) {
                            result = k;
                            x1 = a;
                            y1 = b;
                        }
                    }
                }
        System.out.print(x1 + " " + y1 + " " + result);
    }
}