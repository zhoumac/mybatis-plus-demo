package com.frame.handler;

/**
 * @Author 周希来
 * @Date 2019/12/6 15:44
 *
 * 统一处理controller返回格式
 *
 */
import com.base.model.ApiResp;
import com.frame.exception.BusinessSilentException;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolationException;
import java.util.List;
@Configuration
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler implements ResponseBodyAdvice {
    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType mediaType, Class aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        if (returnType.hasMethodAnnotation(ExceptionHandler.class)) {
            //处理异常，可以再添加一个异常处理的类，用于处理异常返回格式
            return body;
        } else {
            ApiResp.getSuccess(body);
            return ApiResp.builder().data(body).build();
        }
    }
    /**
     * 处理请求对象属性不满足校验规则的异常信息
     *
     * @param request
     * @param exception
     * @return
     * @throws Exception
     */
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ApiResp exception(HttpServletRequest request, MethodArgumentNotValidException exception) {
        BindingResult result = exception.getBindingResult();
        final List<FieldError> fieldErrors = result.getFieldErrors();
        StringBuilder builderStr = new StringBuilder();
        for (FieldError error : fieldErrors) {
            builderStr.append(error.getDefaultMessage() + "\n");
        }
        return ApiResp.builder().code(500).msg(builderStr.toString()).build();
    }

    /**
     * 处理请求单个参数不满足校验规则的异常信息
     *
     * @param request
     * @param exception
     * @return
     * @throws Exception
     */
    @ExceptionHandler(value = ConstraintViolationException.class)
    public ApiResp constraintViolationExceptionHandler(HttpServletRequest request, ConstraintViolationException exception) {
        log.info(exception.getMessage());
        return ApiResp.getFailByArg(exception.getMessage());
    }

    /**
     * 处理业务异常
     *
     * @param request
     * @param exception
     * @return
     * @throws Exception
     */
    @ExceptionHandler(value = BusinessSilentException.class)
    public ApiResp constraintViolationExceptionHandler(HttpServletRequest request, BusinessSilentException exception) {
        exception.printStackTrace();
        log.info(exception.getMessage());
        return ApiResp.getFailByBusiness(exception);
    }

    /**
     * 处理未定义的其他异常信息
     *
     * @param request
     * @param exception
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    public ApiResp exceptionHandler(HttpServletRequest request, Exception exception) {
        log.error(exception.getMessage());
        exception.printStackTrace();
        return ApiResp.getFailByException(exception);
    }
}