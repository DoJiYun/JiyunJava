package com.company;

import java.util.*;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        int[] check=new int[10000000];
        Arrays.fill(check,0);
        int count=0;
        while(keyboard.hasNext()){
            int sum;
            sum=0;
            String a = keyboard.nextLine();
            String[] result=a.split(" ");
            for (int i=0;i<result.length;i++) {
                sum+=Integer.parseInt(result[i]);
            }
            check[sum]=1;
        }
        for (int i=0;i<10000000;i++) {
            if (check[i]==1) {
                count++;
            }
        }
        System.out.print(count);
    }
}
