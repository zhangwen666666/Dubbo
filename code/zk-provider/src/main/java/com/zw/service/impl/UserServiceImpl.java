package com.zw.service.impl;

import com.zw.model.User;
import com.zw.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

@Service
@DubboService(group = "user", version = "1.0.0", timeout = 10000)
public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id) {
        return new User(id, "王德发", 66);
    }
}
