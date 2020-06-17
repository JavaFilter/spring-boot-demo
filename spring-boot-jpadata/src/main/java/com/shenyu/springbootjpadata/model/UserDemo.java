package com.shenyu.springbootjpadata.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @ClassName UserDemo
 * @Author shenyu
 * @Date 2020/6/17
 * @Version 1.0.0
 */
@Data
@Entity
@Table(name = "user_demo")
public class UserDemo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String password;

    private String email;

    private int status;

    @Column(name = "create_time")
    private Date createTime;

}
