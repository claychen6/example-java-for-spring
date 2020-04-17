package com.danke.services.base.libs;

import org.springframework.http.*;
import org.springframework.http.converter.*;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.*;

import javax.validation.*;
import java.util.*;

/**
 * # 异常问题
 * <p>
 * ## 请求数据 Query 异常 Parameter
 * <p>
 * ### org.springframework.web.bind.MissingServletRequestParameterException 参数缺失
 * message：Required Long parameter 'id' is not present
 * <p>
 * ### org.springframework.web.method.annotation.MethodArgumentTypeMismatchException 参数类型不匹配
 * message: Failed to convert value of type 'java.lang.String' to required type 'java.lang.Long'; nested exception is java.lang.NumberFormatException: For input string: \"ssss\"
 * <p>
 * ## 请求数据Body异常
 * ### javax.validation.ConstraintViolationException 违反约束
 * message：Validation failed for classes [com.danke.uac.entities.User] during persist time for groups [javax.validation.groups.Default, ]\nList of constraint violations:[\n\tConstraintViolationImpl{interpolatedMessage='手机号格式错误', propertyPath=mobile, rootBeanClass=class com.danke.uac.entities.User, messageTemplate='手机号格式错误'}\n]
 * <p>
 * ### org.springframework.http.converter.HttpMessageNotReadableException
 * message: Required request body is missing: public com.danke.uac.entities.User com.danke.uac.controllers.UserController.updateUser(java.lang.Long,com.danke.uac.entities.User)
 * <p>
 * ## 业务异常
 * ### LogicException（自定义）
 * message：自定义
 */
@ControllerAdvice
public class CRMExceptionHandler {

    private ResponseEntity<?> getResponseEntity(Object data, String message) {
        CRMResponse<?> result = new CRMResponse<>(data, message, 1000000000);
        return new ResponseEntity<CRMResponse<?>>(result, HttpStatus.OK);
    }

    @ExceptionHandler(value = MissingServletRequestParameterException.class)
    public ResponseEntity<?> handlerMissingServletRequestParameterException(MissingServletRequestParameterException e) {
        return this.getResponseEntity(null, e.getParameterName() + " 参数缺失");
    }

    @ExceptionHandler(value = MethodArgumentTypeMismatchException.class)
    public ResponseEntity<?> handlerMethodArgumentTypeMismatchException(MethodArgumentTypeMismatchException e) {
        return this.getResponseEntity(null, e.getName() + " 参数类型不匹配");
    }

    @ExceptionHandler(value = ConstraintViolationException.class)
    public ResponseEntity<?> handlerConstraintViolationException(ConstraintViolationException e) {
        List<String> list = new ArrayList<>();
        for (ConstraintViolation<?> violation : e.getConstraintViolations()) {
            list.add(violation.getMessage());
        }
        return this.getResponseEntity(list, "数据验证失败");
    }

    @ExceptionHandler(value = HttpMessageNotReadableException.class)
    public ResponseEntity<?> handlerHttpMessageNotReadableException() {
        return this.getResponseEntity(null, "body 请求参数异常");
    }

}
