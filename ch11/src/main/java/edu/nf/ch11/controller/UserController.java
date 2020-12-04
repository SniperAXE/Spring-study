package edu.nf.ch11.controller;

import edu.nf.ch11.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author Administrator
 * @date 2020/12/4
 */
@Controller
public class UserController {
    @Autowired
    private UserService service;

    public void save(){
        service.save();
    }

}