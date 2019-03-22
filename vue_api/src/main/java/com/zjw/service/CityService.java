package com.zjw.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.zjw.api.CityApi;
import com.zjw.dao.CityMapper;
import com.zjw.po.City;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class CityService implements CityApi {
@Autowired
    private CityMapper mapper;

    @Override
    public List<City> queryCity(Integer partId) {
        return mapper.selectByPrimaryKey(partId);
    }
}
