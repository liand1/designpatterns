package com.lee.designpattern.bridge.software;

public class Read implements Software {
    @Override
    public void operate() {
        System.out.println("init read");
    }
}
