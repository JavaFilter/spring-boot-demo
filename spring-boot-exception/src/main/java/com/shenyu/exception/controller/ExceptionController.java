package com.shenyu.exception.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.shenyu.exception.assertion.CommonExceptionEnum.ARGUMENT_VALID_ERROR;


/**
 * @ClassName ExceptionController
 * @Author shenyu
 * @Date 2020/6/9
 * @Version 1.0.0
 */
@RestController
@RequestMapping("/assert")
public class ExceptionController {


    @GetMapping("/getException")
    public String getException(){
        ARGUMENT_VALID_ERROR.assertIsNull(null);
        return "ok";
    }

}
