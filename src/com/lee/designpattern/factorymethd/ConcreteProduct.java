package com.lee.designpattern.factorymethd;

public class ConcreteProduct extends Product {

    @Override
    public void getPrice() {
        System.out.println("$3.00");
    }
}
