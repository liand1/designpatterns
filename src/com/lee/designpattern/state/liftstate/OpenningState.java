package com.lee.designpattern.state.liftstate;

import com.lee.designpattern.state.Context;

public class OpenningState extends LiftState {
    @Override
    public void open() {
        System.out.println("lift opening");
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.CLOSING_STATE);
        super.context.getLiftState().close();
    }
}
