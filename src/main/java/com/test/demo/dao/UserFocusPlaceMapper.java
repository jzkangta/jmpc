package com.test.demo.dao;

import com.test.demo.entity.UserFocusPlace;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserFocusPlaceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserFocusPlace record);

    int insertSelective(UserFocusPlace record);

    UserFocusPlace selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserFocusPlace record);

    int updateByPrimaryKey(UserFocusPlace record);
}