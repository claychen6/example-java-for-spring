package com.danke.common.app;

import lombok.*;

@Data
public final class CRMResponse<T> {
    private T data = null;
    private String message = "请求成功";
    private Integer code = 0;

    public CRMResponse(T data) {
        this.data = data;
    }

    public CRMResponse(T data, String message) {
        this.data = data;
        this.message = message;
    }

    public CRMResponse(T data, String message, Integer code) {
        this.data = data;
        this.code = code;
        this.message = message;
    }
}
