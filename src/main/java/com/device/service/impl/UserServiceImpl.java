package com.device.service.impl;

import com.device.mapper.UserMapper;
import com.device.po.User;
import com.device.service.UserService;
import com.device.vo.RegisterVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    @Override
    public int addUser(RegisterVO registerVO) {
        User user = new User();
        user.setAdminId(registerVO.getAdminId());
        user.setAdminName(registerVO.getAdminName());
        user.setAdminPhone(registerVO.getAdminPhone());
        user.setAdminPassword(registerVO.getAdminPassword());
        return userMapper.addUser(user);
    }
}
