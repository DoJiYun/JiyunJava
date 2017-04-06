package com.company;

import java.lang.reflect.Array;
import java.util.*;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
	    int t=keyboard.nextInt();
        keyboard.nextLine();
        for (int i=0;i<t;i++) {
            String x=keyboard.nextLine();
            int l=x.length();
            int count=0;
            for (int j=0;j<l;j++) {
                char y=x.charAt(j);
                if (y==' ') {
                    count++;
                }
            }
            int[] input=new int[count+1];
            int[] sortInput=new int[count+1];
            for (int j=0;j<count+1;j++) {
                input[j]=Integer.parseInt(x.split(" ")[j]);
                sortInput[j]=input[j];
            }
            //int[] sortInput=new int[count+1];
            Arrays.sort(sortInput);
            /*for (int j=0;j<count+1;j++) {
                System.out.println(input[j]+" "+sortInput[j]);
            }*/
            //int save=0;
            int count1=0;
            int[] save1=new int[15];
            Arrays.fill(save1, 100);
            boolean check=true;
            for (int j=0;j<count+1;j++) {
                if (sortInput[j]!=input[j]) {
                    check=false;
                    break;
                }
            }
            if (check) {
                System.out.println("sorted");
            }
            else {
                for (int j = 0; j < count + 1; j++) {
                    if (sortInput[j] != input[j]) {
                        //System.out.println(j);
                        save1[j] = j;
                        //save=j;
                        //count1++;
                        //System.out.println(save+" "+count1);
                        //System.out.println(save1[j]);
                    }
                }
                Arrays.sort(save1);
                for (int j = 0; j < 15; j++) {
                    if (save1[j] != 100) {
                        count1++;
                    }
                    //System.out.println(save1[j]);
                }
                // System.out.println(count1);
                //System.out.println(count1);
                System.out.println(save1[0] + " " + save1[count1 - 1]);
            }
        }
    }
}
