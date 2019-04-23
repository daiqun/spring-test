package com.spring.hero.controller;

import com.alibaba.fastjson.JSONObject;
import com.spring.hero.mapper.Dept;
import com.spring.hero.service.DeptService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author daiqun
 * @version 2019.04.18
 */
@RestController
@RequestMapping("/home")
@Api("HelloController相关的api")
public class HelloController {

    @Autowired
    private DeptService deptService;

    @ApiOperation(value = "测试get请求", notes = "测试")
    @ApiImplicitParam(name = "sayHello", value = "测试", dataType = "String", paramType = "path")
    @GetMapping(value = "/hello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return name;
    }

    @ApiOperation(value = "测试get请求", notes = "注意事项")
    @ApiImplicitParam(name = "findDept", value = "查询员工", dataType = "String", paramType = "path")
    @GetMapping("/dept")
    public String findDept() {
        List<Dept> list = deptService.list();
        String string = JSONObject.toJSONString(list);
        return string;
    }
}
