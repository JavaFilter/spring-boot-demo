package com.shenyu.redis.controller;

import com.alibaba.fastjson.JSON;
import com.shenyu.redis.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName controller
 * @Author shenyu
 * @Date 2020/5/25
 * @Version 1.0.0
 */
@Slf4j
@RestController
@RequestMapping("/demo/redis")
public class UserController {

    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping("/setKey")
    public String setKey(){
        redisTemplate.opsForValue().set("name","hello I'am shenyu");
        return "success";
    }

    @GetMapping("/getKey")
    public String getKey(){
        Object key = redisTemplate.opsForValue().get("name");
        return key.toString();
    }

    /**
     * 设置一个会过期的key
     * @return
     */
    @GetMapping("/setKeyWithTime")
    public String setKeyWithTime(){
        redisTemplate.opsForValue().set("time","this is time line",10);
        return "success";
    }

    /**
     * 设置一个对象
     * @return
     */
    @GetMapping("/setEntity")
    public String setEntity(){
        User user = new User();
        user.setId("001");
        user.setName("shenyu");
        user.setAge(20);
        user.setBirthday(new Date());
        redisTemplate.opsForValue().set("user",user);
        return "success";
    }

    /**
     * 获取redis中的user对象
     * @return
     */
    @GetMapping("/getEntity")
    public String getEntity(){
        User user = (User) redisTemplate.opsForValue().get("user");
        return JSON.toJSONString(user);
    }

    /**
     * 设置一个列表
     * @return
     */
    @GetMapping("/setList")
    public String setList(){
        User user = new User();
        user.setId("001");
        user.setName("shenyu");
        user.setAge(20);
        user.setBirthday(new Date());

        User user1 = new User();
        user1.setId("002");
        user1.setName("shenyu1");
        user1.setAge(20);
        user1.setBirthday(new Date());

        User user2 = new User();
        user2.setId("003");
        user2.setName("shenyu2");
        user2.setAge(20);
        user2.setBirthday(new Date());

        List<User> users = new ArrayList<User>();
        users.add(user);
        users.add(user1);
        users.add(user2);

        redisTemplate.opsForValue().set("users",users);
        return "success";
    }

    /**
     * 获取对象列表
     * @return
     */
    @GetMapping("/getList")
    public String getList(){
        List<User> users = (List<User>) redisTemplate.opsForValue().get("users");
        return JSON.toJSONString(users);
    }

}
