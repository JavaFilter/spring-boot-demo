package com.shenyu.springbootsecurity.controller;

import com.alibaba.fastjson.JSON;
import com.shenyu.springbootsecurity.dto.UserLoginVo;
import com.shenyu.springbootsecurity.security.JwtAuthToken;
import com.shenyu.springbootsecurity.util.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @ClassName LoginController
 * @Author shenyu
 * @Date 2020/6/29
 * @Version 1.0.0
 */
@RestController
@RequestMapping("/demo")
public class LoginController {

    @Autowired
    private AuthenticationManager authenticationManager;

    /**
     * 登录接口
     */
    @PostMapping(value = "/login")
    public String login(@RequestBody UserLoginVo loginBean, HttpServletRequest request) throws IOException {
        // 系统登录认证
        JwtAuthToken token = SecurityUtils.login(request, loginBean.getUsername(), loginBean.getPassword(), authenticationManager);
        return JSON.toJSONString(token);
    }


}
