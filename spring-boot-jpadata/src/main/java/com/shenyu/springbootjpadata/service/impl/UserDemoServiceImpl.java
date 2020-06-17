package com.shenyu.springbootjpadata.service.impl;

import com.shenyu.springbootjpadata.dao.UserDemoDao;
import com.shenyu.springbootjpadata.model.UserDemo;
import com.shenyu.springbootjpadata.service.UserDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @ClassName UserDemoServiceImpl
 * @Author shenyu
 * @Date 2020/6/17
 * @Version 1.0.0
 */
@Service
public class UserDemoServiceImpl implements UserDemoService {

    @Autowired
    private UserDemoDao userDemoDao;

    @Override
    public UserDemo findUserDemoById(Long id) {
        Optional<UserDemo> userDemo = userDemoDao.findById(id);
        return userDemo.get();
    }

    @Override
    public void createUserDemo(UserDemo userDemo) {
        userDemoDao.save(userDemo);
    }

}
