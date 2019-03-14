package com.baizhi.testmbg.dao.mysql;

import com.baizhi.testmbg.entity.mysql.ProxiesPriv;
import com.baizhi.testmbg.entity.mysql.ProxiesPrivExample;
import com.baizhi.testmbg.entity.mysql.ProxiesPrivKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProxiesPrivMapper {
    int countByExample(ProxiesPrivExample example);

    int deleteByExample(ProxiesPrivExample example);

    int deleteByPrimaryKey(ProxiesPrivKey key);

    int insert(ProxiesPriv record);

    int insertSelective(ProxiesPriv record);

    List<ProxiesPriv> selectByExample(ProxiesPrivExample example);

    ProxiesPriv selectByPrimaryKey(ProxiesPrivKey key);

    int updateByExampleSelective(@Param("record") ProxiesPriv record, @Param("example") ProxiesPrivExample example);

    int updateByExample(@Param("record") ProxiesPriv record, @Param("example") ProxiesPrivExample example);

    int updateByPrimaryKeySelective(ProxiesPriv record);

    int updateByPrimaryKey(ProxiesPriv record);
}