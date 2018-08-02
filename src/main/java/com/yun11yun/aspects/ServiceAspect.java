package com.yun11yun.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ServiceAspect {

    @Pointcut("execution(* com.yun11yun.service.*Service.print())")
    public void print() {
        
    }
}
