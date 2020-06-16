package com.shenyu.exception.assertion;

import com.shenyu.exception.BusinessException;
import com.shenyu.exception.http.response.ApiResponse;

import java.text.MessageFormat;

/**
 * @ClassName CommonExceptionAssert
 * @Author shenyu
 * @Date 2020/6/16
 * @Version 1.0.0
 */
public interface CommonExceptionAssert extends ApiResponse,Assert{


    @Override
    default BusinessException newException(Object... args) {
        String msg = MessageFormat.format(this.getMessage(), args);

        return new BusinessException(this, args, msg);
    }

    @Override
    default BusinessException newException(Throwable t, Object... args) {
        String msg = MessageFormat.format(this.getMessage(), args);

        return new BusinessException(this, args, msg, t);
    }

}
