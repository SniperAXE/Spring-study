package edu.nf.ch17.test;

import edu.nf.ch17.service.StuService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Administrator
 * @date 2020/12/8
 */
public class SpringTest {
    @Test
    public void testAop(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StuService service = context.getBean("stuService",StuService.class);
        service.save("黄家良");
    }
}