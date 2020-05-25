package com.shenyu.redis.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName user
 * @Author shenyu
 * @Date 2020/5/25
 * @Version 1.0.0
 */
@Data
public class User implements Serializable {

    private String id;

    private String name;

    private Integer age;

    private Date birthday;

}
