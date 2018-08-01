package com.yun11yun.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import java.util.Map;

public class LoginAction extends ActionSupport implements SessionAware {

    private String name;
    private Map<String, Object> userSession;

    public String login() {
        System.out.println(userSession);
        if ("wentao".equals(this.name)) {
            return ERROR;
        }
        return SUCCESS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setSession(Map <String, Object> session) {
        this.userSession = session;
    }
}
