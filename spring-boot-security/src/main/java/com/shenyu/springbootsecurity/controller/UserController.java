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
@RequestMapping("/user")
public class UserController {

    @PreAuthorize("hasAuthority('sys:user:view')")
    @GetMapping(value="/findAll")
    public String findAll() {
        return "ok";
    }

    @PreAuthorize("hasAuthority('sys:user:add')")
    @PostMapping(value="/addUser")
    public String addUser() {
        return "ok";
    }

    @PreAuthorize("hasAuthority('sys:user:add2')")
    @PostMapping(value="/addUser2")
    public String addUser2() {
        return "error";
    }

}
