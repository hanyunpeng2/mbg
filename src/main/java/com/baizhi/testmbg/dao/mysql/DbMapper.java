package com.baizhi.testmbg.dao.mysql;

import com.baizhi.testmbg.entity.mysql.Db;
import com.baizhi.testmbg.entity.mysql.DbExample;
import com.baizhi.testmbg.entity.mysql.DbKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DbMapper {
    int countByExample(DbExample example);

    int deleteByExample(DbExample example);

    int deleteByPrimaryKey(DbKey key);

    int insert(Db record);

    int insertSelective(Db record);

    List<Db> selectByExample(DbExample example);

    Db selectByPrimaryKey(DbKey key);

    int updateByExampleSelective(@Param("record") Db record, @Param("example") DbExample example);

    int updateByExample(@Param("record") Db record, @Param("example") DbExample example);

    int updateByPrimaryKeySelective(Db record);

    int updateByPrimaryKey(Db record);
}