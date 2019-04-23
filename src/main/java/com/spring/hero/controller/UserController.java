package com.spring.hero.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @author daiqun
 * @version 2019.04.23
 */
@RestController
public class UserController {

    @RequestMapping(value = "/user")
    private Principal login(Principal user) {
        return user;
    }
}
