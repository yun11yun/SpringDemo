package com.yun11yun.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.*;

@Results({
        @Result(name = "input,error", location = "/error.jsp"),
        @Result(name = "success", location = "/success.jsp")
})
public class HelloAction extends ActionSupport {

    @Actions({
            @Action("/hello/foo"),
            @Action("/hello/foz")
    })
    public String foo() {
        return SUCCESS;
    }

    @Action(value = "bar",
            results = {@Result(location = "/success.jsp")}
            )
    public String bar() {
        return SUCCESS;
    }
}
