package com.test.demo.dao;

import com.test.demo.entity.UserBaseInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserBaseInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserBaseInfo record);

    int insertSelective(UserBaseInfo record);

    UserBaseInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserBaseInfo record);

    int updateByPrimaryKey(UserBaseInfo record);
}