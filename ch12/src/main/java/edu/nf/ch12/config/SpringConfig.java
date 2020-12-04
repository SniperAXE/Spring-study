package edu.nf.ch12.config;

import edu.nf.ch12.controller.UserController;
import edu.nf.ch12.dao.UserDao;
import edu.nf.ch12.dao.impl.UserDaoImpl;
import edu.nf.ch12.service.UserService;
import edu.nf.ch12.service.impl.StuServiceImpl;
import edu.nf.ch12.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

import javax.xml.ws.Service;

/**
 * @author Administrator
 * @date 2020/12/4
 */
@Configuration
//使用配置类同样可以进行扫描，这就是扫描的Bean
//和配置类使用@Bean注解配置的bean一同纳入IOC容器中
@ComponentScan(basePackages = "edu.nf.ch12")
public class SpringConfig {
    /**
     * 装配dao
     * 使用Bean注解来装配dao
     * 方法名默认就是bean的id
     * 也可以通过name属性重新自定义
     */
    @Bean(name = "dao",initMethod = "init",destroyMethod = "destroy")
    //@Scope注解也可以声明在方法上
    //@Scope("singleton")
    //@Primary注解可以标注在方法上，表示优先注入这个bean
    //@Primary
    public UserDaoImpl userDao(){
        return new UserDaoImpl();
    }

    /**
     * 装配Service
     */
    @Bean
    public UserService userService(UserDao userDao){
        UserServiceImpl service = new UserServiceImpl();
        //手动调用set方法进行注入
        //方式一：调用userDao的方法获取dao的bean进行注入
        //service.setUserDao(userDao());
        //方式二：通过Spring传进来的参数进行注入
        service.setUserDao(userDao);
        return service;
    }

    /**
     * 装配StuServiceImpl
     *
     */
    @Bean
    public UserService stuService(UserDao userDao){
        StuServiceImpl service = new StuServiceImpl();
        //注入userDao
        service.setUserDao(userDao);
        return service;
    }

    /**
     * 装配Controller
     * 当有多个实现类时，会先根据参数的变量名称作为id到容器中查找
     * 如果找到则直接传入进来注入，找不到则引发异常，
     * 因此可以结合@Qualifier注解，标识在参数上
     * @return
     */
    @Bean
    public UserController userController(@Qualifier("stuService") UserService userService){
        UserController controller = new UserController();
        //注入UserService
        controller.setUserService(userService);
        return controller;
    }


}