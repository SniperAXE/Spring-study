package edu.nf.ch06.ch05.service.impl;

import edu.nf.ch06.ch05.dao.UserDao;
import edu.nf.ch06.ch05.entity.Users;
import edu.nf.ch06.ch05.service.UserService;

/**
 * @author Administrator
 * @date 2020/12/1
 */
public class UserServiceImpl implements UserService {

    private UserDao dao;

    public UserServiceImpl(UserDao dao) {
        this.dao = dao;
    }

    /**
     * 提供一个set方法给Spring容器，这个方法就是注入的入口方法，
     * 要么Spring就会调用这个方法，从容器中将一个UserDao的实现类
     * 给注入进来，赋值给上面的接口
     * @param dao
     */
    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public void add(Users user) {

        dao.save(user);
    }

}