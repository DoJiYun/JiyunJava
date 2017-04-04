package com.company;

import java.text.MessageFormat;
import java.util.Scanner;

public class Main {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String args[]) {
        int t = keyboard.nextInt();
        String[] result = new String[t];
        for (int jiyun = 0; jiyun < t; jiyun++) {
            result[jiyun] = "";
        }
        for (int jiyun = 0; jiyun < t; jiyun++) {
            int number = keyboard.nextInt();
            if (number == 1) {
                result[jiyun] += " 1";
            } else {
                int count;
                StackOfIntegers stack = new StackOfIntegers();
                for (int i = 2; i <= (number); i++) {
                    count = 0;
                    while (number % i == 0) {
                        number /= i;
                        count++;
                        stack.push(i);
                    }
                    if (count == 0) continue;
                    count++;
                }
                while (!stack.empty()) {
                    result[jiyun] += MessageFormat.format(" {0}", stack.pop());
                }
            }
        }
        for (int jiyun = 0; jiyun < t; jiyun++) {
            result[jiyun]=result[jiyun].replaceAll(",","");

            System.out.println(result[jiyun].substring(1));
        }
    }
}

class StackOfIntegers {
    int[] elements;
    int size;

    public StackOfIntegers() {
        this(16);
    }

    public StackOfIntegers(int capacity) {
        elements = new int[capacity];
    }

    public int push(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }

        return elements[size++] = value;
    }

    public int pop() {
        return elements[--size];
    }

    public boolean empty() {
        return size == 0;
    }

}