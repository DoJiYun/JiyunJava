package com.company;

import java.util.Scanner;

public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args){
        String result="";
        int max=0;
        while(keyboard.hasNext()){
            String a = keyboard.nextLine();
            int b=a.length();
            max=0;
            max=Math.max(b,max);
            if (b==max) {
                result=a;
            }
        }
        System.out.print(max+"\n"+result);
    }
}