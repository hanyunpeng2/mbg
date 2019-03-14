package com.baizhi.testmbg.dao.mysql;

import com.baizhi.testmbg.entity.mysql.TimeZoneLeapSecond;
import com.baizhi.testmbg.entity.mysql.TimeZoneLeapSecondExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TimeZoneLeapSecondMapper {
    int countByExample(TimeZoneLeapSecondExample example);

    int deleteByExample(TimeZoneLeapSecondExample example);

    int deleteByPrimaryKey(Long transitionTime);

    int insert(TimeZoneLeapSecond record);

    int insertSelective(TimeZoneLeapSecond record);

    List<TimeZoneLeapSecond> selectByExample(TimeZoneLeapSecondExample example);

    TimeZoneLeapSecond selectByPrimaryKey(Long transitionTime);

    int updateByExampleSelective(@Param("record") TimeZoneLeapSecond record, @Param("example") TimeZoneLeapSecondExample example);

    int updateByExample(@Param("record") TimeZoneLeapSecond record, @Param("example") TimeZoneLeapSecondExample example);

    int updateByPrimaryKeySelective(TimeZoneLeapSecond record);

    int updateByPrimaryKey(TimeZoneLeapSecond record);
}