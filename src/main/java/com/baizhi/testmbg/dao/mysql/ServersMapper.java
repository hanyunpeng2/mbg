package com.baizhi.testmbg.dao.mysql;

import com.baizhi.testmbg.entity.mysql.Servers;
import com.baizhi.testmbg.entity.mysql.ServersExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ServersMapper {
    int countByExample(ServersExample example);

    int deleteByExample(ServersExample example);

    int deleteByPrimaryKey(String serverName);

    int insert(Servers record);

    int insertSelective(Servers record);

    List<Servers> selectByExample(ServersExample example);

    Servers selectByPrimaryKey(String serverName);

    int updateByExampleSelective(@Param("record") Servers record, @Param("example") ServersExample example);

    int updateByExample(@Param("record") Servers record, @Param("example") ServersExample example);

    int updateByPrimaryKeySelective(Servers record);

    int updateByPrimaryKey(Servers record);
}