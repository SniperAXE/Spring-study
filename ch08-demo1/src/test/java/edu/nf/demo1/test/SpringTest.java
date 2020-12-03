package edu.nf.demo1.test;

import edu.nf.demo1.dao.UserDao;
import edu.nf.demo1.entity.Users;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author Administrator
 * @date 2020/12/2
 */
public class SpringTest {
    @Test
    public void testFactoryBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserDao dao = context.getBean("userDao", UserDao.class);
        List<Users> list = dao.listUser();
        list.forEach(l -> System.out.println(l.getUid()+","+l.getUserName()));
    }
}