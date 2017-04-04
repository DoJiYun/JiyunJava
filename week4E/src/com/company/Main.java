package com.company;

import java.util.Scanner;

public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
	    String per;
        String s,a;

        per=keyboard.nextLine();
        s="jiyun";
        a="jiyun";

        if (per.contains("M"))
            s="Mathematics";
        else if (per.contains("C"))
            s="Computer Science";
        else if (per.contains("I"))
            s="Information Technology";

        if (per.contains("1"))
            a="Freshman";
        else if (per.contains("2"))
            a="Sophomore";
        else if (per.contains("3"))
            a="Junior";
        else if (per.contains("4"))
            a="Senior";

        System.out.println(s+" "+a);
    }
}
