package com.shenyu.springbootsecurity.model;

import lombok.Data;

/**
 * @ClassName User
 * @Author shenyu
 * @Date 2020/6/29
 * @Version 1.0.0
 */
@Data
public class User {

    private Long id;

    private String username;

    private String password;

}
