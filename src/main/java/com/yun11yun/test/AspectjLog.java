package com.yun11yun.test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Aspect
@Component
public class AspectjLog {

    @Pointcut("execution(* com.yun11yun.service.MyService.*(..))")
    public void logAop() {

    }

    @Pointcut("execution(* com.yun11yun.service.MyService.print*())")
    public void printAOP() {

    }

    @Before("printAOP()")
    public void printBefore(JoinPoint joinPoint) {
        System.out.println("before");
    }

    @AfterReturning("printAOP()")
    public void printAfterReturning() {
        System.out.println("AfterReturning");
    }

    @After("printAOP()")
    public void printAfter() {
        System.out.println("After");
    }

    @Before("logAop() && args(email)")
    public void logBefore(JoinPoint joinPoint, String email) {
        System.out.println("before");
    }

    @AfterReturning("logAop() && args(email)")
    public void logAfterReturning(String email) {
        System.out.println("AfterReturning");
    }

    @After("logAop() && args(email)")
    public void logAfter(String email) {
        System.out.println("After");
    }
}
