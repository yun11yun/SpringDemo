package com.yun11yun.test;

public class Command {

    private Object state;

    public Object getState() {
        return state;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public Object execute() {
        return null;
    }
}
