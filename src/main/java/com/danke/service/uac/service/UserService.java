package com.danke.service.uac.service;

import com.danke.service.uac.entity.*;
import com.danke.service.uac.filter.*;
import org.springframework.data.domain.*;

import java.util.*;

public interface UserService {
    User findUser(Long id);

    List<User> findUsers(List<Long> ids);

    User createUser(User user);

    User updateUser(Long id, User user);

    boolean deleteUser(Long id);

    List<User> queryUserList(UserFilter userFilter);

    Page<User> queryUserPage(UserFilter userFilter, int page, int size);
}
