package edu.nf.ch06.test;

import edu.nf.ch06.Users;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Administrator
 * @date 2020/12/2
 */
public class SpringTest {
    @Test
    public void testInject(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Users users = context.getBean("user",Users.class);
        System.out.println(users.getUserName());
        System.out.println(users.getAge());
        users.getAddress().forEach(addr -> System.out.println(addr));
        users.getCard().forEach((k,v) -> System.out.println(k+":"+v));
        System.out.println(users.getProp().getProperty("aa"));
        System.out.println(users.getProp().getProperty("bb"));


    }
}