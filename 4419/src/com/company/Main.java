package com.company;

import java.util.*;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        int[] x=new int[8];
        for (int i=0;i<8;i++) {
            x[i]=keyboard.nextInt();
        }
        int sum=0;
        for (int i=0;i<8;i++) {
            sum+=x[i]%2;
        }
        if (sum>4) {
            System.out.println("ODD");
        }
        else if (sum==4) {
            System.out.println("?");
        }
        else
            System.out.println("EVEN");
    }
}
