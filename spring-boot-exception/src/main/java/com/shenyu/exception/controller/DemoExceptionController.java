package com.shenyu.exception.controller;

import com.shenyu.exception.BusinessException;
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

    /**
     * 全局异常
     * @return
     */
    @PostMapping("/getException")
    public String getException(){
        if (1==1){
            throw new RuntimeException("这是一个RuntimeException!");
        }
        return "success";
    }

    /**
     * 自定义异常
     * @return
     */
    @PostMapping("/getBusinessException")
    public String getBusinessException(){
        if (1==1){
            throw new BusinessException(500,"这是一个自定义Exception!");
        }
        return "success";
    }




}
