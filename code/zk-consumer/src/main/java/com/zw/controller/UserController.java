package com.zw.controller;

import com.zw.model.User;
import com.zw.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @DubboReference(group = "user", version = "1.0.0", timeout = 5000)
    private UserService userService;
    @DubboReference(group = "user", version = "2.0.0")
    private UserService userService2;

    @GetMapping("/user/{id}")
    public User queryUserById(@PathVariable Integer id) {
        return userService.queryUserById(id);
    }

    @GetMapping("/user2/{id}")
    public User queryUserById2(@PathVariable Integer id) {
        return userService2.queryUserById(id);
    }
}
