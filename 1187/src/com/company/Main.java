package com.company;

import java.util.*;

public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {

        while (true) {
            int a=keyboard.nextInt();
            boolean check=true;
            if (a==0)
                break;
            else {
                int[] x=new int[a];
                if (a<7) {
                    check=false;
                    break;
                }
                else {
                    for (int i = 0; i < a; i++) {
                        x[i] = keyboard.nextInt();
                    }
                    Arrays.sort(x);
                    for (int i=0;i<a-1;i++) {
                        if (x[i+1]-x[i]>200) {
                            check=false;
                            break;
                        }
                    }
                    if (x[0]>200) {
                        check=false;
                        break;
                    }
                    if (1522-x[a-1]>200) {
                        check=false;
                        break;
                    }
                }
            }
            if (check) {
                System.out.println("POSSIBLE");
            }
            else {
                System.out.println("IMPOSSIBLE");
            }
        }
    }
}