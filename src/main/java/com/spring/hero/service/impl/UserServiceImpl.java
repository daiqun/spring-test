package com.spring.hero.service.impl;

import com.spring.hero.exception.BusinessException;
import com.spring.hero.mapper.UserMapper;
import com.spring.hero.pojo.User;
import com.spring.hero.service.UserService;
import com.spring.hero.utils.EncodeUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author daiqun
 * @version 2019.04.29
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User userLogin(String username, String password) {
        User user = userMapper.findByName(username);
        String pass = EncodeUtils.encodePassword(password);
        if (user == null || !pass.equals(user.getPassword())) {
            throw new BusinessException("用户名不存在或账号密码错误");
        }
        return user;
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
