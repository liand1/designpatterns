package com.lee.designpattern.command;

import com.lee.designpattern.command.food.Food;
import com.lee.designpattern.command.food.NaanBread;
import com.lee.designpattern.command.food.TomatoEggSoup;
import com.lee.designpattern.command.kitchen.Chef;
import com.lee.designpattern.command.kitchen.RookieChef;

import java.util.ArrayList;
import java.util.List;

public class Waiter {

    private List<Food> foods = new ArrayList<>();

    public synchronized void add(Food food) {
        foods.add(food);
        System.out.println(String.format("您好，您确认点这个%s吗，我帮您记录下来.", food));
    }

    public synchronized void cancel(Food food) {
        foods.remove(food);
        System.out.println(String.format("您好，您确认取消这个%s吗，我帮您记录下来.", food));
    }

    public void execute() {
        foods.forEach(Food::make);
    }

    /**
     * 我需要大厨帮我做一份印度飞饼
     * 然后我听说最近有个新来的厨师，做的西红柿蛋汤味道不错，也给我来一份
     * 算了，最近西红柿过敏，我还是不要了
     * 今天我就吃印度飞饼吧
     */
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        Food naanBread = new NaanBread(new Chef());
        Food tomatoEggSoup = new TomatoEggSoup(new RookieChef());
        waiter.add(naanBread);
        waiter.add(tomatoEggSoup);
        waiter.cancel(tomatoEggSoup);

        waiter.execute();

    }
}
