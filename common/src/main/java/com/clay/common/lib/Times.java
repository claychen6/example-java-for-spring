package com.clay.common.lib;

import lombok.*;
import org.springframework.data.annotation.*;
import org.springframework.data.jpa.domain.support.*;

import javax.persistence.*;
import java.util.Date;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class Times {
    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
    Date createdAt;

    @LastModifiedDate
    @Column(name = "updated_at")
    Date updatedAt;
}
