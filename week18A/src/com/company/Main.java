package com.company;

import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        input.nextLine();
        for (int i = 0; i < T; i++) {
            String numberString = input.nextLine();
            BigInteger bigNumber = new BigInteger(numberString);
            System.out.println(factorial(bigNumber));
        }
    }
    static BigInteger factorial(BigInteger a) {
        if (a.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        }
        else {
            return a.multiply(factorial(a.subtract(BigInteger.ONE)));
        }
    }
}
