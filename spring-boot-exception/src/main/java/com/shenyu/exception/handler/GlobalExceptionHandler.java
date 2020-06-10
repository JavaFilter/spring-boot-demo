package com.shenyu.exception.handler;

import com.shenyu.exception.BusinessException;
import com.shenyu.exception.CommonResponseEnum;
import com.shenyu.exception.http.response.BaseErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @desc 全局异常处理器
 * @ClassName GlobalExceptionHandler
 * @Author shenyu
 * @Date 2020/6/9
 * @Version 1.0.0
 */
@Slf4j
@Component
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 全局异常捕捉处理
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public BaseErrorResponse exceptionHandler(Exception ex) {
        log.error("全局异常",ex);
        return new BaseErrorResponse(CommonResponseEnum.SERVER_BUSY.getCode(),CommonResponseEnum.SERVER_BUSY.getMessage());
    }


    /**
     * 自定义异常捕捉
     * @param ex
     * @return
     */
    @ExceptionHandler(value = BusinessException.class)
    @ResponseBody
    public BaseErrorResponse businessException(BusinessException ex) {
        log.error("全局异常", ex);
        return new BaseErrorResponse(ex.getResponseEnum().getCode(), ex.getResponseEnum().getMessage());
    }


}
