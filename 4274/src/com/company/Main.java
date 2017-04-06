package com.company;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        int a=keyboard.nextInt();
        int[] b=new int[a];
        for (int i=0; i<a; i++) {
            b[i]=keyboard.nextInt();
        }
    }
}
