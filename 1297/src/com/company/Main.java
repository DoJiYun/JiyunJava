package com.company;

import java.util.Scanner;

public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
	    String k=keyboard.nextLine();
        int k1=Integer.parseInt(k);
        String[] x=new String[k1];
        int[] y=new int[k1];
        for (int i=0;i<k1;i++) {
            x[i]=keyboard.nextLine();
            y[i]=Integer.parseInt(x[i]);
        }
        for (int i=0;i<k1;i++) {
            if (y[i]%2==1)
                System.out.println("0 0");
            else {
                int max,min;
                max=y[i]/4+(y[i]%4)/2;
                min=y[i]/2;
                System.out.println(max+" "+min);
            }
        }
    }
}
