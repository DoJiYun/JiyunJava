package com.company;
import java.lang.reflect.Array;
import java.util.*;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        int t=keyboard.nextInt();
        double[] result=new double[t*4];
        for (int i=0;i<t;i++) {
            double[] x=new double[4];
            double[] y=new double[4];
            for (int j=0;j<4;j++) {
                x[j]=keyboard.nextDouble();
                y[j]=keyboard.nextDouble();
            }
            double a,b,c,d,e,f;
            a=y[0]-y[2];
            b=-x[0]+x[2];
            c=y[1]-y[3];
            d=-x[1]+x[3];
            e=a*x[0]+b*y[0];
            f=c*x[1]+d*y[1];
            double x1=(e*d-b*f)/(a*d-b*c);
            double y1=(a*f-e*c)/(a*d-b*c);
            //System.out.println(x1+" "+y1);
            double[] aa=new double[4];
            aa[0]=x[0]*y[1]+x[1]*y1+x1*y[0]-x[1]*y[0]-x1*y[1]-x[0]*y1;
            aa[1]=x[1]*y[2]+x[2]*y1+x1*y[1]-x[2]*y[1]-x1*y[2]-x[1]*y1;
            aa[2]=x[2]*y[3]+x[3]*y1+x1*y[2]-x[3]*y[2]-x1*y[3]-x[2]*y1;
            aa[3]=x[3]*y[0]+x[0]*y1+x1*y[3]-x[0]*y[3]-x1*y[0]-x[3]*y1;
            for (int j=0;j<4;j++) {
                aa[j]=Math.abs(aa[j]);
                aa[j]/=2;
                aa[j]=Math.round(aa[j]*100);
                aa[j]/=100;
            }
            /*for (int j=0;j<4;j++) {
                for (int k=0;k<4;k++) {
                    if (aa[j]>aa[k]) {
                        double ab=aa[j];
                        aa[j]=aa[k];
                        aa[k]=ab;
                    }
                }
            }*/
            Arrays.sort(aa);
            for (int j=0;j<4;j++) {
                result[4*i+j]=aa[j];
            }
            //System.out.printf("%.2f %.2f %.2f %.2f", aa[0],aa[1],aa[2],aa[3]);
        }
        for (int i=0;i<t;i++) {
            System.out.printf("%.2f %.2f %.2f %.2f\n",result[4*i],result[4*i+1],result[4*i+2],result[4*i+3]);
        }
    }
}
