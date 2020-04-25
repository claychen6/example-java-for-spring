package com.danke.common.libs;

import lombok.*;
//import org.springframework.data.annotation.*;
//import org.springframework.data.jpa.domain.support.*;
//
//import javax.persistence.*;
import java.util.*;

// TODO JAVA 组合结构如何实现

@Setter
@Getter
public abstract class EntityTimes {

//    @CreatedDate
//    @Column(name = "created_at", nullable = false, updatable = false)
    private Date createdAt;

//    @LastModifiedDate
//    @Column(name = "updated_at")
    private Date updatedAt;
}
