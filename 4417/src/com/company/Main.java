package com.company;

import java.util.*;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
	    String a=keyboard.nextLine();
        String b=keyboard.nextLine();
        String c=keyboard.nextLine();

        int x=a.length();
        int y=b.length();
        int z=c.length();

        int min=Math.min(x,y);
        min=Math.min(min,z);

        if (min==x) {
            System.out.println(a);
        }
        else if (min==y) {
            System.out.println(b);
        }
        else
            System.out.println(c);
    }
}
