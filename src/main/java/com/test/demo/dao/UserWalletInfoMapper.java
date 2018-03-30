package com.test.demo.dao;

import com.test.demo.entity.UserWalletInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserWalletInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserWalletInfo record);

    int insertSelective(UserWalletInfo record);

    UserWalletInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserWalletInfo record);

    int updateByPrimaryKey(UserWalletInfo record);
}