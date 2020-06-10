package com.shenyu.exception;

import com.shenyu.exception.http.response.ApiResponse;
import lombok.Getter;

/**
 * @ClassName BusinessException
 * @Author shenyu
 * @Date 2020/6/10
 * @Version 1.0.0
 */
@Getter
public class BusinessException extends RuntimeException {

    /**
     * 返回码
     */
    protected ApiResponse responseEnum;
    /**
     * 异常消息参数
     */
    protected Object[] args;

    public BusinessException(ApiResponse responseEnum) {
        super(responseEnum.getMessage());
        this.responseEnum = responseEnum;
    }

    public BusinessException(Integer code, String msg) {
        super(msg);
        this.responseEnum = new ApiResponse() {
            @Override
            public Integer getCode() {
                return code;
            }

            @Override
            public String getMessage() {
                return msg;
            }
        };
    }

    public BusinessException(ApiResponse responseEnum, Object[] args, String message) {
        super(message);
        this.responseEnum = responseEnum;
        this.args = args;
    }

    public BusinessException(ApiResponse responseEnum, Object[] args, String message, Throwable cause) {
        super(message, cause);
        this.responseEnum = responseEnum;
        this.args = args;
    }

}
