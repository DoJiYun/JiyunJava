package com.company;

import java.util.*;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
	    while (true) {
            int t=keyboard.nextInt();
            if (t==0) {
                break;
            }
            else {
                int count=0;
                int[] x=new int[t];
                for (int i=0;i<t;i++) {
                    x[i]=keyboard.nextInt();
                }
                while (!isSame(x,t)) {
                    for (int i=0;i<t;i++) {
                        x[i]/=2;
                        if (i!=t-1) {
                            x[i + 1] += x[i];
                        }
                        else {
                            x[0]+=x[t-1];
                        }

                        if (x[i]%2==1) {
                            x[i]+=1;
                        }
                        count++;
                        System.out.print(x[i]+" ");
                    }
                    System.out.println();
                }
                //System.out.println(count+" "+x[0]);
            }
        }
    }

    static boolean isSame(int x[], int y) {
        for (int i=0;i<y;i++) {
            if (x[0]!=x[i]) {
                return false;
            }
        }
        return true;
    }
}
