package edu.nf.ch11.dao.impl;

import edu.nf.ch11.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author Administrator
 * @date 2020/12/4
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("insert into user_info");
    }
}