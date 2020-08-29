package com.clay.common.lib;

import lombok.*;

@Data
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
