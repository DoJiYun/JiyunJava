package com.company;

import java.util.*;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        String k,result=keyboard.nextLine();
        while (keyboard.hasNext()) {
            k=keyboard.nextLine();
            if (k.matches(".*[{]$")) result+=" {";
            else result+="\n"+k;
        }
        System.out.print(result);
    }
}
