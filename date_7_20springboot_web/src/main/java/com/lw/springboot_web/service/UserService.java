package com.lw.springboot_web.service;

import com.lw.springboot_web.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    public List<User> findUser();
}
