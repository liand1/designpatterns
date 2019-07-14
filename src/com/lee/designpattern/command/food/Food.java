package com.lee.designpattern.command.food;

import com.lee.designpattern.command.kitchen.Cook;

public abstract class Food {

    protected Cook cook;

    public Food(Cook cook) {
        this.cook = cook;
    }

    public abstract void make();
}
