package edu.nf.ch09.controller;

import edu.nf.ch09.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * @author Administrator
 * @date 2020/12/3
 */
//使用Component注解表示类，表示为容器受管的Bean
//value属性用于指定Bean的id，如果不指定，默认就是类名
//将首字母变为小写后作为ID
//@Component("controller")
//从3.0后开始，每一个层都有对应的注解来标识，作用和
//@Component注解一样的，这样标识起来更加明确
@Controller("userController")
//@Scope注解用于指定Bean的作用域，作用和xml中的一致，默认单利
@Scope("prototype")
public class UserController {
    //字段注入
    @Autowired
    //通过@Qualify制定Bean的id
    //@Qualifier("userService")
    private UserService userService;

    //构造方法注入
   /* @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }*/

    //注入service对象
    //@Autowired注解用于完成注入配置，
    //可以标识在set方法上，构造方法上，字段上
    //注意：当只有一个实现类的时候，Spring
    //会自动找到它并直接注入进来，
    //如果有多个实现类的时候，就必须结合
    //@Qualifier注解一起使用，这个注解的作用是
    //指定要注入哪一个实现类
   /* @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }*/

    public void add(){
        userService.add();
    }
}