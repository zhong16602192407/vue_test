package com.zjw.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.zjw.api.JszApi;
import com.zjw.dao.JszlistMapper;
import com.zjw.dao.WzlistMapper;
import com.zjw.po.Jszlist;
import com.zjw.po.Wzlist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service

public class jszListServiceImpl implements JszApi {

    @Autowired
    private JszlistMapper mapper;
    @Autowired
    private WzlistMapper wzmapper;

    @Override
    public List<Jszlist> queryJszList(String jname) {
        return mapper.selectqueryList(jname);
    }

    @Override
    public List<Wzlist> queryWzlistBiJid(Integer jid) {
        return wzmapper.selectByPrimaryKey(jid);
    }

    /**
     *添加的方法，添加了事务的回滚方法
     * 如若添加信息错误返回则事务回滚
     * @param jszlist
     */
    @Override
    @Transactional
    public void add(Jszlist jszlist) {
        jszlist.setOnecity("北京");
        jszlist.setTwocity("北京");
        jszlist.setTherecity("海淀区");
        mapper.insert(jszlist);
    }

    @Override
    public Jszlist findOne(Integer jid) {
        return mapper.selectByPrimaryKey(jid);
    }

    @Override
    @Transactional
    public void update(Jszlist jszlist) {
        jszlist.setOnecity("江苏");
        jszlist.setTwocity("南京市");
        jszlist.setTherecity("鼓楼区");
        mapper.updateByPrimaryKey(jszlist);
    }

}
