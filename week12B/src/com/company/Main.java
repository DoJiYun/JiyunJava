package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            String hex = sc.next();
            int value;
            try {
                value = HexFormat.parseHex(hex);
            } catch (HexFormatException ex) {
                System.out.println(ex);
                continue;
            }
            System.out.println(value);
        }
    }

}

class HexFormat {
    static int value;
    public static int parseHex(String k) throws HexFormatException {
        //boolean check = true;
        for (int i = 0; i < k.length(); i++) {
            if ((k.charAt(i) >= '0' && k.charAt(i) <= '9') || (k.charAt(i) >= 'A' && k.charAt(i) <= 'F')) {
                //check = true;
            } else {
                //System.out.print("HexFormatException: Illegal hex character: ");
                throw new HexFormatException(k.charAt(i));

                //check=false;
                //break;
            }
        }
        int result = Integer.parseInt(k, 16);
        value = result;
        return result;
    }
}

class HexFormatException extends Exception {
    private String k="";
    public HexFormatException(char x) {
        k+=x;
    }
    public String toString() {
        return "HexFormatException: Illegal hex character: " + this.k;
    }
}
