package com.zjw.api;

import com.zjw.po.City;

import java.util.List;

public interface CityApi {
    List<City> queryCity(Integer partId);
}
