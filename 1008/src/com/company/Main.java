package com.company;

import java.util.Scanner;
import java.math.BigInteger;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        BigInteger a=BigInteger.ZERO;
        BigInteger b=BigInteger.ONE;
        BigInteger temp=BigInteger.ZERO;

        int i;
        i=keyboard.nextInt();
        for(;i>=1;i--) {
            temp=a+b;
            a=b;
            b=temp;
        }
        System.out.println(a);
    }
}