package jha.spring.springquicklystart.AOP;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Slf4j
@Component
//@Aspect
public class MyAspect1 {

    //@Pointcut("execution(* jha.spring.springquicklystart.controller.*.insertEmps(..)) ||"+"execution(* jha.spring.springquicklystart.controller.*.deleteEmps(..))")
    @Pointcut("@annotation(jha.spring.springquicklystart.anno.MyLog)")
    public void pt(){}

    @Before("pt()")
    public void before() {
        log.info("前置通知");
    }
    @Around("pt()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("环绕前通知");
        joinPoint.proceed();
        log.info("环绕后通知");
    }
    @After("pt()")
    public void after() {
        log.info("返回后通知，无论是否异常");
    }
    @AfterReturning("pt()")
    public void afterReturning() {
        log.info("返回后通知，无异常");
    }
    @AfterThrowing("pt()")
    public void afterThrowing() {
        log.info("返回后通知，有异常");
    }
}
