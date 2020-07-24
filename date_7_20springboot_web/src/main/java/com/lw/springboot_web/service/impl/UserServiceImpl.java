package com.lw.springboot_web.service.impl;

import com.lw.springboot_web.mapper.UserMapper;
import com.lw.springboot_web.pojo.User;
import com.lw.springboot_web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> findUser() {
        return userMapper.findUser();
    }
}
