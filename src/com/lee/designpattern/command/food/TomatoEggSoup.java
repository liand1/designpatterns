package com.lee.designpattern.command.food;

import com.lee.designpattern.command.kitchen.Cook;

public class TomatoEggSoup extends Food {

    public TomatoEggSoup(Cook cook) {
        super(cook);
    }

    @Override
    public void make() {
        this.cook.makeTomatoEggSoup();
    }

    @Override
    public String toString() {
        return "TomatoEggSoup";
    }
}
