package com.company;

import java.util.*;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
	    String a=keyboard.next();
        String b=keyboard.next();

        int sum=0;

        int l1=a.length();
        int l2=b.length();

        for (int i=0;i<l1;i++) {
            int x=Integer.parseInt(a.substring(i,i+1));
            for (int j=0;j<l2;j++) {
                int y=Integer.parseInt(b.substring(j,j+1));
                sum+=x*y;
            }
        }
        System.out.println(sum);
    }
}
