package com.lee.designpattern.decotator.additive;

public class Ice implements Additive {

    private Additive tee;

    public Ice(Additive tee) {
        this.tee = tee;
    }

    @Override
    public void getName() {
        System.out.println("add milk");
    }

    @Override
    public double getPrice() {
        System.out.println(" free for ice");
        return tee.getPrice();
    }
}
