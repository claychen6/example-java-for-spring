package com.danke.contract.uac.filter;

import lombok.*;

import java.util.*;

@Data
public class UserFilter {
    private Long id = null;
    private List<Long> ids = null;
    private String username = null;
    private String mobile = null;
    private String email = null;
    private Integer status = null;
    private String nickname = null;
    private List<String> createdAtRange = null;
    private List<String> updatedAtRange = null;
    private Integer isDel = 0;
}
