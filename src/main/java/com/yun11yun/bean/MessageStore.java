package com.yun11yun.bean;

public class MessageStore {
    private String message;

    public MessageStore() {
        message = "Hello struts2 user";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
