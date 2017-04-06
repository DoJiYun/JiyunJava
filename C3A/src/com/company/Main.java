package com.company;
import java.util.Scanner;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
	    int a;
        a=keyboard.nextInt();
        for (int i=0;i<a;++i) {
            for(int j=0;j<a+i;++j) {
                if(j+1<a-i)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.printf("\n");
        }
    }
}
