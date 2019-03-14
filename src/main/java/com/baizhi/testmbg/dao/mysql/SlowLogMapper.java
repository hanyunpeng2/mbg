package com.baizhi.testmbg.dao.mysql;

import com.baizhi.testmbg.entity.mysql.SlowLog;
import com.baizhi.testmbg.entity.mysql.SlowLogExample;
import com.baizhi.testmbg.entity.mysql.SlowLogWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SlowLogMapper {
    int countByExample(SlowLogExample example);

    int deleteByExample(SlowLogExample example);

    int insert(SlowLogWithBLOBs record);

    int insertSelective(SlowLogWithBLOBs record);

    List<SlowLogWithBLOBs> selectByExampleWithBLOBs(SlowLogExample example);

    List<SlowLog> selectByExample(SlowLogExample example);

    int updateByExampleSelective(@Param("record") SlowLogWithBLOBs record, @Param("example") SlowLogExample example);

    int updateByExampleWithBLOBs(@Param("record") SlowLogWithBLOBs record, @Param("example") SlowLogExample example);

    int updateByExample(@Param("record") SlowLog record, @Param("example") SlowLogExample example);
}