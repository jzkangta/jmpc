package com.test.demo.dao;

import com.test.demo.entity.PassengersOrderInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PassengersOrderInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PassengersOrderInfo record);

    int insertSelective(PassengersOrderInfo record);

    PassengersOrderInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PassengersOrderInfo record);

    int updateByPrimaryKey(PassengersOrderInfo record);
}