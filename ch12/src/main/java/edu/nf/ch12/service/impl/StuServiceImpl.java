package edu.nf.ch12.service.impl;

import edu.nf.ch12.dao.UserDao;
import edu.nf.ch12.service.UserService;

/**
 * @author Administrator
 * @date 2020/12/4
 */
public class StuServiceImpl implements UserService {
    private UserDao UserDao;

    public void setUserDao(UserDao userDao) {
        this.UserDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("执行StuServiceImpl");
    }
}