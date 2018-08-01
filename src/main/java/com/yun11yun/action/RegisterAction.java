package com.yun11yun.action;

import com.opensymphony.xwork2.ActionSupport;
import com.yun11yun.bean.Person;

public class RegisterAction extends ActionSupport {

    private Person personBean;

    @Override
    public String execute() throws Exception {

        return SUCCESS;
    }

    // register validate
    // statement: 1. User must provide a first name
    //            2. User must provide an email address
    //            3. User younger than 18 cannot register
    @Override
    public void validate() {
        if (this.personBean.getFirstName().length() == 0) {
            addFieldError("personBean.firstName", "First name is required.");
        }
        if (this.personBean.getEmail().length() == 0) {
            addFieldError("personBean.email", "Email is required");
        }
        if (this.personBean.getAge() < 18) {
            addFieldError("personBean.age", "Age is required and must be 18 or older");
        }
    }

    public Person getPersonBean() {
        return personBean;
    }

    public void setPersonBean(Person personBean) {
        this.personBean = personBean;
    }
}
