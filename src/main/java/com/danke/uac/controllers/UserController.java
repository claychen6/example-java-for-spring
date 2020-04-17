package com.danke.uac.controllers;

import com.danke.uac.entities.*;
import com.danke.uac.services.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public User findUser(
            @RequestParam(value = "id") Long id
    ) {
        return this.userService.findUser(id);
    }

    @RequestMapping(value = "/findMany", method = RequestMethod.POST)
    public List<User> findUsers(
            @RequestBody List<Long> ids
    ) {
        return this.userService.findUsers(ids);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public User createUser(
            @RequestBody User user
    ) {
        return this.userService.createUser(user);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public User updateUser(
            @RequestParam(value = "id") Long id,
            @RequestBody User user
    ) {
        return this.userService.updateUser(id, user);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public boolean deleteUser(
            @RequestParam(value = "id", required = true) Long id
    ) {
        return this.userService.deleteUser(id);
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public List<User> queryUserList(
            @RequestBody(required = false) UserFilter useFilter,
            @RequestParam(value = "limit", required = false, defaultValue = "100") Integer limit
    ) {
        return this.userService.queryUserList(useFilter);
    }

    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public Page<User> queryUserPage(
            @RequestBody(required = false) UserFilter useFilter,
            @RequestParam(value = "page", required = false, defaultValue = "1") int page,
            @RequestParam(value = "size", required = false, defaultValue = "20") int size
    ) {
        return this.userService.queryUserPage(useFilter, page, size);
    }
}
