package com.company;

import java.util.*;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Account account = new Account(sc.nextInt(), sc.nextInt());
        Account.setAnnualInterestRate(sc.nextDouble());

        System.out.printf("Balance : %.2f\n", account.getBalance());
        System.out.printf("Monthly interest : %.2f\n", account.getMonthlyInterest());

        account.withdraw(sc.nextDouble());

        System.out.printf("Balance : %.2f\n", account.getBalance());
        System.out.printf("Monthly interest : %.2f\n", account.getMonthlyInterest());

        account.deposit(sc.nextDouble());

        System.out.printf("Balance : %.2f\n", account.getBalance());
        System.out.printf("Monthly interest : %.2f\n", account.getMonthlyInterest());
    }
}

class Account {
    private static int id;
    private static double balance;
    private static double annualInterestRate;
    private static Date dateCreated;
    Account(int id1, double balance1) {
        id=id1;
        balance=balance1;
    }
    Account(){}
    public static void setAnnualInterestRate(double x) {
        annualInterestRate=x;
    }
    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public static double getMonthlyInterestRate() {
        return annualInterestRate/1200;
    }
    public static double getMonthlyInterest() {
        return getMonthlyInterestRate()*balance;
    }
    public static void withdraw(double x) {
        if(x>balance) {
        }
        else {
            balance -= x;
        }
    }
    public static void deposit(double x) {
        balance+=x;
    }
    public static int getId() {
        return id;
    }
    public static double getBalance() {
        return balance;
    }
}