package jha.spring.springquicklystart.AOP;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
@Slf4j
@Component
//@Aspect//AOP类
public class TimeAspect {
    //@Around("execution(* jha.spring.springquicklystart.controller.*.*(..))")//切入点表达式
    @Around("jha.spring.springquicklystart.AOP.MyAspect1.pt()")//切入点表达式
    public Object recordTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long endTime = System.currentTimeMillis();
        log.info(joinPoint.getSignature()+"方法耗时："+(endTime - startTime)+"ms");
        return result;
    }
}
