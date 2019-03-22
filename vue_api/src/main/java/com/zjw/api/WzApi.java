package com.zjw.api;

import com.zjw.po.Wzlist;

import java.util.List;

public interface WzApi {
    List<Wzlist> queryWzlistBiJid(Integer jid, String jname);
}
