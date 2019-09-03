package com.lee.designpattern.proxy;

public class Investor implements StockTrader {

    @Override
    public void buy(int stockCode, double price, int num) {
        System.out.println(String.format("买入股票%s手,股票代码: %s", num, stockCode));
    }

    @Override
    public void sell(int stockCode, double price, int num) {
        System.out.println(String.format("卖出股票%s手,股票代码: %s", num, stockCode));
    }
}
