package edu.nf.ch13.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Administrator
 * @date 2020/12/7
 */
public class LogInterceptor implements MethodInterceptor {
    /**
     *
     * @param o 运行时的代理对象
     * @param method 当前目标对象正在调用的方法
     * @param objects 目标对象方法需要的步数
     * @param methodProxy 目标对象的代理对象，（也就是生成子类中的方法）
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //调用目标对象的方法（也就是父类的方法）
        Object returnVal = methodProxy.invokeSuper(o,objects);
        //执行日志记录操作
        log();
        return returnVal;
    }

    public void log(){
        System.out.println("记录日志操作....");
    }
}