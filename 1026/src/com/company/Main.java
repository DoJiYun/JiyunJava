package com.company;

import java.util.*;

public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        double sum = 0;
        int save=0;
        while (keyboard.hasNext()) {
            String x = keyboard.nextLine();
            if (x.contains(" ")) {
                int[] t = new int[3];
                for (int i = 0; i < 3; i++) {
                    t[i] = Integer.parseInt(x.substring(0, 8).split(":")[i]);
                    //System.out.println(t[i]);
                }

                int v = Integer.parseInt(x.substring(9));
                //System.out.println("v "+v);
                int s = 3600 * t[0] + 60 * t[1] + t[2];

                //System.out.println("s "+s);
                sum += (s-save) * v / 7200.0;
                save=s;

                //System.out.println("sum "+sum);
                String a = keyboard.nextLine();
                while (!a.contains(" ")) {
                    /*if (a.contains(" ")) {
                        int[] t2 = new int[3];
                        for (int i = 0; i < 3; i++) {
                            t2[i] = Integer.parseInt(a.substring(0, 8).split(":")[i]);
                            System.out.println("t2 " + t2[i]);
                        }

                        int v2 = Integer.parseInt(x.substring(9));
                        System.out.println("v2 " + v2);
                        int s2 = 3600 * t2[0] + 60 * t2[1] + t2[2];
                        System.out.println("s2 " + s2);
                        sum = s2 * v2 / 7200.0;
                        System.out.println("sum2 " + sum);*/
                    //} else {
                    int[] t1 = new int[3];
                    for (int i = 0; i < 3; i++) {
                        t1[i] = Integer.parseInt(a.substring(0, 8).split(":")[i]);
                        //System.out.println("t1 " + t1[i]);
                    }
                    int s1 = 3600 * t1[0] + 60 * t1[1] + t1[2];
                    //System.out.println("s1 " + s1);
                    sum += (s1 - save) * v / 3600.0;
                    save = s1;
                    sum = Math.round(sum * 100) / 100;
                    System.out.print(a);
                    System.out.printf(" %.2f", sum);
                    System.out.println(" km");
                    a = keyboard.nextLine();
                    //}
                }
            }
            //x = keyboard.nextLine();
        }
    }
}
