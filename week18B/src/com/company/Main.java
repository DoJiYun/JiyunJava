package com.company;

import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        input.nextLine();
        for(int j=0; j<T; j++){
            int n=input.nextInt();
            BigInteger f0 = new BigInteger("0"); // For fib(0)
            BigInteger f1 = new BigInteger("1"); // For fib(1)
            BigInteger currentFib=new BigInteger("0");
            for (int i = 1; i <= n; i++) {
                currentFib = f0.add(f1);
                f0 = f1;
                f1 = currentFib;
            }
            System.out.println(f0);
            //System.out.println(f1);
            //System.out.println(currentFib);
// After the loop, currentFib is fib(n)
            /*String numberString = input.nextLine();
            BigInteger bigNumber = new BigInteger(numberString);
            System.out.println(factorial(bigNumber));*/
        }
    }
}