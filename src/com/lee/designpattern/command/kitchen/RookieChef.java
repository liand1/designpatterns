package com.lee.designpattern.command.kitchen;

public class RookieChef implements Cook {

    @Override
    public void makeTomatoEggSoup() {
        System.out.println("尝尝新来的厨师做的西红柿蛋汤");
    }

    @Override
    public void makeNaanBread() {
        System.out.println("尝尝新来的厨师做的印度飞饼");
    }
}
