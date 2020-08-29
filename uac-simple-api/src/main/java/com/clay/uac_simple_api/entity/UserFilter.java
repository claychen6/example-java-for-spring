package com.clay.uac_simple_api.entity;

import lombok.Data;
import java.util.List;

@Data
public class UserFilter {

  private List<Integer> ids; // 

  private String nickname; // 昵称模糊匹配

  private String username; // 昵称模糊匹配

  private String mobile; // 手机

  private String email; // 邮箱模糊匹配

  private Integer status; // 

  private List<String> createdAtRange; // 两个元素数组

  private List<String> updatedAtRange; // 两个元素数组

}