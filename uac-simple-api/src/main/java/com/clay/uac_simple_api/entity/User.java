package com.clay.uac_simple_api.entity;

import lombok.Data;

@Data
public class User {
  private Long id; //

  private String nickname; // 昵称

  private String username; // 用户名

  private String password; // 密码

  private String mobile; // 手机

  private String email; // 邮箱

  private String avatar; // 头像

  private Integer status; // 状态0禁用 1启用

  private String remark; // 备注

  private String createdAt; // 

  private String updatedAt; // 

}