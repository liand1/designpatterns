package com.lee.designpattern.decotator.additive;

import com.lee.designpattern.decotator.additive.drink.RedTee;

public class DecoratorTest {

    public static void main(String[] args) {
        Additive tee = new RedTee();
        Additive milk = addMilk(addMilk(tee));// add milk twice
        Additive sugar = addSugar(milk);
        Additive ice = addIce(sugar);
        System.out.println(ice.getPrice());
    }

    public static Additive addMilk(Additive tee) {
        return new Milk(tee);
    }

    public static Additive addSugar(Additive tee) {
        return new Sugar(tee);
    }

    public static Additive addIce(Additive tee) {
        return new Ice(tee);
    }
}
