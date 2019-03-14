package com.baizhi.testmbg.dao.mysql;

import com.baizhi.testmbg.entity.mysql.TablesPriv;
import com.baizhi.testmbg.entity.mysql.TablesPrivExample;
import com.baizhi.testmbg.entity.mysql.TablesPrivKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TablesPrivMapper {
    int countByExample(TablesPrivExample example);

    int deleteByExample(TablesPrivExample example);

    int deleteByPrimaryKey(TablesPrivKey key);

    int insert(TablesPriv record);

    int insertSelective(TablesPriv record);

    List<TablesPriv> selectByExample(TablesPrivExample example);

    TablesPriv selectByPrimaryKey(TablesPrivKey key);

    int updateByExampleSelective(@Param("record") TablesPriv record, @Param("example") TablesPrivExample example);

    int updateByExample(@Param("record") TablesPriv record, @Param("example") TablesPrivExample example);

    int updateByPrimaryKeySelective(TablesPriv record);

    int updateByPrimaryKey(TablesPriv record);
}