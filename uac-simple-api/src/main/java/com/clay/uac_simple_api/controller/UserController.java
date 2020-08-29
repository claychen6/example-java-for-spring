package com.clay.uac_simple_api.controller;

import com.clay.uac_simple_api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.clay.uac_simple_api.entity.User;
import com.clay.common.lib.Page;
import com.clay.uac_simple_api.entity.UserFilter;

@Controller
public class UserController {

    private UserService userService;

    @RequestMapping("/user/list")
    @ResponseBody
    public List<User> queryUserList(UserFilter userFilter, Integer limit) {
        return userService.queryUserList(userFilter, limit);
    }

    @RequestMapping("/user/page")
    @ResponseBody
    public Page<User> queryUserPage(UserFilter userFilter, Integer size, Integer page) {
        return userService.queryUserPage(userFilter, size, page);
    }

    @RequestMapping("/user/create")
    @ResponseBody
    public Integer createUser(User user) {
        return userService.createUser(user);
    }

    @RequestMapping("/user/find")
    public User findUser(@RequestParam(value = "id") Long id) {
        return userService.findUser(id);
    }

    @RequestMapping("/user/update")
    @ResponseBody
    public Boolean updateUser(Integer id, User user) {
        return userService.updateUser(id, user);
    }

    @RequestMapping("/user/delete")
    @ResponseBody
    public Boolean deleteUser(Integer id) {
        return userService.deleteUser(id);
    }

}
