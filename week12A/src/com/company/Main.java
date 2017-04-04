package com.company;

import java.util.*;

public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int T = keyboard.nextInt();
        keyboard.nextLine();
        for (int i = 0; i < T; i++) {
            boolean check1 = true;
            boolean check2 = true;
            String x = keyboard.nextLine();
            //System.out.println(x);
            String y = "";
            /*if (x.contains("+") || x.contains("-") || x.contains("*") || x.contains("/") || x.contains("%")) {
                check1 = true;
            } else {
                check1 = false;
            }*/

            //System.out.println(check1);
            String[] input=new String[3];
            for (int j=0;j<3;j++) {
                input[j]=x.split(" ")[j];
                //System.out.println(input[j]);
            }

            //for (int j=0;j<3;j+=2) {
                for (int k = 0; k < input[0].length(); k++) {
                    if (input[0].charAt(k) >= '0' && input[0].charAt(k) <= '9') {
                        check1 = true;
                    }
                    else if (input[0].charAt(0)=='-') {
                        check1=true;
                    }
                    else {
                        check1 = false;
                        break;
                    }
                }
            //}
            if (check1) {
                for (int k = 0; k < input[2].length(); k++) {
                    if (input[2].charAt(k) >= '0' && input[2].charAt(k) <= '9') {
                        check1 = true;
                    } else if (input[2].charAt(0) == '-') {
                        check1 = true;
                    } else {
                        check1 = false;
                        break;
                    }
                }
            }

            /*if (input[0].charAt(0)=='-' || input[2].charAt(0)=='-') {
                check1=true;
            }*/

            if (input[1].contains("+") || input[1].contains("-") || input[1].contains("*") || input[1].contains("/") || input[1].contains("%")) {
                check2=true;
            }
            else {
                check2=false;
            }
            /*for (int j = 0; j < x.length(); j++) {
                if ((x.charAt(j) >= 0 && x.charAt(j) <= 9)) {
                    check2 = true;
                } else {
                    check2 = false;
                    break;
                }
            }*/

            //System.out.println(check1+" "+check2);
            if (check1 && check2) {
                String result=x;
                result+=" = ";
                if (input[1].equals("+")) {
                    result+=Integer.parseInt(input[0])+Integer.parseInt(input[2]);
                }
                else if (input[1].equals("-")) {
                    result+=Integer.parseInt(input[0])-Integer.parseInt(input[2]);
                }
                else if (input[1].equals("*")) {
                    result+=Integer.parseInt(input[0])*Integer.parseInt(input[2]);
                }
                else if (input[1].equals("/")) {
                    if (input[2].equals("0")) {
                        result="Wrong Input: 0";
                        //result+=input[0];
                    }
                    else
                        result+=Integer.parseInt(input[0])/Integer.parseInt(input[2]);
                }
                else {
                    result+=Integer.parseInt(input[0])%Integer.parseInt(input[2]);
                }
                System.out.println(result);
            }
            else {
                String result="Wrong Input: ";
                boolean ww=true;
                if (check2) {
                    for (int j = 0; j < input[0].length(); j++) {
                        if (input[0].charAt(0)=='-' || (input[0].charAt(j) >= '0' && input[0].charAt(j) <= '9')) {
                            ww = true;
                        }
                        else {
                            ww=false;
                            break;
                        }

                    }
                    if (ww) {
                        result += input[2];
                    } else {
                        result += input[0];
                    }
                }
                else {
                    for (int j = 0; j < input[0].length(); j++) {
                        if (!(input[0].charAt(j) >= '0' && input[0].charAt(j) <= '9')) {
                            ww = false;
                            break;
                        }
                    }
                    if (ww) {
                        result += input[1];
                    } else {
                        result += input[0];
                    }
                    //result+=input[1];
                }
                System.out.println(result);
            }
        }
    }
}
