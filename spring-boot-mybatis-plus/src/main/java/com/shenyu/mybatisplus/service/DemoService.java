package com.shenyu.mybatisplus.service;

import com.shenyu.mybatisplus.model.Demo;
import org.springframework.stereotype.Service;

/**
 * @ClassName DemoService
 * @Author shenyu
 * @Date 2020/5/26
 * @Version 1.0.0
 */
public interface DemoService {

    /**
     * 获取数据
     * @return
     */
    public Demo getDemo();

    /**
     * 创建数据
     * @param demo
     */
    public void createDemo(Demo demo);

}
