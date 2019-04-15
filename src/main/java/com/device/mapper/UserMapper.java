package com.device.mapper;

import com.device.po.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User getUserById(@Param("id") Integer id);
    int addUser(User user);
}
