package com.shenyu.exception.http.response;

import lombok.Data;

/**
 * @ClassName BaseResponse
 * @Author shenyu
 * @Date 2020/6/10
 * @Version 1.0.0
 */
@Data
public class BaseErrorResponse {

    /**
     * 返回码
     */
    protected Integer code;
    /**
     * 返回消息
     */
    protected String message;


    public BaseErrorResponse(ApiResponse responseEnum) {
        this(responseEnum.getCode(), responseEnum.getMessage());
    }

    public BaseErrorResponse(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
