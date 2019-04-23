package com.spring.hero.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @author daiqun
 * @version 2019.04.23
 */
@RestController
@Api("UserController相关的api")
public class UserController {

    @ApiOperation(value = "测试登陆请求", notes = "用户登陆")
    @ApiImplicitParam(name = "login", value = "用户登陆", dataType = "String", paramType = "path")
    @PostMapping(value = "/user")
    private Principal login(Principal user) {
        return user;
    }
}
