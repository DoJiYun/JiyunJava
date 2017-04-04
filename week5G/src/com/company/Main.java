package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        int n=keyboard.nextInt();
        int i,j;

        for (i=1;i<=n;i++) {
            j=1;
            while (j<=(n-i)) {
                System.out.print("    ");
                j++;
            }
            j=1;
            while (j<i+1) {
                if ((int)Math.pow(2,j-1)<=8) {
                    System.out.print("   "+(int) Math.pow(2, j - 1));
                    j++;
                }
                else if(((int)Math.pow(2,j-1)>8) && ((int)Math.pow(2,j-1)<=64)) {
                    System.out.print("  "+(int)Math.pow(2,j-1));
                    j++;
                }
                else {
                    System.out.print(" "+(int)Math.pow(2,j-1));
                    j++;
                }
            }
            j=i-1;
            while (j>=1) {
                if ((int)Math.pow(2,j-1)<=8) {
                    System.out.print("   "+(int) Math.pow(2, j - 1));
                    j--;
                }
                else if(((int)Math.pow(2,j-1)>8) && (int)Math.pow(2,j-1)<=64) {
                    System.out.print("  "+(int)Math.pow(2,j-1));
                    j--;
                }
                else {
                    System.out.print(" "+(int)Math.pow(2,j-1));
                    j--;
                }
            }
            System.out.println();
        }
    }
}
