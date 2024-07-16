package com.test.example.provider;

import com.test.example.common.model.User;
import com.test.example.common.service.UserService;

/**
 * 用户服务实现类：实现公共模块中定义的用户服务接口
 *  - 功能：打印用户的名称，并返回参数中的用户对象
 * */
public class UserServiceImpl {

    public User getUser(User user) {
        System.out.println("user name: " + user.name);
        return user;
    }
}
