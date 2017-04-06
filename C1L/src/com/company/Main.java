package com.company;

import java.util.Scanner;

public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args){

        int count[] = new int[10];
        for (int i=0;i<10;i++)
            count[i]=0;

        while(keyboard.hasNext()){
            String a = keyboard.nextLine();
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) >= '0' && a.charAt(i) <= '9'){
                    count[a.charAt(i)-'0']++;
                }
            }
        }
        for(int i=0;i<10;i++){
            System.out.print(i + ": ");
            for (int j=0;j<count[i];j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}