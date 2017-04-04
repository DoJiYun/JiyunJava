package com.company;

import java.util.Calendar;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        Scanner scan = new Scanner(System.in);
        String year = scan.next();
        String month = scan.next();

        c.set(Calendar.YEAR, Integer.valueOf(year));
        c.set(Calendar.MONTH, Integer.valueOf(month) - 1);
        c.set(Calendar.DAY_OF_MONTH, 1);

        int dayofweek = c.get(Calendar.DAY_OF_WEEK);

        c.set(Calendar.DAY_OF_MONTH, 32);
        int lastday = 32 - c.get(Calendar.DAY_OF_MONTH);

        int i = 0;

        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (; i < dayofweek - 1; i++) {
            System.out.print("    ");
        }
        for (int day = 1; day <= lastday; day++, i++) {
            if (i % 7 == 0) {
                if (day!=1)
                    System.out.printf("\n");
            }
            else if (i%7==6) {
                if (day<10)
                    System.out.print(" "+day);
                else
                    System.out.print(day);
            }
            if(i%7!=6 && day!=lastday) {
                if (day < 10)
                    System.out.print(" " + day + "  ");
                else
                    System.out.print(day + "  ");
            }
            else if (day==lastday && i%7!=0) {
                if (day<10)
                    System.out.print(" "+day);
                if (i%7!=6)
                    System.out.print(day);
            }
            else if (day==lastday && i%7==0) {
                if (day<10)
                    System.out.print(" ");
                else
                    System.out.print("");
            }
        }
    }
}