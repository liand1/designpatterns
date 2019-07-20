package com.lee.designpattern.decotator.additive;

public class Sugar implements Additive {

    private final double price = 1.0;

    private Additive tee;

    public Sugar(Additive tee) {
        this.tee = tee;
    }

    @Override
    public void getName() {
        System.out.println("add sugar");
    }

    @Override
    public double getPrice() {
        return tee.getPrice() + price;
    }
}
