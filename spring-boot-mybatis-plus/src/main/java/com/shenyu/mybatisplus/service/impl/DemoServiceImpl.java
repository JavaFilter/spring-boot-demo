package com.shenyu.mybatisplus.service.impl;

import com.shenyu.mybatisplus.mapper.DemoMapper;
import com.shenyu.mybatisplus.model.Demo;
import com.shenyu.mybatisplus.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName DemoServiceImpl
 * @Author shenyu
 * @Date 2020/5/26
 * @Version 1.0.0
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoMapper demoMapper;

    @Override
    public Demo getDemo() {
        return demoMapper.selectById(1);
    }

    @Override
    public void createDemo(Demo demo) {
        demoMapper.insert(demo);
    }

}
