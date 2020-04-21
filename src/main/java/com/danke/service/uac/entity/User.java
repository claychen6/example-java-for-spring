package com.danke.service.uac.entity;

import com.danke.service.base.lib.*;
import com.fasterxml.jackson.annotation.*;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.*;

@Data
@Entity
@Table(name = "users")
public class User extends EntityTimes implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String username = "";
    @Column
    @Pattern(regexp = "^1(3|4|5|6|7|8|9)\\d{9}$", message = "手机号格式错误")
    @NotBlank(message = "手机号不能为空")
    private String mobile = "";
    @Column
    private String email = "";
    @Column
    private String nickname = "";
    @Column
    private String avatar = "";
    @Column
    private int status = 0;
    @Column
    private int isDel = 0;
    @JsonIgnore
    @Column
    private String password;
}
