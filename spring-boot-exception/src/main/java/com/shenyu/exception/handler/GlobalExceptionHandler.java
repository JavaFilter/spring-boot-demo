package com.shenyu.exception.handler;

import com.shenyu.exception.BusinessException;
import com.shenyu.exception.CommonResponseEnum;
import com.shenyu.exception.http.response.BaseErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.ConversionNotSupportedException;
import org.springframework.beans.TypeMismatchException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.AsyncRequestTimeoutException;
import org.springframework.web.multipart.support.MissingServletRequestPartException;
import org.springframework.web.servlet.NoHandlerFoundException;

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