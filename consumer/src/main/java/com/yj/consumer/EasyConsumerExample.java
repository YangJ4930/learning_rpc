package com.yj.consumer;

import com.yj.common.model.User;
import com.yj.common.service.UserService;

public class EasyConsumerExample {
    public static void main(String[] args){
        UserService userService = ServiceProxyFactory.getProxy(UserService.class);
        User user = new User();
        user.setName("yj");
        User newUser = userService.getUser(user);
        if(newUser != null){
            System.out.println(newUser.getName());
        }else{
            System.out.println("user == null");
        }
    }
}
