package com.company;

import java.io.*;

public class Main {
    public static void main(String args[])throws IOException{
        int x,i,j,t;

        DataInputStream keyboard = new DataInputStream(System.in);

        x=Integer.parseInt(keyboard.readLine());
        for(i=0;i<x;i++){
            for(j=1;j<x-i;j++)
                System.out.print(" ");
            for(t=0;t<i*2+1;t++)
                System.out.print("*");
            System.out.println();
        }
        for(i=1;i<x;i++){
            for(j=0;j<i;j++)
                System.out.print(" ");
            for(t=0;(x*2)-(i*2)-1>t;t++)
                System.out.print("*");
            System.out.println();
        }
    }
}