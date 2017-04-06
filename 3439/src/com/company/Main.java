package com.company;

import java.util.*;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            int t=keyboard.nextInt();
            int[] count=new int[49];
            Arrays.fill(count,0);
            boolean check=true;
            if (t==0) {
                break;
            }
            else {
                for (int i=0;i<t*6;i++) {
                    int a = keyboard.nextInt();
                    count[a - 1]++;
                }

                for (int i=0;i<49;i++) {
                    if (count[i]==0) {
                        check=false;
                        break;
                    }
                }
            }

            if (check) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }
}
