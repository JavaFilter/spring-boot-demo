package com.shenyu.exception.assertion;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @ClassName CommomExceptionEnum
 * @Author shenyu
 * @Date 2020/6/16
 * @Version 1.0.0
 */
@Getter
@AllArgsConstructor
public enum CommonExceptionEnum implements CommonExceptionAssert {

    SUCCESS(200,"success"),
    ARGUMENT_VALID_ERROR(500,"参数异常")

    ;

    /**
     * 返回码
     */
    private Integer code;
    /**
     * 返回消息
     */
    private String message;
}
