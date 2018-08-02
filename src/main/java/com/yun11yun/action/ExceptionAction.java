package com.yun11yun.action;

import com.opensymphony.xwork2.ActionSupport;

public class ExceptionAction extends ActionSupport {


    public String createException() throws Exception {
        throw new Exception("something is happen");
    }

}
