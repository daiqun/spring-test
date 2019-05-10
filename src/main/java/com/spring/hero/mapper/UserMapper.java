package com.spring.hero.mapper;

import com.spring.hero.pojo.User;

/**
 * @author daiqun
 * @version 2019.04.29
 */
public interface UserMapper {

    User findByName(String username);
}
