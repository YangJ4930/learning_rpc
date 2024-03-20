package com.yj.provider;

import com.yj.common.model.User;
import com.yj.common.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public User getUser(User user) {
        System.out.println(user.getName());
        return user;
    }

}
