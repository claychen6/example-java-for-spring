package com.danke.contract.uac.entity;

import com.danke.common.libs.*;
import com.fasterxml.jackson.annotation.*;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.*;

// TODO 去掉 JPA 依赖

@Data
//@Entity
//@Table(name = "users")
public class User extends EntityTimes implements Serializable {
    private Long id;
    private String username = "";
    private String mobile = "";
    private String email = "";
    private String nickname = "";
    private String avatar = "";
    private int status = 0;
    private int isDel = 0;
    private String password;
}
