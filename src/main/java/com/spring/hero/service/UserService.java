package com.spring.hero.service;

import com.spring.hero.pojo.User;

import java.util.List;

/**
 * @author daiqun
 * @version 2019.04.29
 */
public interface UserService {

    User userLogin(String username, String password);

    List<User> findAll();
}
