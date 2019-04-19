package com.spring.hero.controller;

import com.alibaba.fastjson.JSONObject;
import com.spring.hero.mapper.Dept;
import com.spring.hero.service.DeptService;
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
public class HelloController {

    @Autowired
    private DeptService deptService;

    @GetMapping(value = "/hello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return name;
    }

    @GetMapping("/dept")
    public String findDept() {
        List<Dept> list = deptService.list();
        String string = JSONObject.toJSONString(list);
        return string;
    }
}
