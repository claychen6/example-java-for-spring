package com.danke.common.libs;

import lombok.*;

@Data
// 作用规范接口响应结构
public final class Response<T> {
    private T data = null;
    private String message = "请求成功";
    private Integer code = 0;

    public Response(T data) {
        this.data = data;
    }

    public Response(T data, String message) {
        this.data = data;
        this.message = message;
    }

    public Response(T data, String message, Integer code) {
        this.data = data;
        this.code = code;
        this.message = message;
    }
}
