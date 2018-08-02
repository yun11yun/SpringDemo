package com.yun11yun.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Result;
import org.apache.struts2.result.ServletDispatcherResult;

public class FragmentAction extends ActionSupport {

    private String nextAction;

    @Override
    public String execute() throws Exception {
        nextAction = "some";
        return "next";
    }

    public Result runResult() {
        ServletDispatcherResult result = new ServletDispatcherResult();
        result.setLocation("404.jsp");
        return result;
    }

    public String getNextAction() {
        return nextAction;
    }
}
