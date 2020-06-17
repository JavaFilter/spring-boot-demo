package com.shenyu.springbootjpadata.controller;

import com.shenyu.springbootjpadata.model.UserDemo;
import com.shenyu.springbootjpadata.service.UserDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/getUser/{id}")
    public UserDemo getUserDemo(@PathVariable("id") Long id){
        UserDemo userDemo = userDemoService.findUserDemoById(id);
        return userDemo;
    }

}
