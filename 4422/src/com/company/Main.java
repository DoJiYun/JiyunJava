package com.company;

import java.util.*;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        String a=keyboard.nextLine();
        int l=a.length();
        int count=0;
        for (int i=0;i<l;i++) {
            if (a.charAt(i)==' ') {
                count++;
            }
        }
        int[] x=new int[count+1];
        for (int i=0;i<count+1;i++) {
            x[i]=Integer.parseInt(a.split(" ")[i]);
            //System.out.println(x[i]);
        }

        Arrays.sort(x);
        System.out.println(x[0]);
    }
}
