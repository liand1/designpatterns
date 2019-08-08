package com.lee.designpattern.factorymethd;

public class ConcreteCreator implements Creator {

    @Override
    public Product create() {
        return new ConcreteProduct();
    }
}
