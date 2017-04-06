package com.company;

import java.util.*;

public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args){
        while(keyboard.hasNext()){
            String x = keyboard.nextLine();
            char[] result = x.toCharArray();
            for(int i=0; i<x.length(); i++){
                if(result[x.length()-1-i] =='\t'|| result[x.length()-1-i] ==' ' || result[x.length()-1-i] =='\r' ){
                    result[x.length()-1-i] = '\0';
                }
                else break;
            }
            for(int i=0; i<x.length(); i++){
                if( result[i] != '\0')
                    System.out.print(result[i]);
            }
            System.out.print("\n");
        }
    }
}