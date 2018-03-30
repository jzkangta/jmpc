package com.test.demo.dao;

import com.test.demo.entity.UserCarInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserCarInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserCarInfo record);

    int insertSelective(UserCarInfo record);

    UserCarInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserCarInfo record);

    int updateByPrimaryKey(UserCarInfo record);
}