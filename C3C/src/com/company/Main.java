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
            while(true)
            {
                int a = rd.read();
                if(a == -1)
                    break;
                else if (a == '\t')
                    System.out.printf("\\t");
                else if (a=='\b')
                    System.out.printf("\\b");
                else if (a=='\n')
                    System.out.printf("\\n");
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

