package com.spring.hero.controller;

import com.spring.hero.pojo.User;
import com.spring.hero.service.UserService;
import com.spring.hero.utils.EncodeUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author daiqun
 * @version 2019.04.23
 */
@RestController
@Api("UserController相关的api")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "测试登陆请求", notes = "用户登陆")
    @ApiImplicitParam(name = "login", value = "用户登陆", dataType = "String", paramType = "path")
    @PostMapping(value = "/login")
    private User login(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password) {
        User user = userService.userLogin(username, password);
        return user;
    }
}
