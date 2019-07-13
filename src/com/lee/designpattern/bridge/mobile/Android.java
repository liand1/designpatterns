package com.lee.designpattern.bridge.mobile;

public class Android extends Mobile {
    @Override
    public void run() {
        System.out.println("Android init..");
        getSoftware().operate();
    }
}
