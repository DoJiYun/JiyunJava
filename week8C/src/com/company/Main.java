package com.company;

import java.util.Scanner;

public class Main {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        int t=keyboard.nextInt();
        int[] p=new int[t+1];
        int count=0;
        int[] save=new int[t*2];
        for (int i=0;i<t*2;i++) {
            save[i]=keyboard.nextInt();
        }
        for (int i=0;i<t;i++) {
            p[i]=save[i*2];
        }
        p[t]=save[t*2-1];
        int n=p.length;
        System.out.println(MatrixChainOlder(p,n));
        //System.out.println(chainOrder(p,1,n-1));
    }
    public static long chainOrder(int p[], int i, int j) {
        if (i==j)
            return 0;
        int k;
        long min=1,count;
        for (int l=0;l<p.length;l++) {
            min*=p[i];
        }
        for (k=i;k<j;k++) {
            count=chainOrder(p,i,k)+chainOrder(p,k+1,j)+p[i-1]*p[k]*p[j];
            if (count<min)
                min=count;
        }

        return min;
    }

    public static long MatrixChainOlder(int p[], int n) {
        long[][] m=new long[n][n];
        int i,j,k,L;
        long q;
        long min=1000000000;

        for (i=1;i<n;i++)
            m[i][i]=0;
        for (L=2;L<n;L++) {
            for (i = 1; i < n - L + 1; i++) {
                j = i + L - 1;
                m[i][j] = min;
                for (k = i; k <= j - 1; k++) {
                    q = m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j];
                    if (q < m[i][j])
                        m[i][j] = q;
                }
            }
        }
        return m[1][n-1];
    }
}