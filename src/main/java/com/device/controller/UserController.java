package com.device.controller;

import com.device.enums.CodeMsg;
import com.device.po.User;
import com.device.result.Result;
import com.device.service.UserService;
import com.device.vo.RegisterVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }

    @RequestMapping("/login")
    @ResponseBody
    public Result<User> login(@RequestParam("id")String formId
            , @RequestParam("password")String password) {
        Integer id = null;
        try {
            id = Integer.parseInt(formId);
        } catch (NumberFormatException e) {
            throw new RuntimeException("请输入正确员工号");
        }
        User user = userService.getUserById(id);
        if(user == null) {
            return Result.error(CodeMsg.USER_NOT_EXIST);
        }
        if(!user.getAdminPassword().equals(password)) {
            return Result.error(CodeMsg.PASSWORD_ERROR);
        }
        return Result.success(user);
    }

    @RequestMapping("/register")
    @ResponseBody
    public Result<String> register(RegisterVO registerVO) {
        if(userService.getUserById(registerVO.getAdminId()) != null) {
            return Result.error(CodeMsg.USER_REPEAT);
        }
        return userService.addUser(registerVO) == 1 ? Result.success(registerVO.getAdminName()) : Result.<String>error(CodeMsg.USER_REPEAT);
    }
}
