package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();
            if (n == -1) {
                if (!queue.empty()) queue.dequeue();
            } else {
                queue.enqueue(n);
            }
        }
        while (!queue.empty())
            System.out.println(queue.dequeue());
    }
}

class Queue {
    int[] elements=new int[1000000];
    static int size=0;

    Queue() {
        size=8;
    }
    void enqueue(int v) {
        elements[size]=v;
        size++;
    }
    int dequeue() {
        for (int i=0;i<size-1;i++) {
            elements[i]=elements[i+1];
        }
        size--;
        return elements[7];
    }
    boolean empty() {
        if (size==8) {
            return true;
        }
        else
            return false;
    }
    int getSize() {
        return size;
    }
}