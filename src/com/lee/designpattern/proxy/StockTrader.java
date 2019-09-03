package com.lee.designpattern.proxy;

public interface StockTrader {

    /**
     * @param stockCode 股票代码
     * @param num 买入数量 100为1个单位
     */
    void buy(int stockCode, double price,int num);

    /**
     * @param stockCode 股票代码
     * @param num 卖出数量 100为1个单位
     */
    void sell(int stockCode, double price, int num);
}
