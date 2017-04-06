package com.company;

import java.util.Scanner;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    StringBuffer sb=new StringBuffer();
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        String a=keyboard.nextLine();
        String b=keyboard.nextLine();

        if (b.contains(a)) {
            sb.append(b);
            StringBuffer c=sb.reverse();
        }
        String x=sb.toString();
        int y=x.indexOf(a);
        int z=b.length()-y-1;
        System.out.println(z);
    }
}
