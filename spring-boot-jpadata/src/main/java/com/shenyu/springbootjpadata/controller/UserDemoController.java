package com.shenyu.springbootjpadata.controller;

import com.shenyu.springbootjpadata.model.UserDemo;
import com.shenyu.springbootjpadata.service.UserDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserDemo
 * @Author shenyu
 * @Date 2020/6/17
 * @Version 1.0.0
 */
@RestController
@RequestMapping("/jpa")
public class UserDemoController {

    @Autowired
    private UserDemoService userDemoService;

    @PostMapping("/createUser")
    public String createUserDemo(@RequestBody UserDemo userDemo){
        userDemoService.createUserDemo(userDemo);
        return "success";
    }

}
