package com.baizhi.testmbg.dao.mysql;

import com.baizhi.testmbg.entity.mysql.TimeZoneTransitionType;
import com.baizhi.testmbg.entity.mysql.TimeZoneTransitionTypeExample;
import com.baizhi.testmbg.entity.mysql.TimeZoneTransitionTypeKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TimeZoneTransitionTypeMapper {
    int countByExample(TimeZoneTransitionTypeExample example);

    int deleteByExample(TimeZoneTransitionTypeExample example);

    int deleteByPrimaryKey(TimeZoneTransitionTypeKey key);

    int insert(TimeZoneTransitionType record);

    int insertSelective(TimeZoneTransitionType record);

    List<TimeZoneTransitionType> selectByExample(TimeZoneTransitionTypeExample example);

    TimeZoneTransitionType selectByPrimaryKey(TimeZoneTransitionTypeKey key);

    int updateByExampleSelective(@Param("record") TimeZoneTransitionType record, @Param("example") TimeZoneTransitionTypeExample example);

    int updateByExample(@Param("record") TimeZoneTransitionType record, @Param("example") TimeZoneTransitionTypeExample example);

    int updateByPrimaryKeySelective(TimeZoneTransitionType record);

    int updateByPrimaryKey(TimeZoneTransitionType record);
}