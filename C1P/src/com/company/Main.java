package com.company;

import java.util.Scanner;

public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args){
        String result="";

        while(keyboard.hasNext()){
            String a = keyboard.nextLine();
            int b=a.length();
            if (b<32)
                System.out.println(a);
        }
    }
}