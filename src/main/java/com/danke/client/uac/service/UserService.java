package com.danke.client.uac.service;

import com.danke.contract.uac.entity.User;
import com.danke.common.client.BaseService;
import com.danke.contract.uac.filter.UserFilter;
import com.danke.contract.uac.service.UserInterface;
import org.springframework.data.domain.*;

import java.util.*;

// TODO 魔法函数 Async 的实现
public class UserService extends BaseService implements UserInterface {

    protected static Map<String, Map<String, String>> APIS = new HashMap<>();

    public User findUser(Long id) {
        this.requestAsync();
        // wait -> return
        return null;
    }

    public List<User> findUsers(List<Long> ids) {
        return null;
    }

    public User createUser(User user) {
        return null;
    }

    public User updateUser(Long id, User user) {
        return null;
    }

    public boolean deleteUser(Long id) {
        return true;
    }

    public List<User> queryUserList(UserFilter userFilter) {
        return null;
    }

    public Page<User> queryUserPage(UserFilter userFilter, int page, int size) {
        return null;
    }
}
