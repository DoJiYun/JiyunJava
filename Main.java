package com.company;
import java.util.Scanner;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        int a,h,m,s;
        a=keyboard.nextInt();
        h=a/3600;
        m=(a%3600)/60;
        s=a%60;
        System.out.println(h+" "+m+" "+s);
    }
}
