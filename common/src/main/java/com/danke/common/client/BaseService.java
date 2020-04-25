package com.danke.common.client;

import com.danke.common.exception.*;

public abstract class BaseService {
    protected static String serviceName = "";

    public BaseService() {
        if (serviceName.isEmpty()) {
            throw new NacosException("ServiceName can not be empty");
        }
    }

    public void getClient() {
    }

    public void request() {
    }

    public void requestAsync() {
    }
}
