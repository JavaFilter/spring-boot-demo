package com.shenyu.exception.http.response;

/**
 * @ClassName ApiResponse
 * @Author shenyu
 * @Date 2020/6/10
 * @Version 1.0.0
 */
public interface ApiResponse {

    Integer getCode();

    String getMessage();

}
