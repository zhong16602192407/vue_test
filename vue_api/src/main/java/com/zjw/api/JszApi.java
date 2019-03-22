package com.zjw.api;

import com.zjw.po.Jszlist;
import com.zjw.po.Wzlist;

import java.util.List;

public interface JszApi {
    /**
     * api 即注册dubbo服务的接口
     * controller 为消费方
     * service 为接收方
     * @param jname
     * @return
     */
    List<Jszlist> queryJszList(String jname);

    List<Wzlist> queryWzlistBiJid(Integer jid);

    void add(Jszlist jszlist);

    Jszlist findOne(Integer jid);

    void update(Jszlist jszlist);
}
