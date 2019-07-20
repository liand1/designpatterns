package com.lee.designpattern.decotator.additive;

public class Milk implements Additive {

    private final double price = 2.0;

    private Additive tee;

    public Milk(Additive tee) {
        this.tee = tee;
    }

    @Override
    public void getName() {
        System.out.println("add milk");
    }

    @Override
    public double getPrice() {
        return tee.getPrice() + price;
    }
}
