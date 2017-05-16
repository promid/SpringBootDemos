package com.dbq.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by DBQ on 12/05/2017.
 */

@Aspect
@Component
public class DemoAspect {

    @Pointcut("@annotation(com.dbq.aop.AopAction)")
    public void annotationPointCut(){}

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        AopAction aopAction = method.getAnnotation(AopAction.class);
        System.out.println("aop: " + aopAction.name());
    }
}
