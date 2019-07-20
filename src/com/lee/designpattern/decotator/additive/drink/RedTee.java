package com.lee.designpattern.decotator.additive.drink;

import com.lee.designpattern.decotator.additive.Additive;

public class RedTee implements Additive {
    @Override
    public void getName() {
        System.out.println("red tee");
    }

    @Override
    public double getPrice() {
        return 5.0;
    }
}
