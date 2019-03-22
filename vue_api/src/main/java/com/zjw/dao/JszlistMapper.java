package com.zjw.dao;

import com.zjw.po.Jszlist;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JszlistMapper {
    int deleteByPrimaryKey(Integer jid);

    int insert(Jszlist record);

    int insertSelective(Jszlist record);

    Jszlist selectByPrimaryKey(Integer jid);

    int updateByPrimaryKeySelective(Jszlist record);

    int updateByPrimaryKey(Jszlist record);

    List<Jszlist> selectqueryList(@Param("jname") String jname);
}