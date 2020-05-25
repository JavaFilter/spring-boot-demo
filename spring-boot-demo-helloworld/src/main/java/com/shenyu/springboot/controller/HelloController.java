package com.shenyu.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Author shenyu
 * @Date 2020/5/14
 * @Version 1.0.0
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String helloWorld(){
        return "HelloWorld";
    }

}
