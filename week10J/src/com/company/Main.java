package com.company;

import java.util.*;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        int t=keyboard.nextInt();
        keyboard.nextLine();
        for (int j=0;j<t;j++) {
            String input = keyboard.nextLine();
            int count = 0;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ') {
                    count++;
                }
            }
            String[] save = new String[count + 1];
            for (int i = 0; i < count + 1; i++) {
                save[i] = input.split(" ")[i];
            }
            Arrays.sort(save);
            String a = "";
            String[] cut = new String[count + 1];
            for (int i = 0; i < count + 1; i++) {
                cut[i] = save[i].substring(0, 1);
            }
            Arrays.sort(cut);

            for (int i = 0; i < count + 1; i++) {
                for (int k = 0; k < count + 1; k++) {
                    if (cut[i].equals(save[i].substring(0, 1))) {
                        cut[i] += save[i].substring(1);
                        i++;
                    }
                }
            }
            for (int i=0;i<count+1;i++) {
                System.out.println(cut[i]);
            }
            String result="";
            for (int i=count;i>=0;i--) {
                result+=cut[i];
            }
            System.out.println(result);
        }
    }
}
