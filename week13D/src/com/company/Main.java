package com.company;

import java.math.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            Rational r1 = Rational.getFraction(sc.next());
            Rational r2 = Rational.getFraction(sc.next());

            System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
            System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
            System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
            System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        }
    }
}

class Rational {
    BigInteger x, y;

    Rational(BigInteger a, BigInteger b) {
        if (b.compareTo(BigInteger.ZERO) < 0) {
            x = a.negate();
            y = b.negate();
        } else {
            x = a;
            y = b;
        }
    }

    public static Rational getFraction(String k) {
        int count = -1;
        int save = -1;
        String l = "";
        for (int i = 0; i < k.length(); i++) {
            if (k.charAt(i) == '.') {
                count++;
                save = i;
            } else {
                l += k.charAt(i);
            }
        }
        String m = "1";
        for (int i = 0; i < k.length() - save - 1; i++) {
            m += "0";
        }
        BigInteger x1 = new BigInteger(l);
        BigInteger y1 = new BigInteger(m);
        if (count == 0) {
            Rational result = new Rational(x1, y1);
            return result;
        } else {
            Rational result = new Rational(x1, BigInteger.ONE);
            return result;
        }
    }

    Rational add(Rational k) {
        BigInteger r = y.gcd(k.y);
        r = (y.multiply(k.y)).divide(r);
        BigInteger x1 = r.divide(y);
        BigInteger x2 = r.divide(k.y);

        Rational result = new Rational((x.multiply(x1)).add(x2.multiply(k.x)), r);
        return result;
    }

    Rational subtract(Rational k) {
        BigInteger r = y.gcd(k.y);
        r = (y.multiply(k.y)).divide(r);
        BigInteger x1 = r.divide(y);
        BigInteger x2 = r.divide(k.y);

        Rational result = new Rational((x.multiply(x1)).subtract(x2.multiply(k.x)), r);
        return result;
    }

    Rational multiply(Rational k) {
        Rational result = new Rational(x.multiply(k.x), y.multiply(k.y));
        return result;
    }

    Rational divide(Rational k) {
        Rational result = new Rational(x.multiply(k.y), y.multiply(k.x));
        return result;
    }

    public String toString() {
        String result = "";
        BigInteger kk = y.gcd(x);
        if (!(y.gcd(x)).equals(BigInteger.ONE)) {
            x = x.divide(kk);
            y = y.divide(kk);
        }
        if (y.equals(BigInteger.ONE)) {
            result += x;
        } else {

            // result+=kk+" ";
            result += x;
            result += "/";
            result += y;
        }

        return result;
    }

    /*static BigInteger gcd(BigInteger a, BigInteger b) {
        BigInteger r=new BigInteger("1");
        while (!b.equals(BigInteger.ZERO)) {
            r=a.
        }
    }*/
}