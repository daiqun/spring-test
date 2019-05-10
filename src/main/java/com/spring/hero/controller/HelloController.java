package com.spring.hero.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author daiqun
 * @version 2019.04.18
 */
@RestController
@RequestMapping("/home")
@Api("HelloController相关的api")
public class HelloController {

    @ApiOperation(value = "测试get请求", notes = "测试")
    @ApiImplicitParam(name = "sayHello", value = "测试", dataType = "String", paramType = "path")
    @GetMapping(value = "/hello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return name;
    }
}
