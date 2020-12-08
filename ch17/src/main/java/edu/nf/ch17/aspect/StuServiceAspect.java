package edu.nf.ch17.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @date 2020/12/8
 * @Aspect注解标注当前切面
 * @Component表示为受ioc容器管理
 */
@Aspect
@Component
public class StuServiceAspect {

    /**
     * 定义切入点，只能给定义一个方法，不需要任何逻辑
     * 此方法仅仅用于给@Pointcut注解标注，用于声明切入点表达式
     */
    @Pointcut("execution(* edu.nf.ch17.service.impl.*.*(..))")
    public void pointcut(){
    }

    /**
     * 前置通知
     * @param jp
     */
    @Before("pointcut()")
    public void before(JoinPoint jp){
        System.out.println("前置通知，参数："+jp.getArgs());
    }

    /**
     * 环绕通知
     * @param pjp
     * @throws Throwable
     */
    @Around("pointcut())")
    public Object around(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("环绕通知前");
        //调用目标方法
        Object returnVal = pjp.proceed();
        System.out.println("环绕通知后");
        return  returnVal;
    }

    /**
     * 后置通知
     * @param jp
     * @param returnVal
     */
    @AfterReturning(value = "pointcut()",returning = "returnVal")
    public void afterReturning(JoinPoint jp,String returnVal){
        System.out.println("后置通知，返回值："+returnVal);
    }

    /**
     * 异常通知
     * @param e
     */
    @AfterThrowing(value = "pointcut()",throwing = "e")
    public void afterThrowing(Exception e){
        System.out.println("异常通知："+e.getMessage());
    }

    /**
     * 最终通知
     * @param jp
     */
    @After("pointcut()")
    public void after(JoinPoint jp){
        System.out.println("最终通知");
    }
}
