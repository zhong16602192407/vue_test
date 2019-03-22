package com.zjw.dao;

import com.zjw.po.City;

import java.util.List;

public interface CityMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(City record);

    int insertSelective(City record);

    List<City> selectByPrimaryKey(Integer partId);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
}