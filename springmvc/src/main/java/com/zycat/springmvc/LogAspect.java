package com.zycat.springmvc;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {

    @Around("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
    public Object arroud(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("start=========="+proceedingJoinPoint.getSignature().getName());

        Object result = proceedingJoinPoint.proceed();
        System.out.println("end==========");
        return result;
    }
}
