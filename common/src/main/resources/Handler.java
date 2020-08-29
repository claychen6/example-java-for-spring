package com.clay.common.lib;

import com.danke.common.libs.Response;
import org.springframework.http.*;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.*;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

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
public class Handler {

    private ResponseEntity<?> getResponseEntity(String message) {
        Response<?> result = new Response<>(null, message, 1000000000);
        return new ResponseEntity<Response<?>>(result, HttpStatus.OK);
    }

//    @ExceptionHandler(value = MissingServletRequestParameterException.class)
//    public ResponseEntity<?> handleMissingServletRequestParameterException(MissingServletRequestParameterException e) {
//        return this.getResponseEntity(e.getParameterName() + " 参数缺失");
//    }

    @ExceptionHandler(value = MethodArgumentTypeMismatchException.class)
    public ResponseEntity<?> handleMethodArgumentTypeMismatchException(MethodArgumentTypeMismatchException e) {
        return this.getResponseEntity(e.getName() + " 参数类型不匹配");
    }

//    @ExceptionHandler(value = ConstraintViolationException.class)
//    public ResponseEntity<?> handleConstraintViolationException(ConstraintViolationException e) {
//        List<String> list = new ArrayList<>();
//        for (ConstraintViolation<?> violation : e.getConstraintViolations()) {
//            list.add(violation.getMessage());
//        }
//        return this.getResponseEntity(list, "数据验证失败");
//    }

    @ExceptionHandler(value = HttpMessageNotReadableException.class)
    public ResponseEntity<?> handleHttpMessageNotReadableException() {
        return this.getResponseEntity("body 请求参数异常");
    }

}
