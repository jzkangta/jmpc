package com.test.demo.dao;

import com.test.demo.entity.PlaceTagInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PlaceTagInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PlaceTagInfo record);

    int insertSelective(PlaceTagInfo record);

    PlaceTagInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PlaceTagInfo record);

    int updateByPrimaryKey(PlaceTagInfo record);
}