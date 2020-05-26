package com.shenyu.mybatisplus.controller;

import com.shenyu.mybatisplus.model.Demo;
import com.shenyu.mybatisplus.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName DemoController
 * @Author shenyu
 * @Date 2020/5/26
 * @Version 1.0.0
 */
@RestController
@RequestMapping("/mybatis")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/getDemo")
    public String getDemo(){
        return demoService.getDemo().toString();
    }


    @PostMapping("/setDemo")
    public String createDemo(@RequestBody Demo demo){
        demoService.createDemo(demo);
        return "success";
    }

}
