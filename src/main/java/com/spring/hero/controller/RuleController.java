package com.spring.hero.controller;

import com.spring.hero.pojo.User;
import com.spring.hero.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author daiqun
 * @version 2019.08.27
 */
@RestController
@Api("RuleController相关的api")
public class RuleController extends BaseController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "Rule查询", notes = "Rule查询")
    @ApiImplicitParam(name = "rule", value = "Rule查询", dataType = "String", paramType = "path")
    @GetMapping(value = "/rule")
    private List<User> findUsers() {
        return userService.findAll();
    }
}
