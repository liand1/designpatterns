package com.lee.designpattern.bridge.mobile;

import com.lee.designpattern.bridge.software.Software;

public abstract class Mobile {

    private Software software;

    public Software getSoftware() {
        return software;
    }

    public void setSoftware(Software software) {
        this.software = software;
    }

    public abstract void run();
}
