package com.lee.designpattern.observer.subscriber;

public class TeamLeader implements Employee, Action {

    @Override
    public void action() {
        System.out.println("writing document");
    }

    @Override
    public void update() {
        action();
    }

}
