package edu.nf.ch06.ch01.factory;

import edu.nf.ch06.ch01.Users;

/**
 * @author Administrator
 * @date 2020/11/30
 * 使用工厂的静态方法来创建Bean实例
 */
public class UsersFactory {

    public static Users create(){
        return new Users();
    }
}