package com.lee.designpattern.state;

import com.lee.designpattern.state.liftstate.*;

public class Context {

    public final static LiftState OPENING_STATE = new OpenningState();
    public final static LiftState CLOSING_STATE = new ClosingState();
    public final static LiftState MOVING_STATE = new MovingState();
    public final static LiftState STOPPING_STATE = new StoppingState();

    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }

    public void open(){
        this.liftState.open();
    }
    public void close(){
        this.liftState.close();
    }
    public void move(){
        this.liftState.move();
    }
    public void stop(){
        this.liftState.stop();
    }
}
