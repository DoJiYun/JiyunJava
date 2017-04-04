package com.company;

import java.text.SimpleDateFormat;
import java.util.*;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
	    int t=keyboard.nextInt();
        for (int i=0;i<t;i++) {
            int[] x=new int[6];
            Calendar cal=Calendar.getInstance();
            for (int j=0;j<6;j++) {
                x[j]=keyboard.nextInt();
            }
            cal.set(x[0], x[1]-1, x[2], x[3], x[4], x[5]);
            cal.add(Calendar.SECOND,-1000);
            cal.add(Calendar.DATE,1000);
            SimpleDateFormat fm=new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
            String pr=fm.format(cal.getTime());
            System.out.println(pr);
        }
    }
}
