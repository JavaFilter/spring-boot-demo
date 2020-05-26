package com.shenyu.mybatisplus.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @ClassName Demo
 * @Author shenyu
 * @Date 2020/5/26
 * @Version 1.0.0
 */
@Data
@TableName("demo")
public class Demo {

    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    private String name;

    private Date createTime;

}
