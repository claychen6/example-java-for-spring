package com.danke.common.libs;

import lombok.Data;

import java.util.List;

@Data
public class Page<T> {
    int total;
    List<T> list;
}
