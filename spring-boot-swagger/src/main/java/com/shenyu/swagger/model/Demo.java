package com.shenyu.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName Demo
 * @Author shenyu
 * @Date 2020/6/5
 * @Version 1.0.0
 */
@Data
@ApiModel(value = "demo实体")
public class Demo implements Serializable {

    @ApiModelProperty(value = "demoId")
    private String id;

    @ApiModelProperty(value = "demo姓名")
    private String name;

    @ApiModelProperty(value = "demo邮箱")
    private String email;

}
