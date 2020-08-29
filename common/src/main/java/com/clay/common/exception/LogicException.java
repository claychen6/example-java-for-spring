package com.clay.common.exception;

import java.util.*;

/**
 * 业务异常
 */
public class LogicException extends RuntimeException {
    private int code = 1000000000;

    private String message = "";

    private Map<String, Object> params = null;

    public LogicException(String message) {
        this.message = message;
    }

    public LogicException(String message, Map<String, Object> params) {
        this.message = message;
        this.params = params;

        this.initMessage();
    }

    public LogicException(String message, Map<String, Object> params, int code) {
        this.code = code;
        this.message = message;
        this.params = params;

        this.initMessage();
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    public int getCode() {
        return this.code;
    }

    public Map<String, Object> getParams() {
        return this.params;
    }

    private void initMessage() {
        if (this.params == null) return;

        for (String key : this.params.keySet()) {
            this.message = this.message.replace(":" + key, this.params.get(key).toString());
        }
    }
}
