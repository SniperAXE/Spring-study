package edu.nf.ch10.test;

import edu.nf.ch10.demo.TestService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author Administrator
 * @date 2020/12/4
 */
public class SpringTest {
    @Test
    public void testProperties(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        TestService service = context.getBean("testService", TestService.class);
        service.say();
    }
}