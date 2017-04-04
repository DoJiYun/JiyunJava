package com.company;

import java.util.*;

public class Main {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        String[][] result=new String[6][7];
        int[] input=new int[42];
        int[] count=new int[7];
        Arrays.fill(count, 5);
        for (int i=0;i<6;i++) {
            for (int j=0;j<7;j++) {
                result[i][j]=" ";
            }
        }
        for (int i=0;i<42;i++) {
            input[i]=keyboard.nextInt();
            if (i%2==0) {
                result[count[input[i]]][input[i]]="R";
            }
            else
                result[count[input[i]]][input[i]]="Y";
            count[input[i]]--;
            if (isCount(result,6,7)!=100) {
                for (int j=0;j<6;j++) {
                    for (int k=0;k<7;k++) {
                        System.out.print(result[j][k]);
                    }
                    System.out.println();
                }
                break;
            }
        }
        //System.out.println(isCount(result,6,7));
    }
    public static int isCount(String[][] x,int a,int b) {
        a=6;
        b=7;
        int count=0;
        for (int i=0;i<a;i++) {
            for (int j=0;j<b;j++) {
                count++;
                if (j<b-3) {
                    if (x[i][j].equals(x[i][j + 3]) && !x[i][j].equals(" ")) {
                        if (x[i][j].equals(x[i][j + 1]) && x[i][j].equals(x[i][j + 2])) {
                            return count;
                        }
                    }
                }
                if (i<a-3) {
                    if (x[i][j].equals(x[i + 3][j]) && !x[i][j].equals(" ")) {
                        if (x[i][j].equals(x[i + 2][j]) && x[i + 2][j].equals(x[i + 1][j])) {
                            return count;
                        }
                    }
                }
                if (i<a-3 && j<b-3) {
                    if (x[i][j].equals(x[i + 3][j + 3]) && !x[i][j].equals(" ")) {
                        if (x[i][j].equals(x[i + 2][j + 2]) && x[i][j].equals(x[i + 1][j + 1])) {
                            return count;
                        }
                    }
                }
            }
            for (int j = b - 1; j > 2; j--) {
                if (i<a-3) {
                    if (x[i][j].equals(x[i + 3][j - 3]) && !x[i][j].equals(" ")) {
                        if (x[i][j].equals(x[i+2][j-2]) && x[i][j].equals(x[i+1][j-1])) {
                            return count;
                        }
                    }
                }
            }
        }
        return 100;
    }
}
