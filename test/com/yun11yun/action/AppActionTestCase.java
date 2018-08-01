package com.yun11yun.action;

import org.apache.struts2.StrutsSpringTestCase;

public class AppActionTestCase extends StrutsSpringTestCase {
    @Override
    protected String[] getContextLocations() {
        String[] contexts = {"classpath:applicationContext.xml"};
        return contexts;
    }
}
