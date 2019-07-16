package com.lee.designpattern.observer.subscriber;

public class Developer implements Employee, Action {

    @Override
    public void action() {
        System.out.println("coding");
    }

    @Override
    public void update() {
        action();
    }
}

