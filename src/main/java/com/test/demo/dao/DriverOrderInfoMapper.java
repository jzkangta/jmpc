package com.test.demo.dao;

import com.test.demo.entity.DriverOrderInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DriverOrderInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DriverOrderInfo record);

    int insertSelective(DriverOrderInfo record);

    DriverOrderInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DriverOrderInfo record);

    int updateByPrimaryKey(DriverOrderInfo record);
}