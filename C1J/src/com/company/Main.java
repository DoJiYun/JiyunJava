package com.company;

import java.io.*;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String args[])
    {
        InputStreamReader rd = new InputStreamReader(System.in);
        try
        {
            boolean x=false;
            while(true)
            {
                int a = rd.read();
                if(a == -1)
                    break;
                else if ((a>='a' && a<='z') || (a>='A' && a<='Z') || (a>='0' && a<='9')) {
                    System.out.print((char) a);
                    x = false;
                }
                else
                    if (!x) {
                        System.out.printf("\n");
                        x=true;
                    }
            }
        }
        catch(IOException e)
        {
            System.out.println("x");
        }
    }
}