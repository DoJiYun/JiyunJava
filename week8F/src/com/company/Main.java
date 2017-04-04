package com.company;

import java.util.*;

public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int t = keyboard.nextInt();
        double min = keyboard.nextDouble();
        double[] now = new double[t];
        double[][] bank = new double[t][t];
        double[] sum = new double[t];
        int[] k = new int[t];
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                bank[i][j] = 0;
            }
        }
        for (int i = 0; i < t; i++) {
            now[i] = keyboard.nextInt();
            k[i] = keyboard.nextInt();
            for (int j = 0; j < k[i]; j++) {
                int a = keyboard.nextInt();
                bank[i][a] = keyboard.nextDouble();
            }
        }
        for (int i = 0; i < t; i++) {
            sum[i] = now[i];
            for (int j = 0; j < t; j++) {
                sum[i] += bank[i][j];
            }
        }
        for (int i = 0; i < t; i++) {
            if (sum[i] < min) {
                for (int j = 0; j < t; j++) {
                    bank[j][i] = 0;
                }
            }
        }
        for (int i = 0; i < t; i++) {
            sum[i] = now[i];
            for (int j = 0; j < t; j++) {
                sum[i] += bank[i][j];
            }
        }
        String result="";
        for (int i = 0; i < t; i++) {
            if (sum[i] < min) {
                result+=i+" ";
            }
        }
        int length=result.length();
        if (length!=0) {
            //System.out.println(length);
            result = result.substring(0, length - 1);
            System.out.print(result);
        }
        else {
            System.out.println(result);
        }
    }
}
