package edu.nf.ch11.service.impl;

import edu.nf.ch11.dao.UserDao;
import edu.nf.ch11.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 * @date 2020/12/4
 */
@Service
public class UserServiceImpl implements UserService {
    /**
     * request属性表示是否必须注入，默认值为true表示必须
     * 如果没有注入则引发异常，false表示允许为null
     */
    @Autowired(required = true)
    private UserDao userDao;

    @Override
    public void save() {
        userDao.add();
    }
}