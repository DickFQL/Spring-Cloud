package com.fantasy.server_user01.service;


import com.fantasy.pojo.User;
import com.fantasy.server_user01.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public User findUserById(Integer uid) {
        return userMapper.findUserById(uid);
    }
}
