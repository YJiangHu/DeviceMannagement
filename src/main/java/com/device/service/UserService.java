package com.device.service;

import com.device.po.User;
import com.device.vo.RegisterVO;

public interface UserService {
    User getUserById(Integer id);
    int addUser(RegisterVO registerVO);
}
