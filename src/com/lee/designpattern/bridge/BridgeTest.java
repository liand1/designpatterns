package com.lee.designpattern.bridge;

import com.lee.designpattern.bridge.mobile.Android;
import com.lee.designpattern.bridge.mobile.Mobile;
import com.lee.designpattern.bridge.software.Game;
import com.lee.designpattern.bridge.software.Read;

public class BridgeTest {

    public static void main(String[] args) {
        Mobile mobile = new Android();
        mobile.setSoftware(new Game());
        mobile.run();
        mobile.setSoftware(new Read());
        mobile.run();
    }
}
