package com.lee.designpattern.command.food;

import com.lee.designpattern.command.kitchen.Cook;

public class NaanBread extends Food {

    public NaanBread(Cook cook) {
        super(cook);
    }

    @Override
    public void make() {
        this.cook.makeNaanBread();
    }

    @Override
    public String toString() {
        return "NaanBread";
    }
}
