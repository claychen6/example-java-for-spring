package com.danke.common.app;

import lombok.*;

@Data
/**
 * 接口返回规范
 */
public final class ResponseData<T> {
    private T data = null;
    private String message = "请求成功";
    private Integer code = 0;

    public ResponseData(T data) {
        this.data = data;
    }

    public ResponseData(T data, String message) {
        this.data = data;
        this.message = message;
    }

    public ResponseData(T data, String message, Integer code) {
        this.data = data;
        this.code = code;
        this.message = message;
    }
}
