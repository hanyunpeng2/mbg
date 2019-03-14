package com.baizhi.testmbg.dao.mysql;

import com.baizhi.testmbg.entity.mysql.GeneralLog;
import com.baizhi.testmbg.entity.mysql.GeneralLogExample;
import com.baizhi.testmbg.entity.mysql.GeneralLogWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GeneralLogMapper {
    int countByExample(GeneralLogExample example);

    int deleteByExample(GeneralLogExample example);

    int insert(GeneralLogWithBLOBs record);

    int insertSelective(GeneralLogWithBLOBs record);

    List<GeneralLogWithBLOBs> selectByExampleWithBLOBs(GeneralLogExample example);

    List<GeneralLog> selectByExample(GeneralLogExample example);

    int updateByExampleSelective(@Param("record") GeneralLogWithBLOBs record, @Param("example") GeneralLogExample example);

    int updateByExampleWithBLOBs(@Param("record") GeneralLogWithBLOBs record, @Param("example") GeneralLogExample example);

    int updateByExample(@Param("record") GeneralLog record, @Param("example") GeneralLogExample example);
}