package com.lee.designpattern.bridge.mobile;

public class IOS extends Mobile {
    @Override
    public void run() {
        System.out.println("IOS init..");
        getSoftware().operate();
    }
}
