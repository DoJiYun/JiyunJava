package com.company;

import java.util.*;
public class Main {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        String t1=keyboard.nextLine();
        int t=Integer.parseInt(t1);
        int[] length=new int[t];
        String[] x=new String[t];
        for (int i=0;i<t;i++) {
            x[i]=keyboard.nextLine();
        }
        for (int i=0;i<t;i++) {
            if (isLength(x[i])==0 && isAdd(x[i])==0 && isStart(x[i])==0) {
                System.out.println("Valid");
            }
            else
                System.out.println("Invalid");
        }
    }
    static public int isLength(String x) {
        int a=x.length();
        if (a>=13 && a<=16)
            return 0;
        return 1;
    }
    static public int isStart(String x) {
        char a=x.charAt(0);
        char b=x.charAt(1);

        if (a=='4' || a=='5' || a=='6')
            return 0;
        else if (a=='3' && b=='7')
            return 0;
        else
            return 1;
    }
    static public int isAdd(String x) {
        int sum1=0;
        int sum2=0;

        for (int i=x.length()-2;i>=0;i=i-2) {
            char z=x.charAt(i);
            String a=Character.toString(z);
            int b=Integer.parseInt(a);
            b*=2;
            if (b>=10) {
                sum1+=b%10+b/10;
            }
            else {
                sum1 += b;
            }
        }
        for (int i=x.length()-1;i>=0;i=i-2) {
            char z=x.charAt(i);
            String a=Character.toString(z);
            int b=Integer.parseInt(a);
            sum2+=b;
        }
        if ((sum1+sum2)%10==0)
            return 0;
        else
            return 1;
    }
}
