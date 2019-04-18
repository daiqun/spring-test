package com.spring.hero.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author daiqun
 * @version 2019.04.18
 */
@RestController
@RequestMapping("/home")
public class HelloController {

    @GetMapping(value = "/hello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return name;
    }
}
