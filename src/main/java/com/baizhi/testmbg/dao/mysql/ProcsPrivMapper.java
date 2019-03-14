package com.baizhi.testmbg.dao.mysql;

import com.baizhi.testmbg.entity.mysql.ProcsPriv;
import com.baizhi.testmbg.entity.mysql.ProcsPrivExample;
import com.baizhi.testmbg.entity.mysql.ProcsPrivKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProcsPrivMapper {
    int countByExample(ProcsPrivExample example);

    int deleteByExample(ProcsPrivExample example);

    int deleteByPrimaryKey(ProcsPrivKey key);

    int insert(ProcsPriv record);

    int insertSelective(ProcsPriv record);

    List<ProcsPriv> selectByExample(ProcsPrivExample example);

    ProcsPriv selectByPrimaryKey(ProcsPrivKey key);

    int updateByExampleSelective(@Param("record") ProcsPriv record, @Param("example") ProcsPrivExample example);

    int updateByExample(@Param("record") ProcsPriv record, @Param("example") ProcsPrivExample example);

    int updateByPrimaryKeySelective(ProcsPriv record);

    int updateByPrimaryKey(ProcsPriv record);
}