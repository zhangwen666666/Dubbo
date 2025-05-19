package com.zw.controller;

import com.zw.model.User;
import com.zw.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @DubboReference(url = "dubbo://127.0.0.1:20881")
    private UserService userService;

    @GetMapping("/user/{id}")
    public User queryUserById(@PathVariable Integer id) {
        return userService.queryUserById(id);
    }

    @GetMapping("/user/count")
    public Integer queryAllUserCount() {
        return userService.queryAllUserCount();
    }
}
