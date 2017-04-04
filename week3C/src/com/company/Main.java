package com.company;

import java.util.Scanner;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
	    int nu;
        nu = keyboard.nextInt();

        int a1,a2,a3,a4,a5,a6,a7,a8,a9;
        int re;
        a1=nu/100000000;
        a2=(nu-a1*100000000)/10000000;
        a3=(nu-a1*100000000-a2*10000000)/1000000;
        a4=(nu-a1*100000000-a2*10000000-a3*1000000)/100000;
        a5=(nu-a1*100000000-a2*10000000-a3*1000000-a4*100000)/10000;
        a6=(nu-a1*100000000-a2*10000000-a3*1000000-a4*100000-a5*10000)/1000;
        a7=(nu-a1*100000000-a2*10000000-a3*1000000-a4*100000-a5*10000-a6*1000)/100;
        a8=(nu-a1*100000000-a2*10000000-a3*1000000-a4*100000-a5*10000-a6*1000-a7*100)/10;
        a9=(nu-a1*100000000-a2*10000000-a3*1000000-a4*100000-a5*10000-a6*1000-a7*100-a8*10);
        re=(a1*1+a2*2+a3*3+a4*4+a5*5+a6*6+a7*7+a8*8+a9*9)%11;
        if (re==10) {
            System.out.println(a1+""+a2+""+a3+""+a4+""+a5+""+a6+""+a7+""+a8+""+a9+""+"X");
        }
        else
            System.out.println(a1+""+a2+""+a3+""+a4+""+a5+""+a6+""+a7+""+a8+""+a9+""+re);
    }
}
