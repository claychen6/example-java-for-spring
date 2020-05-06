package com.danke.contract.uac.service;

import com.danke.common.libs.Page;
import com.danke.contract.uac.entity.User;
import com.danke.contract.uac.filter.UserFilter;

import java.util.List;

public interface UserInterface {
    User findUser(Long id);

    List<User> findUsers(List<Long> ids);

    User createUser(User user);

    User updateUser(Long id, User user);

    boolean deleteUser(Long id);

    List<User> queryUserList(UserFilter userFilter, int limit);

    Page<User> queryUserPage(UserFilter userFilter, int page, int size);
}
