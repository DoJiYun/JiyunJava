package com.company;

import java.util.*;

public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            String x = keyboard.nextLine();
            String y = keyboard.nextLine();
            int l = x.length();
            int count1 = 0;
            int count2 = 0;
            if (x.equals("E") && y.equals("E")) {
                break;
            } else {
                for (int i = 0; i < l; i++) {
                    char x1 = x.charAt(i);
                    char y1 = y.charAt(i);
                    if (x1 == 'R' && y1 == 'S' || x1 == 'S' && y1 == 'P' || x1 == 'P' && y1 == 'R')
                        count1++;
                    else if (x1 == 'R' && y1 == 'P' || x1 == 'S' && y1 == 'R' || x1 == 'P' && y1 == 'S')
                        count2++;
                }
            }

            System.out.println("P1: " + count1);
            System.out.println("P2: " + count2);
        }
    }
}
