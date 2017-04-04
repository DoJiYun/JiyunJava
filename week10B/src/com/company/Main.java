package com.company;

import java.util.*;
public class Main {
    static Scanner keyboard=new Scanner(System.in);
    public static void main(String[] args) {
        boolean check=true;
        Account[] x = new Account[10];
        for (int i = 0; i < 10; i++) {
            x[i] = new Account(i, 100);
        }
        System.out.print("Enter an id: ");
        int k = keyboard.nextInt();
        //System.out.println();
        while (check) {
            //System.out.println();
            if (k >= 0 && k <= 9) {
                System.out.println();
                System.out.print("Main menu\n1: check balance\n2: withdraw\n3: deposit\n4: exit\nEnter a choice: ");
                int y = keyboard.nextInt();
                if (y == 1) {
                    System.out.print("The balance is ");
                    System.out.println(x[k].getBalance());
                    //System.out.println();
                }
                else if (y==2) {
                    System.out.print("Enter an amount to withdraw: ");
                    int w=keyboard.nextInt();
                    if (w>x[k].getBalance()) {
                        System.out.println("The amount is too large, ignored");
                        //System.out.println();
                    }
                    else {
                        //System.out.println();
                        x[k].withdraw(w);
                    }
                }
                else if (y==3) {
                    System.out.print("Enter an amount to deposit: ");
                    int d=keyboard.nextInt();
                    if (d<0) {
                        System.out.println("The amount is negative, ignored");
                        //System.out.println();
                    }
                    else {
                        //System.out.println();
                        x[k].deposit(d);
                    }
                }
                else if (y==4) {
                    System.out.println();
                    System.out.print("Enter an id: ");
                    int i=keyboard.nextInt();
                    k=i;
                }
                else {
                    System.out.println("Wrong choice, try again: ");
                    //System.out.println();
                    continue;
                }
            }
            else if (k==-20150901) {
                check=false;
                System.out.print("Exit code entered");
            }
            else {
                System.out.println("Please enter a correct id");
                System.out.print("Enter an id: ");
                k=keyboard.nextInt();
                if (k>=0 && k<=9) {
                    //System.out.println();
                }
            }
        }
    }
}

class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private static Date dateCreated;
    Account(int id1, double balance1) {
        id=id1;
        balance=balance1;
    }
    Account(){}
    public void setAnnualInterestRate(double x) {
        annualInterestRate=x;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public double getMonthlyInterestRate() {
        return annualInterestRate/1200;
    }
    public double getMonthlyInterest() {
        return getMonthlyInterestRate()*balance;
    }
    public void withdraw(double x) {
        if(x>balance) {
        }
        else {
            balance -= x;
        }
    }
    public void deposit(double x) {
        balance+=x;
    }
    public int getId() {
        return id;
    }
    public double getBalance() {
        return balance;
    }
}