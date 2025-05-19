package com.zw.service.impl;

import com.zw.model.User;
import com.zw.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

@Service
@DubboService
public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id) {
        return new User(id, "张三", id + 30);
    }

    @Override
    public Integer queryAllUserCount() {
        return 30;
    }
}
