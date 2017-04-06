package com.company;

import java.util.*;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            String x=keyboard.nextLine();
            double a=Double.parseDouble(x);
            //System.out.println(a);
            int result;

            if (a==0.00) {
                break;
            }

            else {
                double sum=0;
                for (int i=0;;i++) {
                    sum+=Math.pow(i+2,-1);
                    //System.out.println(sum);
                    if (sum>a) {
                        result=i+1;
                        System.out.println(result+" card(s)");
                        break;
                    }
                }
            }


        }
    }
}
