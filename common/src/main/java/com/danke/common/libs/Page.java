package com.danke.common.libs;

import lombok.Data;

import java.util.List;

@Data
public class Page<T> {
    protected Long total;
    protected List<T> list;

    public Page(Long total, List<T> list) {
        this.total = total;
        this.list = list;
    }
}
