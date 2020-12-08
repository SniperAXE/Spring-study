package edu.nf.ch13.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Administrator
 * @date 2020/12/7
 * 回调处理器,负责调用目标对象的方法，
 * 因此可以在调用后执行一些额外的逻辑
 */
public class LogInvocationHandler implements InvocationHandler {

    private Object target;

    /**
     *
     * @param target
     */
    public LogInvocationHandler(Object target) {
        this.target = target;
    }


    /**
     *
     * @param proxy 运行时创建的代理对象
     * @param method 当前目标对象正在调用的方法
     * @param args 目标方法需要的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //调用当前目标对象的方法，需要传入一个目标对象的实例
        Object returnValue = method.invoke(target,args);
        //在目标方法执行完后调用日志方法记录操作
        log();
        return returnValue;
    }

    /**
     * 记录日志的逻辑
     */
    private void log(){
        System.out.println("执行记录操作....");
    }
}