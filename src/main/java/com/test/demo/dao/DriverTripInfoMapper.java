package com.test.demo.dao;

import com.test.demo.entity.DriverTripInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DriverTripInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DriverTripInfo record);

    int insertSelective(DriverTripInfo record);

    DriverTripInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DriverTripInfo record);

    int updateByPrimaryKey(DriverTripInfo record);
}