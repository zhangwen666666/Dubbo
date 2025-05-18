package com.zw.controller;

import com.zw.model.User;
import com.zw.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @DubboReference(url = "dubbo://127.0.0.1:20880", group = "group1", version = "1.0.0")  // 直连服务提供者
    private UserService userService1;

    @DubboReference(url = "dubbo://127.0.0.1:20880", group = "group2", version = "2.0.0")
    private UserService userService2;

    @GetMapping("/user1/{id}")
    public User userDetail1(@PathVariable Integer id){
        return userService1.queryUserById(id);
    }

    @GetMapping("/user2/{id}")
    public User userDetail2(@PathVariable Integer id){
        return userService2.queryUserById(id);
    }
}
