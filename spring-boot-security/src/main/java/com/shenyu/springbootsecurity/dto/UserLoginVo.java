package com.shenyu.springbootsecurity.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName UserLoginVo
 * @Author shenyu
 * @Date 2020/6/29
 * @Version 1.0.0
 */
@Data
public class UserLoginVo implements Serializable {

    private String username;

    private String password;

}
