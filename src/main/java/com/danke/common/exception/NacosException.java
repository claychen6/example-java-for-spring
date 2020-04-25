package com.danke.common.exception;

/**
 * Nacos 服务中心异常
 */
public class NacosException extends RuntimeException {
    public NacosException() {
        super();
    }

    public NacosException(String message) {
        super(message);
    }

    public NacosException(String message, Throwable cause) {
        super(message, cause);
    }

    public NacosException(Throwable cause) {
        super(cause);
    }

    protected NacosException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
