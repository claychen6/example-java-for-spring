package com.danke.uac.dao;

import com.danke.service.uac.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserRepository extends JpaSpecificationExecutor<User>, JpaRepository<User, Long> {
}
