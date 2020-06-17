package com.shenyu.springbootjpadata.service;

import com.shenyu.springbootjpadata.model.UserDemo;

/**
 * @ClassName UserDemoService
 * @Author shenyu
 * @Date 2020/6/17
 * @Version 1.0.0
 */
public interface UserDemoService {

    /**
     * 查询用户
     * @param id
     * @return
     */
    UserDemo findUserDemoById(Long id);

    /**
     * 创建用户
     * @param userDemo
     */
    void createUserDemo(UserDemo userDemo);

}
