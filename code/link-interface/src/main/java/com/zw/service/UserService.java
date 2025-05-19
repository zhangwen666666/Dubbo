package com.zw.service;

import com.zw.model.User;

public interface UserService {
    /**
     * 根据用户标识获取用户信息
     * @param id
     * @return
     */
    User queryUserById(Integer id);

    /**
     * 查询所有用户数量
     * @return
     */
    Integer queryAllUserCount();
}
