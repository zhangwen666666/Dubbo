package com.zw.service.impl;

import com.zw.model.User;
import com.zw.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

@DubboService(group = "group1", version = "1.0.0") // 标识该类是一个 Dubbo 服务提供者。
@Service
public class UserServiceImpl1 implements UserService {
    @Override
    public User queryUserById(Integer id) {
        return new User(id, "zhangsan", 18);
    }
}
