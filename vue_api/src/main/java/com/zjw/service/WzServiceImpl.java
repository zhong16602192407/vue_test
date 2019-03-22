package com.zjw.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.zjw.api.WzApi;
import com.zjw.dao.WzlistMapper;
import com.zjw.po.Wzlist;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class WzServiceImpl implements WzApi {
    @Autowired
    private WzlistMapper mapper;
    @Override
    public List<Wzlist> queryWzlistBiJid(Integer jid, String jname) {
        return mapper.queryList(jid,jname);
    }
}
