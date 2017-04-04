package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            char ch = sc.next().charAt(0);
            MyCharacter c = new MyCharacter(ch);
            System.out.println(c.charValue());
            System.out.println(c.compareTo(new MyCharacter('i')));
            System.out.println(c.equals(new MyCharacter('i')));
            System.out.println(c.isDigit());
            System.out.println(c.isDigit(ch));
            System.out.println(MyCharacter.isDigit(ch));
            System.out.println(MyCharacter.isLetter(ch));
            System.out.println(MyCharacter.isLetterOrDigit(ch));
            System.out.println(MyCharacter.isLowerCase(ch));
            System.out.println(MyCharacter.isUpperCase(ch));
            System.out.println(MyCharacter.toUpperCase(ch));
            System.out.println(MyCharacter.toLowerCase(ch));
        }
    }
}

class MyCharacter {
    char x;
    MyCharacter(char a) {
        x=a;
    }
    public char charValue() {
        return x;
    }
    public int compareTo(MyCharacter a) {
        return (int)x-a.charValue();
    }
    public boolean equals(MyCharacter a) {
        char k=a.charValue();
        String l1="";
        String l2="";
        l1+=k;
        l2+=x;
        if (l1.equals(l2)) {
            return true;
        }
        else
            return false;
    }
    public boolean isDigit() {
        return Character.isDigit(x);
    }
    public static boolean isDigit(char a) {
        return Character.isDigit(a);
    }
    public static boolean isLetter(char a) {
        if ((a>='a' && a<='z') || (a>='A' && a<='Z')) {
            return true;
        }
        else
            return false;
    }
    public static boolean isLetterOrDigit(char a) {
        //boolean jiyun=false;
        if (isDigit(a) || isLetter(a)) {
            return true;
        }
        else
            return false;
    }
    public static boolean isUpperCase(char a) {
        if (a>='A' && a<='Z') {
            return true;
        }
        else
            return false;
    }
    public static boolean isLowerCase(char a) {
        if (a>='a' && a<='z') {
            return true;
        }
        else
            return false;
    }
    public static String toUpperCase(char a) {
        String k="";
        k+=a;
        return k.toUpperCase();
    }
    public static String toLowerCase(char a) {
        String k="";
        k+=a;
        return k.toLowerCase();
    }
}