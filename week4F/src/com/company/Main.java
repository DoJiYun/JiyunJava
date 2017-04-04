package com.company;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        String[] s = new String[3];

        s[0] = keyboard.nextLine();
        s[1] = keyboard.nextLine();
        s[2] = keyboard.nextLine();

        Arrays.sort(s);

        /*String pa=Arrays.toString(s);

        int a=pa.length();
        pa=pa.substring(1,a-1);
        String[] result=pa.split(",");
        System.out.println(result[0]+""+result[1]+""+result[2]);
        */
        System.out.println(s[0]+" "+s[1]+" "+s[2]);
    }
}
