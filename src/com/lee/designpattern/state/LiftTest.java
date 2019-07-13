package com.lee.designpattern.state;

public class LiftTest {

    public static void main(String[] args) {

        Context context = new Context();
        context.setLiftState(Context.CLOSING_STATE);
        context.open();
        context.close();
        context.move();
        context.open();// do nothing
        context.open();// do nothing
        context.open();// do nothing
        context.stop();
    }


}
