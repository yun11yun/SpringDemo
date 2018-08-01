package com.yun11yun.action;


import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;


/*
    定义在类上的action在类中只有一个action时对应唯一定义的action，
    在类中有2个以上的action时，对应execute方法
 */
@Action("crud")
@Results({
        @Result(name = "success", location = "/success.jsp")
})
public class CrudAction extends ActionSupport {

    @Action("delete")
    public String delete() {

        System.out.println("delete method is run");

        return SUCCESS;
    }

    @Action("create")
    public String create() {
        System.out.println("create method is run");
        return SUCCESS;
    }

    @Override
    public String execute() throws Exception {
        System.out.println("execute method is run");
        return SUCCESS;
    }
}
