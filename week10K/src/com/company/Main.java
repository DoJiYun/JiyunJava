package com.company;
import java.util.*;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        int t=keyboard.nextInt();
        keyboard.nextLine();
        for (int i=0;i<t;i++) {
            String k=keyboard.nextLine();
            int count=0;
            for (int l=0;l<k.length();l++) {
                if (k.charAt(l)==' ') {
                    count++;
                }
            }

            int[] x=new int[count+1];
            for (int j=0;j<count+1;j++) {
                x[j]=Integer.parseInt(k.split(" ")[j]);
            }
            Arrays.sort(x);
            String result="";
            String[] save=new String[3];
            for (int j=0;j<3;j++)
                save[j]="";
            int sum=0;
            for (int j=0;j<count+1;j++) {
                sum+=x[j];
            }
            for (int j=0;j<count+1;j++) {
                if (x[j]%3==0) {
                    save[0]+=x[j];
                }
                else if (x[j]%3==1) {
                    save[1]+=x[j];
                }
                else {
                    save[2]+=x[j];
                }
            }
            for (int j=count;j>=0;j--) {
                result+=x[j];
            }
            /*for (int j=0;j<3;j++) {
                System.out.println(save[j]);
            }*/
            if (sum%3==0) {
                result=result;
            }
            else if (sum%3==1){
                if (save[1].length()!= 0) {
                    //save[1]=save[1].substring(1);
                    result=result.replaceFirst(save[1].substring(0,1),"");
                }
                else {
                    if (save[2].length()<2) {
                        result="0";
                    }
                    else {
                        //save[2]=save[2].substring(2);
                        result=result.replaceFirst(save[2].substring(0,1),"");
                        result=result.replaceFirst(save[2].substring(1,2),"");
                    }
                }
            }
            else {
                if (save[2].length()!=0) {
                    //save[2]=save[2].substring(1);
                    result=result.replaceFirst(save[2].substring(0,1),"");
                }
                else {
                    if (save[1].length()<2) {
                        result="0";
                    }
                    else {
                        //save[1]=save[1].substring(2);
                        result=result.replaceFirst(save[1].substring(0,1),"");
                        result=result.replaceFirst(save[1].substring(1,2),"");
                    }
                }
            }
            System.out.println(result);
        }
    }
}
