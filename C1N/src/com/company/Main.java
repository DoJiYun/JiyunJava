package com.company;

import java.util.Scanner;

public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args){

        int count[] = new int[127];
        for (int i=0;i<127;i++)
            count[i]=0;

        while(keyboard.hasNext()){
            String a = keyboard.nextLine();
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) >= 33 && a.charAt(i) <= 126){
                    count[a.charAt(i)]++;
                }
            }
        }
        for(int i=33;i<127;i++){
            System.out.print((char)i + ": ");
            for (int j=0;j<count[i];j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}