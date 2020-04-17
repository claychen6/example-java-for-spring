package com.danke.uac.repositories;

import com.danke.services.uac.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserRepository extends JpaSpecificationExecutor<User>, JpaRepository<User, Long> {
}
