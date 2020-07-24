package com.lw.springboot_web.mapper;

import com.lw.springboot_web.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public List<User> findUser();
}
