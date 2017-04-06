package com.company;

import java.util.*;

public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String args[]) {
        int a1, a2;
        a1 = 0;
        a2=1;
        while (keyboard.hasNext()) {
            String x = keyboard.nextLine();
            char[] result = x.toCharArray();
            String real="";
            for (int i = 0; i < x.length(); i++) {
                if (result[i] == '\n') {
                    real+='\n';
                    a2 = 0;
                } else if (result[i] == '\t') {
                    if (a2 % 4 == 0) {
                        real+="    ";
                        a2 += 4;
                    } else if (a2 % 4 == 1) {
                        real+="   ";
                        a2 += 3;
                    } else if (a2 % 4 == 2) {
                        real+="  ";
                        a2 += 2;
                    } else {
                        real+=" ";
                        a2 += 1;
                    }
                } else {
                    real+=result[i];
                    a2++;
                }

            }
            System.out.print(real);
            System.out.println();
        }
    }
}