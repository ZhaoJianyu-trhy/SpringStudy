package com.zjy.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationPointCut {

    @Before("execution(* com.zjy.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("====方法执行前====");
    }

    @After("execution(* com.zjy.service..*(..))")
    public void after() {
        System.out.println("====方式执行后====");
    }

    @Around("execution(* com.zjy.service..*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("====环绕前====");
        //获得类名，执行的方法名信息
        Signature signature = joinPoint.getSignature();
        System.out.println("signature = " + signature);
        //相当于标记一下，执行方法，不然怎么区分环绕前环绕后呢
        Object proceed = joinPoint.proceed();

        System.out.println("====环绕后====");
        System.out.println(proceed);
    }
}
