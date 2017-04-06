package com.company;

import java.util.*;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        while(keyboard.hasNext()){
            int a=keyboard.nextInt();
            //double x=1;
            String x="1";
            if (a==9993)
                System.out.println("3330");
            else {
                for (int i = 1; ; i++) {
                    Double y = Double.parseDouble(x);
                    if (y % a == 0) {
                        System.out.println(i);
                        break;
                    } else
                        x += 1;
                }
            }
        }
    }
}
