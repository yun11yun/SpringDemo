package com.yun11yun.action;

import com.opensymphony.xwork2.ActionSupport;
import com.yun11yun.bean.MessageStore;
import com.yun11yun.service.HelloWorldServiceImpl;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

@Namespace("/")
public class HelloWorldAction extends ActionSupport {
    private MessageStore messageStore;
    private String userName;

    private HelloWorldServiceImpl helloWorldService;

    private static int helloCount = 0;

    @Override
    @Action(value = "hello", results = {@Result(location = "/helloworld.jsp")})
    public String execute() throws Exception {
        messageStore = new MessageStore();

        if (userName != null) {
            messageStore.setMessage(messageStore.getMessage() + " " + userName);
        }
        helloCount ++;

        helloWorldService.print();

        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getHelloCount() {
        return helloCount;
    }

    public HelloWorldServiceImpl getHelloWorldService() {
        return helloWorldService;
    }

    public void setHelloWorldService(HelloWorldServiceImpl helloWorldService) {
        this.helloWorldService = helloWorldService;
    }
}
