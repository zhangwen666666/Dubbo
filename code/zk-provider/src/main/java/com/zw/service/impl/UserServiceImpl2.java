package com.zw.service.impl;


import com.zw.model.User;
import com.zw.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

@Service
@DubboService(group = "user", version = "2.0.0")
public class UserServiceImpl2 implements UserService {
    @Override
    public User queryUserById(Integer id) {
        return new User(id, "张德帅", 50);
    }
}
