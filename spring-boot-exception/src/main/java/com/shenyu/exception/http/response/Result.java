package com.shenyu.exception.http.response;

import lombok.Data;

/**
 * @ClassName Result
 * @Author shenyu
 * @Date 2020/6/10
 * @Version 1.0.0
 */
@Data
public class Result {

    /**
     * 响应消息
     */
    private String message;

    /**
     * 响应code
     */
    private Integer code;

    /**
     * 响应数据
     */
    private Object data;

    public Result() {
    }

}
