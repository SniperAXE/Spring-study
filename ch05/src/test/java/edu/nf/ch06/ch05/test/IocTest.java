package edu.nf.ch06.ch05.test;

import edu.nf.ch06.ch05.entity.Users;
import edu.nf.ch06.ch05.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Administrator
 * @date 2020/12/1
 */
public class IocTest {
    @Test
    public void testContainer(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService service = context.getBean("userService", UserService.class);
        Users users = new Users();
        service.add(users);
    }
}