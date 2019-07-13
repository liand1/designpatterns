package com.lee.designpattern.bridge.software;

public class Game implements Software {
    @Override
    public void operate() {
        System.out.println("init game");
    }
}
