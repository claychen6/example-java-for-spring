package com.clay.common.lib;

import lombok.Data;

import java.util.List;

@Data
public class Page<T> {

    Integer total;

    List<T> list;

    public Page(Integer total, List<T> list) {
        this.total = total;
        this.list = list;
    }
}
