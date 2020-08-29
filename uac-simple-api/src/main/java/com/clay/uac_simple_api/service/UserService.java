package com.clay.uac_simple_api.service;

import java.util.List;
import com.clay.uac_simple_api.entity.User;
import com.clay.common.lib.Page;
import com.clay.uac_simple_api.entity.UserFilter;
import org.springframework.stereotype.Service;

@Service(value = "UserService")
public interface UserService {

    // 用户列表
    public List<User> queryUserList(UserFilter userFilter, Integer limit);

    // 用户列表（分页）
    public Page<User> queryUserPage(UserFilter userFilter, Integer size, Integer page);

    // 创建用户
    public Integer createUser(User user);

    // 用户信息
    public User findUser(Long id);

    // 更新用户
    public Boolean updateUser(Integer id, User user);

    // 删除用户
    public Boolean deleteUser(Integer id);

}
