package com.lee.designpattern.factorymethd;

public class FactoryMethodTest {

    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.create();
        product.getPrice();
    }
}
