package com.company;

import java.io.*;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String args[])
    {
        int c,i=0;
        InputStreamReader rd = new InputStreamReader(System.in);
        try
        {
            while(true)
            {
                int a = rd.read();
                if(a == -1)
                    break;
                else if (a == '\\')
                    ++i;
                else if (i>0 && a=='n') {
                    System.out.printf("\n");
                    i=0;
                }
                else if (i>0 && a=='b') {
                    System.out.printf("\b");
                    i=0;
                }
                else if (i>0 && a=='t') {
                    System.out.printf("\t");
                    i=0;
                }
                else
                    System.out.print((char)a);
            }
        }
        catch(IOException e)
        {
            System.out.println("입력 오류");
        }
    }
}
