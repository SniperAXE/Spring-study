package edu.nf.ch14.service.impl;

import edu.nf.ch14.service.UserService;

/**
 * @author Administrator
 * @date 2020/12/7
 */
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("添加用户");
        //System.out.println(10/0);
    }

    @Override
    public void update() {
        System.out.println("修改用户");
    }
}