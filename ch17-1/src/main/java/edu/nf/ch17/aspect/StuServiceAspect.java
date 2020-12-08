package edu.nf.ch17.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.weaver.JoinPointSignature;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @date 2020/12/8
 */
@Aspect
@Component
public class StuServiceAspect {

    @Pointcut("execution(* edu.nf.ch17.service.impl.*.*(..))")
    public void Pointcut(){

    }

    @Before("Pointcut()")
    public void Before(JoinPoint jp){
        System.out.println("前置通知"+jp.getArgs());
    }

    @Around("Pointcut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("环绕通知前");
        Object object = pjp.proceed();
        System.out.println("环绕通知后");
        return object;
    }

    @AfterReturning(value = "Pointcut()",returning = "returnVal")
    public void AfterReturning(JoinPoint jp,String returnVal){
        System.out.println("后置通知,返回值:"+returnVal);
    }

    @AfterThrowing(value = "Pointcut()",throwing = "e")
    public void AfterThrowing(Exception e){
        System.out.println("异常通知");
    }

    @After("Pointcut()")
    public void After(JoinPoint jp){
        System.out.println("最终通知");
    }
}