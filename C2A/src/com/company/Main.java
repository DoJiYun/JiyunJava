package com.company;

import java.util.Scanner;

public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        String t1=keyboard.nextLine();
        int t=Integer.parseInt(t1);
        String[] x=new String[t];
        int[] length=new int[t];
        boolean[] ji=new boolean[t];
        for (int i=0;i<t;i++) {
            x[i]=keyboard.nextLine();
            length[i]=x[i].length();
            ji[i]=false;
        }
        for (int i=0;i<t;i++) {
            for (int j=2;j<length[i];j++) {
                char z=x[i].charAt(j);
                char z1=x[i].charAt(0);
                char z2=x[i].charAt(1);
                if (z1=='0' && (z2=='x' || z2=='X')) {
                    if ((z >= '0' && z <= '9') || (z >= 'a' && z <= 'f') || (z >= 'A' && z <= 'F')) {
                        ji[i] = true;
                    } else {
                        ji[i] = false;
                        break;
                    }
                }
                else {
                    ji[i] = false;
                    break;
                }
            }
        }
        for (int i=0;i<t;i++) {
            if (ji[i]) {
                x[i]=x[i].substring(2);
                int result=Integer.parseInt(x[i],16);
                System.out.println(result);
            }
            else
                System.out.println("null");
        }
    }
}
