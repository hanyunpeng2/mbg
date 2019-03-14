package com.baizhi.testmbg.dao.mysql;

import com.baizhi.testmbg.entity.mysql.TimeZoneTransition;
import com.baizhi.testmbg.entity.mysql.TimeZoneTransitionExample;
import com.baizhi.testmbg.entity.mysql.TimeZoneTransitionKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TimeZoneTransitionMapper {
    int countByExample(TimeZoneTransitionExample example);

    int deleteByExample(TimeZoneTransitionExample example);

    int deleteByPrimaryKey(TimeZoneTransitionKey key);

    int insert(TimeZoneTransition record);

    int insertSelective(TimeZoneTransition record);

    List<TimeZoneTransition> selectByExample(TimeZoneTransitionExample example);

    TimeZoneTransition selectByPrimaryKey(TimeZoneTransitionKey key);

    int updateByExampleSelective(@Param("record") TimeZoneTransition record, @Param("example") TimeZoneTransitionExample example);

    int updateByExample(@Param("record") TimeZoneTransition record, @Param("example") TimeZoneTransitionExample example);

    int updateByPrimaryKeySelective(TimeZoneTransition record);

    int updateByPrimaryKey(TimeZoneTransition record);
}