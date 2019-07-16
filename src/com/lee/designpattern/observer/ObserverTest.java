package com.lee.designpattern.observer;

import com.lee.designpattern.observer.publisher.Receptionist;
import com.lee.designpattern.observer.subscriber.Developer;
import com.lee.designpattern.observer.subscriber.Employee;
import com.lee.designpattern.observer.subscriber.ProductManager;
import com.lee.designpattern.observer.subscriber.TeamLeader;

public class ObserverTest {

    public static void main(String[] args) {
        Receptionist receptionist = new Receptionist();

        receptionist.addEmployee(new Developer());
        receptionist.addEmployee(new ProductManager());
        Employee teamLeader = new TeamLeader();
        receptionist.addEmployee(teamLeader);
        receptionist.cancelEmployee(teamLeader);

        receptionist.update();
    }
}
