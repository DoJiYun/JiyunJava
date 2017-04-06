package com.company;

import java.util.*;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        while(true) {
            int a=keyboard.nextInt();
            int b=keyboard.nextInt();
            int sum=a+b;
            int save;
            if (a==-1 && b==-1) {
                break;
            }
            else {
                if (a!=0 && b!=0) {
                    save=factorial(a+b)/(factorial(a)*factorial(b));
                }
                else if (a==0 && b==0) {
                    save=1;
                }
                else if (a==0 || b==0) {
                    save=1;
                }
                else {
                    save=sum;
                }
                /*else {
                    save=factorial(a+b)/(factorial(a)*factorial(b));
                }*/

                if (save==sum) {
                    System.out.println(a+"+"+b+"="+sum);
                }
                else {
                    System.out.println(a+"+"+b+"!="+sum);
                }
            }


        }
    }

    public static int factorial(int n) {
        if (n == 1) return 1;
        else return n * factorial(n - 1);
    }
}
