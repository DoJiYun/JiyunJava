package com.company;

import java.util.*;
public class Main {
    private static void per(String prefix, String str){
        int n = str.length();
        if (n == 0)
            System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++)
                per(prefix + str.charAt(i),
                        str.substring(0, i) + str.substring(i+1));
        }
    }
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        String t=keyboard.nextLine();
        per("", t);
    }
}