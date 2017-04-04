package com.company;

import java.util.Scanner;

public class Main {
    //static // given a chess board and a 0,0 starting point, can a knight pass through
// all the the squares without passing
// a square twice
    //int[][] positionsVisited = new int[9][9];
    static int positionX = 1;
    static int positionY = 1;
    boolean stop = false;
    static boolean continUe = false;
    static int moveCounter = -1;
    static Scanner keyboard=new Scanner(System.in);
    static int a=keyboard.nextInt();
    static int b=keyboard.nextInt();
    static int[][] positionsVisited=new int[a+1][b+1];
    public static void main(String[] args) {


        if (recursive(1, 1, 0)) {
            System.out.println("yes");
        } else System.out.println("no");
    }

    public static boolean recursive(int x, int y, int moveType) {


        if (x > 8 || x <= 0 || y > 8 || y <= 0) return false;
        if (positionsVisited[x][y] == 1) {
            return false;
        }
        positionX = x;
        positionY = y;
        positionsVisited[positionX][positionY]++;

        char c;
        c = 'a';
        switch (positionX) {
            case 1:
                c = 'a';
                break;
            case 2:
                c = 'b';
                break;
            case 3:
                c = 'c';
                break;
            case 4:
                c = 'd';
                break;
            case 5:
                c = 'e';
                break;
            case 6:
                c = 'f';
                break;
            case 7:
                c = 'g';
                break;
            case 8:
                c = 'h';
                break;

            default:
                break;
        }
        moveCounter++;
        //System.out.println("doing move " + moveType + " move count: " + moveCounter);
        //System.out.println("Knight is in " + c + "," + positionY);

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if (recursive(positionX + 2, positionY + 1, 1)) {
            return true;
        } else if (recursive(positionX + 1, positionY + 2, 2)) {
            return true;
        } else if (recursive(positionX + 2, positionY - 1, 3)) {
            return true;
        } else if (recursive(positionX + 1, positionY - 2, 4)) {
            return true;
        } else if (recursive(positionX - 2, positionY + 1, 5)) {
            return true;
        } else if (recursive(positionX - 1, positionY + 2, 6)) {
            return true;
        } else if (recursive(positionX - 2, positionY - 1, 7)) {
            return true;
        } else if (recursive(positionX - 1, positionY - 2, 8)) {
            return true;
        } else return false;
    }
}