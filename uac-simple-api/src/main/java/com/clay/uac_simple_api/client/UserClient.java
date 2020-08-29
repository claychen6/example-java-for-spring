package com.clay.uac_simple_api.client;

import java.util.List;
import com.clay.uac_simple_api.entity.User;
import com.clay.common.lib.Page;
import com.clay.uac_simple_api.entity.UserFilter;

// TODO 默认参数
public class UserClient {

    // 用户列表
    public List<User> queryUserList(UserFilter userFilter, Integer limit) {
        return null;
    }

    // 用户列表（分页）
    public Page<User> queryUserPage(UserFilter userFilter, Integer size, Integer page) {
        return null;
    }

    // 创建用户
    public Integer createUser(User user) {
        return null;
    }

    // 用户信息
    public User findUser(Long id) {
        return null;
    }

    // 更新用户
    public Boolean updateUser(Integer id, User user) {
        return null;
    }

    // 删除用户
    public Boolean deleteUser(Integer id) {
        return null;
    }

}
