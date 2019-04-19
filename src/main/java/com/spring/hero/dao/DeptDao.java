package com.spring.hero.dao;

import com.spring.hero.mapper.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author daiqun
 * @version 2019.04.18
 */
@Mapper
public interface DeptDao {

    List<Dept> findAll();
}
