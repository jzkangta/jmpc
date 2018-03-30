package com.test.demo.dao;

import com.test.demo.entity.UserRouteInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRouteInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserRouteInfo record);

    int insertSelective(UserRouteInfo record);

    UserRouteInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserRouteInfo record);

    int updateByPrimaryKey(UserRouteInfo record);
}