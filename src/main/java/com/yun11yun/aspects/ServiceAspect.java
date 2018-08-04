package com.yun11yun.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
@Aspect
public class ServiceAspect {

    @Pointcut("within(com.yun11yun.service..*)")
    public void service() {
        System.out.println("service method is running");
    }

    @Before("service()")
    public void before() {
        System.out.println("before all service layer method");
    }

    @Pointcut("execution(* com.yun11yun.service.HelloWorldService.save(..))")
    public void save() {

    }

    // 直接在Before中使用execution匹配方法切点
    @Before("save()")
    public void beforeSave() {
        System.out.println("before save method");
    }

    @AfterReturning(
            pointcut = "save()",
            returning = "isSave"
    )
    public void afterReturningSave(boolean isSave) {
        if (isSave) {
            System.out.print("save something");
        } else {
            System.out.print("not save");
        }
        System.out.println(",afterreturning is running");
    }

    @After("save()")
    public void afterSave() {
        System.out.println("after is running");
    }


    @Around("execution(* com.yun11yun.service.UserService.query*(..)) && args(name)")
    public Object query(ProceedingJoinPoint pjp, String name) throws Throwable {
        System.out.println("the name param is " + name);
        Object[] param = {name};
        Object retObj = pjp.proceed(param);
        System.out.println(retObj);
        return retObj;
    }

    @Before(
            value = "execution(* com.yun11yun.dao..*(..)) && args(param)",
            argNames = "param"
    )
    public void matchParamStringMethod(String param) {
        System.out.println("Aspect's matchParamStringMethod is run, the method's param is: " + param);
    }

}
