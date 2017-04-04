package com.company;

import java.util.*;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        // write your code here
        String[] input=new String[8];
        for (int i=0;i<8;i++) {
            input[i]=keyboard.nextLine();
        }
        int count=0;
        int x=0,y=0;
        //boolean check=true;
        while (true) {
            if(x==7 && y==7) {
                //check=false;
                break;
            }

            if (x<6 && y<7) {
                /*if ((input[x + 1].substring(y, y + 1)).equals("x") && (input[x].substring(y+1,y+2)).equals(".")) {
                    count++;
                    y++;
                    System.out.println("right" + " " + x + " " + y);
                }
                else if (input[x+1].substring(y,y+1).equals(".") && (input[x+1].substring(y+1,y+2).equals(".") || input[x+2].substring(y,y+1).equals("."))) {
                    x++;
                    count++;
                    System.out.println("bottom1 "+x+" "+y);
                }
                else {
                    x++;
                    count++;
                    System.out.println("bottom" + " " + x + " " + y);
                }*/
                if (input[x+1].substring(y,y+1).equals(".") && (input[x+1].substring(y+1,y+2).equals(".") || input[x+2].substring(y,y+1).equals("."))) {
                    x++;
                    count++;
                   // System.out.println("bottom "+x+" "+y);
                }
                else {
                    y++;
                    count++;
                    //System.out.println("right "+x+" "+y);
                }
            }
            else if (y==7) {
                                    x++;
                    count++;
                    //System.out.println("bottomy=7 "+x+" "+y);

            }
            else if (x==6) {
                if (input[7].substring(y,y+1).equals(".") && input[7].substring(y+1,y+2).equals(".")) {
                    x++;
                    count++;
                }
                else {
                    y++;
                    count++;
                }
            }
            else {
                y++;
                count++;
                //System.out.println("last line"+" "+x+" "+y);
            }
        }
        System.out.println(count);
    }
}
