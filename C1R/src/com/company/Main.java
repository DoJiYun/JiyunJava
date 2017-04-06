package com.company;

import java.util.*;

public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args){

        while(keyboard.hasNext()){
            String result="";
            String a = keyboard.nextLine();
            for (int i=a.length()-1;i>=0;i--) {
                char x=a.charAt(i);
                result+=x;
            }
            System.out.println(result);
        }
    }
}