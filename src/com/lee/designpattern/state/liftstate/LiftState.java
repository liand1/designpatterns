package com.lee.designpattern.state.liftstate;

import com.lee.designpattern.state.Context;

public abstract class LiftState {

    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public void open() {
        System.out.println("do nothing..");
    }

    public void close() {
        System.out.println("do nothing..");
    }

    public void move() {
        System.out.println("do nothing..");
    }

    public void stop() {
        System.out.println("do nothing..");
    }
}
