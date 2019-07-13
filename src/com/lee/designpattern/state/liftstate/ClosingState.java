package com.lee.designpattern.state.liftstate;

import com.lee.designpattern.state.Context;

public class ClosingState extends LiftState {
    @Override
    public void close() {
        System.out.println("lift closing...");
    }

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
        super.context.setLiftState(Context.STOPPING_STATE);
        super.context.getLiftState().stop();
    }

}
