package com.lee.designpattern.state.liftstate;

import com.lee.designpattern.state.Context;

public class StoppingState extends LiftState {
    @Override
    public void open() {
        super.context.setLiftState(Context.OPENING_STATE);
        super.context.getLiftState().open();
    }

    @Override
    public void move() {
        super.context.setLiftState(Context.MOVING_STATE);
        super.context.getLiftState().move();
    }

    @Override
    public void stop() {
        System.out.println("lift stopping...");
    }
}
