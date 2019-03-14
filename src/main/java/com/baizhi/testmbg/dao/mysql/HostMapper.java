package com.baizhi.testmbg.dao.mysql;

import com.baizhi.testmbg.entity.mysql.Host;
import com.baizhi.testmbg.entity.mysql.HostExample;
import com.baizhi.testmbg.entity.mysql.HostKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HostMapper {
    int countByExample(HostExample example);

    int deleteByExample(HostExample example);

    int deleteByPrimaryKey(HostKey key);

    int insert(Host record);

    int insertSelective(Host record);

    List<Host> selectByExample(HostExample example);

    Host selectByPrimaryKey(HostKey key);

    int updateByExampleSelective(@Param("record") Host record, @Param("example") HostExample example);

    int updateByExample(@Param("record") Host record, @Param("example") HostExample example);

    int updateByPrimaryKeySelective(Host record);

    int updateByPrimaryKey(Host record);
}