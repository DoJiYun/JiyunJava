package com.company;

import java.util.*;

public class Main {
    static int count=0;
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int[] board = new int[n];
        Qstart(0, board);
        System.out.println(count);
    }

    private static void Qstart(int x, int[] y) {
        int n = y.length;
        if (x == n) {
            String jiyun=Arrays.toString(y);
            count++;
        } else {
            for (int column = 0; column < n; column++) {
                if (QP(column, x, y)) {
                    y[x] = column;
                    Qstart(x + 1, y);
                    y[x] = -1;
                }
            }
        }
    }

    private static boolean QP(int x, int y, int[] y1) {

        for (int i = 0; i < y; i++) {
            if (Math.abs(y1[i] - x) == Math.abs(i - y)) {
                return false;
            }
            if (y1[i] == x) {
                return false;
            }
        }
        return true;
    }
}