package com.clay.app.dao;

import com.clay.app.dto.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserRepository extends JpaSpecificationExecutor<UserDTO>, JpaRepository<UserDTO, Long> {
}
