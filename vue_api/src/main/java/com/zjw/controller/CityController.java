package com.zjw.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zjw.api.CityApi;
import com.zjw.po.City;
import com.zjw.service.CityService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
@CrossOrigin
@Lazy
@RequestMapping("/city")
public class CityController {
    @Reference
    private CityApi api;

    /**
     * 城市，县级，省级的关系表，即三级联动
     * @param partId 是关系父Id
     * @return
     */
    @GetMapping("queryCity")
    public List<City> queryCity(@RequestParam(defaultValue = "0")Integer partId){
        List<City> page=api.queryCity(partId);
        return page;
    }
}
