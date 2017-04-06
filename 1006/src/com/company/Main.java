package com.company;

import java.util.*;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        while(keyboard.hasNext()){
            String a=keyboard.nextLine();
            int l=a.length();
            int sum=0;
            for (int i=0;i<l;i++) {
                char x=a.charAt(i);
                sum+=(int)x-48;
            }
            //System.out.println(sum);
            if (sum==31 || sum==25) {
                System.out.println(a+" B");
            }
            else if (sum==20) {
                System.out.println(a+" A");
            }
            else if (sum>=26 && sum<=30) {
                System.out.println(a+" A");
            }
            else if (sum==24) {
                System.out.println(a+" A");
            }
        }
    }
}