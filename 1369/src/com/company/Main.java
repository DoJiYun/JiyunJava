package com.company;

import java.util.Scanner;

public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
	    int a,b,count;
        a=keyboard.nextInt();
        b=keyboard.nextInt();
        count=0;

        for (int k=0; ;k++) {
            if (a*Math.pow(2,k)>=b) {
                break;
            }
            else
                count++;
        }
        System.out.println(count);
        if (Math.abs(a*Math.pow(2,count-1)-b)>Math.abs(a*Math.pow(2,count)-b)) {
           System.out.println("pow1:"+Math.abs(a*Math.pow(2,count)-b));
            count=count + (int)Math.abs(a*Math.pow(2,count)-b)-1;
            System.out.println("answer1:"+count);
        }
        else {
            System.out.println("pow2:"+Math.abs(Math.pow(2, count - 1) - b));
            count = count + b - (int) Math.abs(a*Math.pow(2, count - 1) - b);
            System.out.println("answer2:"+count);
        }
    }
}
