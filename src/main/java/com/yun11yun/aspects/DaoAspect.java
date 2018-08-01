package com.yun11yun.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DaoAspect {

    @Pointcut("execution(* com.yun11yun.dao.*Dao.save*(..))")
    public void saveAOP() {

    }

    @Before("saveAOP()")
    public void saveBefore(JoinPoint joinPoint) {
        System.out.println("save before");
    }

    @After("saveAOP()")
    public void saveAfter() {
        System.out.println("save after");
    }
}
