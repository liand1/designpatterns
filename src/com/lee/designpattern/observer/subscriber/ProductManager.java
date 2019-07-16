package com.lee.designpattern.observer.subscriber;

public class ProductManager implements Employee, Action {

    @Override
    public void action() {
        System.out.println("discuss requirements");
    }

    @Override
    public void update() {
        action();
    }
}
