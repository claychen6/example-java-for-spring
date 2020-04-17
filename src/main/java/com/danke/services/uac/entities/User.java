package com.danke.services.uac.entities;

import com.danke.services.base.libs.*;
import lombok.Data;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.*;
import java.io.Serializable;

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
}
