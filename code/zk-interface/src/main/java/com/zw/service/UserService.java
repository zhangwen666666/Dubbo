package com.zw.service;

import com.zw.model.User;

public interface UserService {
    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    User queryUserById(Integer id);
}
