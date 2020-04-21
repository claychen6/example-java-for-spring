package com.danke.service.uac.filter;

import com.danke.service.uac.entity.*;
import lombok.*;
import org.springframework.data.jpa.domain.*;

import javax.persistence.criteria.*;
import java.util.*;

@Data
public class UserFilter implements Specification<User> {
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

    @Override
    public Predicate toPredicate(Root<User> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
        Path<String> idPath = root.get("id");
        Path<String> mobilePath = root.get("mobile");

        if (this.id != null) {
            criteriaQuery.where(criteriaBuilder.equal(idPath, this.id));
        }

        if (this.mobile != null && this.mobile.length() > 0) {
            criteriaQuery.where(criteriaBuilder.equal(mobilePath, this.mobile));
        }

        return null;
    }
}
