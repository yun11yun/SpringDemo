package com.yun11yun.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

/*
    action通配符的练习
 */
public class UserAction extends ActionSupport {

    public String delete() {
        System.out.println("delete a user");

        return SUCCESS;
    }

    public String save() {

        System.out.println("save a user");
        return SUCCESS;
    }



}
