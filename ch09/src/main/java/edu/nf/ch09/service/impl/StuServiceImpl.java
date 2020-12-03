package edu.nf.ch09.service.impl;

import edu.nf.ch09.dao.UserDao;
import edu.nf.ch09.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Administrator
 * @date 2020/12/3
 */
@Service("stuService")
//@Primary注解标识在类上，表示优先注入Bean
@Primary
public class StuServiceImpl implements UserService {

    //字段注入
    @Autowired
    private UserDao userDao;

    @Override
    public void add() {
        System.out.println("执行StuServiceImpl");
        userDao.save();
    }

    //@PostConstruct注解标识自定义初始化方法
    @PostConstruct
    public void init(){
        System.out.println("执行自定义的init方法");
    }

    //@PerDestroy注解标识自定义的销毁方法
    @PreDestroy
    public void destroy(){
        System.out.println("执行自定义的destroy方法");
    }
}