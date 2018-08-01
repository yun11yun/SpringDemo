package com.yun11yun.action;

import com.opensymphony.xwork2.ActionProxy;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.dispatcher.mapper.ActionMapping;
import org.junit.Test;

public class LoginActionTest extends AppActionTestCase {

    @Test
    public void testGetActionMapping() {
        ActionMapping mapping = getActionMapping("/login.action");
        assertNotNull(mapping);
        assertEquals("/", mapping.getNamespace());
        assertEquals("login", mapping.getName());
    }

    @Test
    public void testlogin() throws Exception {
        request.setParameter("name", "wentao");

        ActionProxy actionProxy = getActionProxy("/user/login.action");
        LoginAction action = (LoginAction)actionProxy.getAction();

        assertNotNull("The action is null but should not be!", action);

        String result = action.login();
        assertEquals("The execute method did not return " + ActionSupport.SUCCESS + " but should have.",
                ActionSupport.SUCCESS,
                result);
    }
}