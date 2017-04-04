package com.company;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Stock stock = new Stock(sc.nextLine(), sc.nextLine());
        stock.setPreviousClosingPrice(sc.nextDouble());
        stock.setCurrentPrice(sc.nextDouble());

        System.out.printf("Prev Price: %.2f\n", stock.getPreviousClosingPrice());
        System.out.printf("Curr Price: %.2f\n", stock.getCurrentPrice());
        System.out.printf("Price Change: %.2f%%\n", stock.getChangePercent() * 100);
    }
}

class Stock {
    String id;
    String name;
    double previousClosingPrice;
    double currentPrice;
    public Stock() {}
    public Stock(String x, String y) {
        this.id=x;
        this.name=y;
    }

    public void setPreviousClosingPrice(double x) {
        this.previousClosingPrice=x;
    }

    public void setCurrentPrice(double x) {
        this.currentPrice=x;
    }

    public double getPreviousClosingPrice() {
        return this.previousClosingPrice;
    }
    public double getCurrentPrice() {
        return this.currentPrice;
    }
    public double getChangePercent() {
        return (Math.abs(currentPrice-previousClosingPrice)/(previousClosingPrice));
    }
}