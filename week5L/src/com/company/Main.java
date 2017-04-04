package com.company;
import java.util.*;

public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        int a=keyboard.nextInt();
        short[] x=new short[a];
        String[] y=new String[a];
        for (int i=0;i<a;i++) {
            x[i] = keyboard.nextShort();
            if (x[i] < 0)
                y[i] = Integer.toBinaryString(0xFFFF & x[i]);
            else
                y[i] = String.format("%16s", Integer.toBinaryString(x[i])).replace(' ', '0');
            System.out.println(y[i]);
        }
        /*for (int i=0;i<a;i++) {
            if (x[i]<0)
                y[i]=Integer.toBinaryString(0xFFFF & x[i]);
            else
                y[i] = String.format("%16s", Integer.toBinaryString(x[i])).replace(' ', '0');
            System.out.println(y[i]);
        }*/
    }
}
/*public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        int a=keyboard.nextInt();
        short[] x=new short[a];
        String[] y=new String[a];
        for (int i=0;i<a;i++)
            x[i]=keyboard.nextShort();
        for (int i=0;i<a;i++) {
            if (x[i] > 0) {
                y[i] = String.format("%16s", Integer.toBinaryString(x[i])).replace(' ', '0');
            }
            else {
                y[i]=Integer.toBinaryString(x[i]);
            }
        }
        for (int i=0;i<a;i++)
            System.out.println(y[i]);
    }
}*/