package com.lee.designpattern.proxy;

public class StockBroker implements  StockTrader{

    // 手续费
    private static final double PERCENTAGE_OF_SERVICE_FEE = 0.0005;

    private Investor investor;

    public StockBroker(Investor investor) {
        this.investor = investor;
    }

    @Override
    public void buy(int stockCode, double price,int num) {
        investor.buy(stockCode, price, num);
        cutServiceFee(price * num);
        transferAccounts();
    }

    @Override
    public void sell(int stockCode, double price,int num) {
        investor.sell(stockCode, price, num);
        cutServiceFee(price * num);
        transferAccounts();
    }

    private double cutServiceFee(double tradeFee) {
        return tradeFee * PERCENTAGE_OF_SERVICE_FEE;
    }

    /**
     * 转账
     */
    private void transferAccounts() {

    }
}
