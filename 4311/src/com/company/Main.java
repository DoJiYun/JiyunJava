package com.company;

import java.util.*;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        int a,i,num1,num2,num3,j,k;
        a=keyboard.nextInt();
        int[] b=new int[a];
        for (k=0;k<a;k++) {
            b[k]=keyboard.nextInt();
        }
        num1=1;
        num2=0;
        num3=0;

        for (i=0;i<a;++i) {
            if (b[i]<=5) {
                System.out.println("NULL");
            }
            else {
                for (num1=1;num1<=b[i]/2;num1++) {
                    for (j=num1+1;j<b[i];j++) {
                        num2=j;
                        num3=b[i]-num2-num1;
                        if (num3==num2 || num2>num3) {
                            break;
                        }
                        System.out.printf("%d %d %d\n",num1,num2,num3);
                    }
                }
            }
        }
    }
}
