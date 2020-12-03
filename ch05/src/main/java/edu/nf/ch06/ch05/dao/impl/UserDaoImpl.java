package edu.nf.ch06.ch05.dao.impl;

import edu.nf.ch06.ch05.dao.UserDao;
import edu.nf.ch06.ch05.entity.Users;

/**
 * @author Administrator
 * @date 2020/12/1
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void save(Users user) {
        System.out.println("insert into user_info values(?,?)");
    }
}