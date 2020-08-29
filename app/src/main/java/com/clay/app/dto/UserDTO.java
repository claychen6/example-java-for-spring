package com.clay.app.dto;

import lombok.Data;
import com.clay.common.lib.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "users")
public class UserDTO extends Times implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String username = "";
    @Column
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
