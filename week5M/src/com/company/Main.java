package com.company;

import java.util.Scanner;

public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        String x=keyboard.nextLine();
        int k=Integer.parseInt(x);

        String[] y=new String[k];
        int[] a=new int[k];
        int[] b=new int[k];
        for (int i=0;i<k;i++) {
            y[i]=keyboard.nextLine();
            for (int j=0;j<y[i].length();j++) {
                char z=y[i].charAt(j);
                switch (z) {
                    case 'a':case 'e':case 'i':case 'o':case 'u':case 'A':case 'E':case 'I':case 'O':case 'U':
                        a[i]++;
                        break;
                    case ' ':
                        break;
                    default:
                        b[i]++;
                        break;
                }
            }
        }
        for (int i=0;i<k;i++)
            System.out.println(a[i]+" "+b[i]);
    }
}