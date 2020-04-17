package com.danke.uac.libs;

import org.springframework.beans.factory.annotation.*;
import org.springframework.core.*;
import org.springframework.data.domain.*;
import org.springframework.http.*;
import org.springframework.http.converter.*;
import org.springframework.http.server.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.*;

import java.util.*;

@EnableWebMvc
@Configurable
public class ResponseConfig {

    @RestControllerAdvice(value = "com.danke.uac")
    static class CRMResponseAdvice implements ResponseBodyAdvice<Object> {
        @Override
        public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
            return true;
        }

        @Override
        public Object beforeBodyWrite(Object body, MethodParameter methodParameter, MediaType mediaType, Class<? extends HttpMessageConverter<?>> aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
            if (body instanceof CRMResponse) {
                return body;
            }

            if (body instanceof Page) {
                Page<?> page = (Page<?>) body;
                Map<String, Object> map = new HashMap<>();

                map.put("total", page.getTotalElements());
                map.put("list", page.getContent());

                return new CRMResponse(map);
            }

            return new CRMResponse(body);
        }
    }
}
