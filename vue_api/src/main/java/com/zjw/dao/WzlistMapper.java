package com.zjw.dao;

import com.zjw.po.Wzlist;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WzlistMapper {
    int deleteByPrimaryKey(Integer wid);

    int insert(Wzlist record);

    int insertSelective(Wzlist record);

    List<Wzlist> selectByPrimaryKey(Integer jid);

    int updateByPrimaryKeySelective(Wzlist record);

    int updateByPrimaryKey(Wzlist record);

    List<Wzlist> queryList(@Param("jid") Integer jid, @Param("jname") String jname);
}