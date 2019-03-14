package com.baizhi.testmbg.dao.mysql;

import com.baizhi.testmbg.entity.mysql.Proc;
import com.baizhi.testmbg.entity.mysql.ProcExample;
import com.baizhi.testmbg.entity.mysql.ProcKey;
import com.baizhi.testmbg.entity.mysql.ProcWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProcMapper {
    int countByExample(ProcExample example);

    int deleteByExample(ProcExample example);

    int deleteByPrimaryKey(ProcKey key);

    int insert(ProcWithBLOBs record);

    int insertSelective(ProcWithBLOBs record);

    List<ProcWithBLOBs> selectByExampleWithBLOBs(ProcExample example);

    List<Proc> selectByExample(ProcExample example);

    ProcWithBLOBs selectByPrimaryKey(ProcKey key);

    int updateByExampleSelective(@Param("record") ProcWithBLOBs record, @Param("example") ProcExample example);

    int updateByExampleWithBLOBs(@Param("record") ProcWithBLOBs record, @Param("example") ProcExample example);

    int updateByExample(@Param("record") Proc record, @Param("example") ProcExample example);

    int updateByPrimaryKeySelective(ProcWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ProcWithBLOBs record);

    int updateByPrimaryKey(Proc record);
}