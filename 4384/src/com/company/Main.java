package com.company;

import java.util.*;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        String a=keyboard.nextLine();
        int x=keyboard.nextInt();
        int k=keyboard.nextInt();

        int bc=0;
        for (int i=0;i<a.length();i++) {
            char z=a.charAt(i);
            if (z==' ') {
                bc++;
            }
        }

        int[] input=new int[bc+1];
        for (int i=0;i<bc+1;i++) {
            input[i]=Integer.parseInt(a.split(" ")[i]);
            //System.out.println(input[i]);
        }
        Arrays.sort(input);
        int[] minus=new int[bc+1];
        int[] sort=new int[bc+1];
        for (int i=0;i<bc+1;i++) {
            minus[i]=Math.abs(input[i]-x);
            sort[i]=minus[i];
            //System.out.println(minus[i]);
        }

        Arrays.sort(sort);
        //int count=0;
        /*for (int i=0;i<bc+1;i++) {
            if (sort[i]==0) {
                count++;
            }
        }*/
        for (int i=0;i<bc;i++) {
            if (sort[i]==sort[i+1]) {
                sort[i]=-1;
            }
        }
        //System.out.println(count);

        Arrays.sort(sort);
        int count=0;
        for (int i=0;i<bc+1;i++) {
            if (sort[i]==-1)
                count++;
        }
        int[] save=new int[bc+1+count];
        int saveCount=0;
        for (int i=0;i<bc+1;i++) {
            //System.out.println(sort[i]);
            for (int j=bc;j>=0;j--) {
                if (sort[i] == minus[j]) {
                    //System.out.println(input[j]);
                    save[saveCount]=input[j];
                    saveCount++;
                }
            }
        }
        /*for (int i=0;i<bc+1+count;i++) {
            System.out.println(save[i]);
        }*/
        for (int i=0;i<k-1;i++) {
            System.out.print(save[i]+" ");
        }
        System.out.print(save[k-1]);
    }
}
