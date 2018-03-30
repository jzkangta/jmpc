package com.test.demo.dao;

import com.test.demo.entity.PassengersTripInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PassengersTripInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PassengersTripInfo record);

    int insertSelective(PassengersTripInfo record);

    PassengersTripInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PassengersTripInfo record);

    int updateByPrimaryKey(PassengersTripInfo record);
}