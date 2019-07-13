package com.lee.designpattern.state.liftstate;

import com.lee.designpattern.state.Context;

public class MovingState extends LiftState {

    @Override
    public void move() {
        System.out.println("lift moving...");
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.STOPPING_STATE);
        super.context.getLiftState().stop();
    }
}
