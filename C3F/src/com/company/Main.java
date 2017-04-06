package com.company;

import java.util.Scanner;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
	    int T,n;
        T=keyboard.nextInt();
        n=keyboard.nextInt();
        int m=0;
        int count;
        int j,num;
        int[] a=new int[20];

        for(m=0; m<T; m++) {
            count=1;
            num=keyboard.nextInt();
            if (num==0) {
                System.out.printf("%d\n", 0);
                continue;
            }
            while (num!=0) {
                if (num%n <10)
                    a[20-count]=num%n+'0';
                else
                    a[20-count]='A'+num%n-10;
                count++;
                num/=n;
            }
            j=0;
            while (j<count-1) {
                System.out.printf("%c",a[20-count+1+j]);
                j++;
            }
            System.out.printf("\n");
        }
    }
}
