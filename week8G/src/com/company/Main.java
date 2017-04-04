package com.company;

import java.util.Scanner;

public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
	    int a=keyboard.nextInt();
        int b=keyboard.nextInt();

        int[][] x=new int[a][b];

        for (int i=0;i<a;i++) {
            for (int j=0;j<b;j++) {
                x[i][j]=keyboard.nextInt();
            }
        }

        int count=0;

        for (int i=0;i<a;i++) {
            for (int j=0;j<b;j++) {
                if (j<b-3) {
                    if (x[i][j] == x[i][j + 3]) {
                        if (x[i][j] == x[i][j + 1] && x[i][j] == x[i][j + 2]) {
                            count++;
                        }
                    }
                }
                if (i<a-3) {
                    if (x[i][j] == x[i + 3][j]) {
                        if (x[i][j] == x[i + 2][j] && x[i + 2][j] == x[i + 1][j]) {
                            count++;
                        }
                    }
                }
                if (i<a-3 && j<b-3) {
                    if (x[i][j] == x[i + 3][j + 3]) {
                        if (x[i][j] == x[i + 2][j + 2] && x[i][j] == x[i + 1][j + 1]) {
                            count++;
                        }
                    }
                }
            }
            for (int j = b - 1; j > 2; j--) {
                if (i<a-3) {
                    if (x[i][j] == x[i + 3][j - 3]) {
                        if (x[i][j]==x[i+2][j-2] && x[i][j]==x[i+1][j-1])
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
