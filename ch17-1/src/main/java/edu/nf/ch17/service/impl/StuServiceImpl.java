package edu.nf.ch17.service.impl;

import edu.nf.ch17.service.StuService;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 * @date 2020/12/8
 */
@Service("stuService")
public class StuServiceImpl implements StuService {

    @Override
    public String save(String name) {
        System.out.println("insert into stu_info values("+name+")");
        return "success";
    }
}