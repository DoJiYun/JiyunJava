package com.company;

import java.util.Scanner;

public class Main {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {


        int t = keyboard.nextInt();
        int count[] = new int[t];
        int a[] = new int[t];

        int max = 0;
        int con = 0;

        for (int i = 0; i < t; ++i) {
            a[i] = keyboard.nextInt();
        }
        for (int i = 0; i < t; ++i) {
            count[i] = 0;
            for (int j = 0; j < t; ++j) {
                if (a[i] == a[j])
                    ++count[i];
            }
        }
        for (int i = 0; i < t; ++i) {
            if (max < count[i]) {
                max = count[i];
                con = a[i];
            }
        }
        System.out.println(con+"\n"+max);
    }
}