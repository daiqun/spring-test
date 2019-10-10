package com.spring.hero.controller;

import com.spring.hero.handler.AppContext;
import com.spring.hero.pojo.User;
import com.spring.hero.pojo.dto.Result;
import com.spring.hero.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author daiqun
 * @version 2019.04.23
 */
@RestController
@Api("UserController相关的api")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "用户登陆", notes = "用户登陆")
    @ApiImplicitParam(name = "/login/account", value = "用户登陆", dataType = "String", paramType = "path")
    @PostMapping(value = "/login/account")
    private Result login(@RequestParam(value = "userName") String userName, @RequestParam(value = "password") String password) {
        User user = userService.userLogin(userName, password);
        if (user != null) {
            user.setPassword(null);
            this.setSession("USER", user);
        }
        return Result.getInstance("ok", "登陆成功");
    }

    @ApiOperation(value = "当前线程用户", notes = "当前线程用户")
    @ApiImplicitParam(name = "currentUser", value = "当前线程用户", dataType = "String", paramType = "path")
    @GetMapping(value = "/currentUser")
    private User currentUser() {
        User user = AppContext.getContext().getUser();
        return user;
    }
}