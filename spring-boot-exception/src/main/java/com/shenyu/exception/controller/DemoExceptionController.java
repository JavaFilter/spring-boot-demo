package com.shenyu.exception.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @desc 第一个异常处理
 * @ClassName DemoExceptionController
 * @Author shenyu
 * @Date 2020/6/9
 * @Version 1.0.0
 */
@Slf4j
@RestController
@RequestMapping("/demo")
public class DemoExceptionController {

    @PostMapping("/getException")
    public String getException(){
        if (1==1){
            throw new RuntimeException("这是一个RuntimeException!");
        }
        return "success";
    }

}
