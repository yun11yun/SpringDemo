package com.yun11yun.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringUtils {

    private static ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    public static ApplicationContext getContext() {
        return context;
    }

    public static<T> T getBean(String s, Class cls) {
        return (T) context.getBean(s, cls);
    }

    public static Object getBean(String s) {
        return context.getBean(s);
    }
}
