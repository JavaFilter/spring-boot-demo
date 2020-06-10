package com.shenyu.exception;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName CommonResponseEnum
 * @Author shenyu
 * @Date 2020/6/10
 * @Version 1.0.0
 */
@NoArgsConstructor
public enum CommonResponseEnum {

    /**
     * 成功
     */
    SUCCESS(200, "SUCCESS"),
    /**
     * 服务器繁忙，请稍后重试
     */
    SERVER_BUSY(500, "服务器繁忙，请稍后重试！"),
    /**
     * 服务器异常，无法识别的异常，尽可能对通过判断减少未定义异常抛出
     */
    SERVER_ERROR(500, "服务器异常"),

    ARGUMENT_VALID_ERROR(500, "参数绑定异常"),

    ;

    /**
     * 返回码
     */
    private Integer code;
    /**
     * 返回消息
     */
    private String message;

    CommonResponseEnum(Integer code,String message){
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
