package com.lee.designpattern.command.kitchen;

public class Chef implements Cook {

    @Override
    public void makeTomatoEggSoup() {
        System.out.println("尝尝大厨做的西红柿蛋汤");
    }

    @Override
    public void makeNaanBread() {
        System.out.println("尝尝大厨做的印度飞饼");
    }
}
