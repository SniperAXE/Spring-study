package edu.nf.ch10.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 * @date 2020/12/4
 */
@Service
//从classpath路径下找到data.properties文件
@PropertySource(value = "classpath:data.properties")
public class TestService {
    //@Value注解中使用SqEl表达式指定资源文件中的key
    @Value("${name}")
    private String name;
    @Value("${age}")
    private Integer age;

    public void say(){
        System.out.println(name+","+age);
    }
}