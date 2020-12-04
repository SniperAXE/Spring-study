package edu.nf.ch12.dao.impl;

import edu.nf.ch12.dao.UserDao;

/**
 * @author Administrator
 * @date 2020/12/4
 */

public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("insert into user_info");
    }

    public void init(){
        System.out.println("执行UserDao的init方法");
    }

    public void destroy(){
        System.out.println("执行UserDao的destroy方法");
    }


}