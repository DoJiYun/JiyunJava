package com.company;

import java.util.*;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
	    while (keyboard.hasNext()) {
            String check=keyboard.next();
            String result="";
            String input=keyboard.nextLine();
            if (check.equals("lower")) {
                result=input.toLowerCase();
            }
            else
                result=input.toUpperCase();
            result=result.substring(1);
            System.out.println(result);
        }
    }
}
