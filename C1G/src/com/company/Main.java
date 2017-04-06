package com.company;

import java.util.Scanner;

public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String args[])
    {
        int count=0;
        int t=0;
        int b=0;
        while(keyboard.hasNext())
        {
            String a=keyboard.nextLine();
            int l=a.length();

            for (int i=0;i<l;i++) {
                char z=a.charAt(i);
                if (z==' ')
                    b++;
                else if (z=='\t')
                    t++;
            }
            count++;
            //break;
        }
        System.out.print(b+"\n"+t+"\n"+(count-1));
    }
}