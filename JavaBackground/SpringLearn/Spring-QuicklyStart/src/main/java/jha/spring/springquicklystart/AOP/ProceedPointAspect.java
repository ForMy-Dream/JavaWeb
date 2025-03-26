package jha.spring.springquicklystart.AOP;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//@Aspect
@Component
@Slf4j
public class ProceedPointAspect {

    @Pointcut("execution(* jha.spring.springquicklystart.controller.*.*(..))")
    public void dt(){}
    @Around("dt()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println("连接点(目标对象)类名："+joinPoint.getTarget().getClass().getName());
        System.out.println("连接点(目标对象)方法名："+joinPoint.getSignature().getName());
        System.out.println("连接点(目标对象)方法参数："+ Arrays.toString(joinPoint.getArgs()));
        Object proceed = joinPoint.proceed();
        System.out.println("连接点(目标对象)方法返回："+proceed.toString());
        return proceed;
    }

    @Before("dt()")
    public void before(JoinPoint joinPoint) {
        System.out.println("连接点(目标对象)类名Before："+joinPoint.getTarget().getClass().getName());
        System.out.println("连接点(目标对象)方法名Before："+joinPoint.getSignature().getName());
        System.out.println("连接点(目标对象)方法参数Before："+ Arrays.toString(joinPoint.getArgs()));
    }

}
