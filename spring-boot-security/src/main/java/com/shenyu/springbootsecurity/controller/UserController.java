package com.shenyu.springbootsecurity.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Author shenyu
 * @Date 2020/6/29
 * @Version 1.0.0
 */
@RestController
@RequestMapping("/demo")
public class UserController {

    @PreAuthorize("hasAuthority('sys:user:view')")
    @GetMapping(value="/findAll")
    public String findAll() {
        return "ok";
    }

}
