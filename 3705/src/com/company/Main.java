package com.company;

import java.util.*;

public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int[] t = new int[3];
            String x = "";
            int a;
            for (int i = 0; i < 3; i++) {
                t[i] = keyboard.nextInt();
            }
            if (t[0] == 0 && t[1] == 0 && t[2]==0) {
                break;
            } else {
                if (t[1]==0 && t[2]==0) {
                    x="GP";
                    a=0;
                }
                else {
                    if (Math.pow(t[1], 2) == t[0] * t[2]) {
                        x = "GP";
                        a = (t[2] * t[2]) / t[1];
                    } else {
                        x = "AP";
                        a = t[2] + (t[2] - t[1]);
                    }
                }

                System.out.println(x + " " + a);
            }
        }
    }
}
