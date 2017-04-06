package com.company;

import java.util.*;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
	    while(true) {
            int a=keyboard.nextInt();
            int b=keyboard.nextInt();
            if (a==0 && b==0) {
                break;
            }
            if (a<b) {
                int temp=a;
                a=b;
                b=temp;
            }


        }
    }
}
