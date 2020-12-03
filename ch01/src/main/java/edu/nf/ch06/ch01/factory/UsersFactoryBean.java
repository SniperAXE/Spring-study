package edu.nf.ch06.ch01.factory;

import edu.nf.ch06.ch01.Users;

/**
 * @author Administrator
 * @date 2020/11/30
 * 自定义一个工厂给Spring，spring就会使用这个工厂
 * 来创建bean对象，这个自定义工厂本身也会纳入Spring
 * 容器中管理，因此命名时通常都是XxxFactoryBean
 */
public class UsersFactoryBean {
    public Users build(){
        return new Users();
    }
}