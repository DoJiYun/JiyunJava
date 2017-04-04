package com.company;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            String str = sc.next();
            String delimiter = sc.next();

            String tokens = split(str, delimiter);
            System.out.println(tokens);
        }
    }

    public static String split(String s, String regex) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        String copy = s;
        Matcher k = p.matcher(copy);
        String result = "";
        int count = 0;
        while (k.find()) {
            count++;
        }
        String[] save = new String[2 * count + 1];
        for (int jj = 0; jj < 2 * count + 1; jj++) {
            save[jj] = "";
        }
        if (count == 0) {
            result = s;
        } else {
            int[] ind = new int[count * 2];
            int i = 0;
            while (m.find()) {
                ind[i] = m.start();
                ind[i + 1] = m.end();
                i += 2;
            }
            i = 0;
            save[0] += s.substring(0, ind[0]);
            save[0] += ",";
            save[2 * count] = s.substring(ind[count * 2 - 1]);
            if (ind[count * 2 - 1] == s.length() + 1) {
                save[2 * count] += ",";
            }
            result += save[0];
            for (i = 1; i < count * 2; i++) {
                save[i] = s.substring(ind[i - 1], ind[i]) + ",";
                result += save[i];
            }
            result += save[count * 2];
        }
        return result;

    }
}