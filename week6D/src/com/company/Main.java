package com.company;

import java.util.Scanner;

public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        String a=keyboard.nextLine();
        int a1=Integer.parseInt(a);

        String[] x=new String[a1];
        String[] result=new String[a1];
        int[] length=new int[a1];
        for (int i=0; i<a1; i++) {
            x[i]=keyboard.nextLine();
            result[i]="";
            length[i]=x[i].length();
        }
        for (int i=0;i<a1;i++) {
            for (int j=0;j<length[i];j++) {
                char z=x[i].charAt(j);
                if (('a'<=z && z<='z') || ('A'<=z && z<='Z')) {
                    z=Character.toLowerCase(z);
                    switch (z) {
                        case 'a':case 'b':case 'c':
                            z='2';
                            break;
                        case 'd':case 'e':case 'f':
                            z='3';
                            break;
                        case 'g':case 'h':case 'i':
                            z='4';
                            break;
                        case 'j':case 'k':case 'l':
                            z='5';
                            break;
                        case 'm':case 'n':case 'o':
                            z='6';
                            break;
                        case 'p':case 'q':case 'r':case 's':
                            z='7';
                            break;
                        case 't':case 'u':case 'v':
                            z='8';
                            break;
                        default:
                            z='9';
                            break;
                    }
                }
                result[i] += z;
            }
        }
        for (int i=0;i<a1;i++) {
            // result[i]=Character.isUpperCase(result[i]);
            //System.out.println(x[i]+result[i]);
            System.out.println(result[i]);
            //System.out.println("2: "+x[i]);
        }
    }
}
