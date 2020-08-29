package com.clay.common.exception;

/**
 * Nacos 服务中心异常
 */
public class NacosException extends RuntimeException {

    public NacosException(String message) {
        super(message);
    }

}
