package com.company;
import java.util.*;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
	    String t1=keyboard.nextLine();
        String t2=keyboard.nextLine();
        int t=Integer.parseInt(t1);// º¼¶³¾î¶ß¸°È½¼ö
        int u=Integer.parseInt(t2);// ½½·ÔÀÇ °³¼ö bnum,M
        String[] x=new String[t];
        int[] slot=new int[u];//bnum

        for (int i=0;i<t;i++) {
            x[i]=keyboard.nextLine();
        }
        for (int i=0;i<u;i++) {
            slot[i]=0;
        }
        for (int i=0;i<t;i++) {
            int count=0;//b[i]
            for (int j=0;j<u-1;j++) {
                char z=x[i].charAt(j);
                if (z=='R') {
                    count++;
                }
                else
                    continue;
            }
            slot[count]++;
        }
        for (int i=0;i<u;i++) {
            System.out.println(slot[i]);
        }
    }
}
