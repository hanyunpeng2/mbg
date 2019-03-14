package com.baizhi.testmbg.dao.mysql;

import com.baizhi.testmbg.entity.mysql.ColumnsPriv;
import com.baizhi.testmbg.entity.mysql.ColumnsPrivExample;
import com.baizhi.testmbg.entity.mysql.ColumnsPrivKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ColumnsPrivMapper {
    int countByExample(ColumnsPrivExample example);

    int deleteByExample(ColumnsPrivExample example);

    int deleteByPrimaryKey(ColumnsPrivKey key);

    int insert(ColumnsPriv record);

    int insertSelective(ColumnsPriv record);

    List<ColumnsPriv> selectByExample(ColumnsPrivExample example);

    ColumnsPriv selectByPrimaryKey(ColumnsPrivKey key);

    int updateByExampleSelective(@Param("record") ColumnsPriv record, @Param("example") ColumnsPrivExample example);

    int updateByExample(@Param("record") ColumnsPriv record, @Param("example") ColumnsPrivExample example);

    int updateByPrimaryKeySelective(ColumnsPriv record);

    int updateByPrimaryKey(ColumnsPriv record);
}