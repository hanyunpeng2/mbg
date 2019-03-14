package com.baizhi.testmbg.dao.mysql;

import com.baizhi.testmbg.entity.mysql.NdbBinlogIndex;
import com.baizhi.testmbg.entity.mysql.NdbBinlogIndexExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NdbBinlogIndexMapper {
    int countByExample(NdbBinlogIndexExample example);

    int deleteByExample(NdbBinlogIndexExample example);

    int deleteByPrimaryKey(Long epoch);

    int insert(NdbBinlogIndex record);

    int insertSelective(NdbBinlogIndex record);

    List<NdbBinlogIndex> selectByExample(NdbBinlogIndexExample example);

    NdbBinlogIndex selectByPrimaryKey(Long epoch);

    int updateByExampleSelective(@Param("record") NdbBinlogIndex record, @Param("example") NdbBinlogIndexExample example);

    int updateByExample(@Param("record") NdbBinlogIndex record, @Param("example") NdbBinlogIndexExample example);

    int updateByPrimaryKeySelective(NdbBinlogIndex record);

    int updateByPrimaryKey(NdbBinlogIndex record);
}