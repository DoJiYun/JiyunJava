package com.company;

import java.util.Scanner;

public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        String[] x=new String[8];
        for (int i=0;i<8;i++) {
            x[i]=keyboard.nextLine();
        }
        int[] a=new int[8];
        boolean check=true;
        for (int i=0;i<8;i++) {
            int count=0;
            for (int j=0;j<8;j++) {
                char z=x[i].charAt(j);
                if (z=='Q') {
                    a[i]=j+1;
                    count++;
                }
            }
            if(count>1) {
                //System.out.println("1Invalid");
                check=false;
                break;
            }
            else {
                count=0;
            }
        }

        if (check==true) {
            for (int i=0;i<8;i++) {
                for (int j=1;j<7;j++) {
                    if ((a[i] == a[j]) && i!=j) {
                        //System.out.println("Invalid");
                        check = false;
                        break;
                    }

                }
            }
            for (int i=0;i<7;i++) {
                if (Math.abs(a[i]-a[i+1])==1) {
                    //System.out.println("3Invalid");
                    check=false;
                    break;
                }
            }
        }
        if (check==false) {
            System.out.println("Invalid");
        }
        else
            System.out.println("Valid");
        /*for(int i=0;i<8;i++) {
            System.out.println(a[i]);
        }*/
    }
}
