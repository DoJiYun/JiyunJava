package com.company;

import java.util.*;
import java.math.BigInteger;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        BigInteger big=keyboard.nextBigInteger();
        BigInteger a=new BigInteger("100019");
        while (((big.divide(a)).multiply(a)).compareTo(big)!=0) {
            big=big.add(BigInteger.ONE);
        }
        System.out.println(big);
    }
}
