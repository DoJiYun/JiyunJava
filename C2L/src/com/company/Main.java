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
            int[] x=new int[10];
            while(true)
            {
                int c=0;
                for(int i=0;i<10;i++)
                    x[i]=0;
                int a = rd.read();
                if(a == -1)
                    break;
                else if (a == '0')
                    x[0]++;
                else if (a == '1')
                    x[1]++;
                else if (a == '2')
                    x[2]++;
                else if (a == '3')
                    x[3]++;
                else if (a == '4')
                    x[4]++;
                else if (a == '5')
                    x[5]++;
                else if (a == '6')
                    x[6]++;
                else if (a == '7')
                    x[7]++;
                else if (a == '8')
                    x[8]++;
                else if (a == '9')
                    x[9]++;
                else
                    c++;
                for(int i=0;i<10;i++)
                    System.out.println(x[i]);
            }
           // for(int i=0;i<10;i++)
            //    System.out.println(x[i]);
        }
        catch(IOException e)
        {
            System.out.println("x");
        }
    }
}