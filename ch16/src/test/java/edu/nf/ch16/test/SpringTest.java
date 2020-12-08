package edu.nf.ch16.test;

import edu.nf.ch16.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Administrator
 * @date 2020/12/8
 */
public class SpringTest {
    @Test
    public void AopTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service = context.getBean("userService",UserService.class);
        service.add("aa");
    }
}