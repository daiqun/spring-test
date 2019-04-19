package com.spring.hero.service.impl;

import com.spring.hero.dao.DeptDao;
import com.spring.hero.mapper.Dept;
import com.spring.hero.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author daiqun
 * @version 2019.04.18
 */
@Service("deptService")
public class DeptServiceImpl implements DeptService {

    @Resource
    private DeptDao deptDao;

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }
}
