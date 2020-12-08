package edu.nf.test;

import edu.nf.ch14.service.StuService;
import edu.nf.ch14.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Administrator
 * @date 2020/12/7
 */
public class AopTest {
    @Test
    public void testAop(){
        //初始化IOC容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从容器中获取创建的代理实例
        UserService service = context.getBean("userServiceProxy",UserService.class);
        service.add();
    }

    @Test
    public void testAop2(){
        //初始化IOC容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从容器中获取创建的代理实例
        StuService service = context.getBean("userServiceProxy",StuService.class);
        service.add();
    }
}