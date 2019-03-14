package com.baizhi.testmbg.dao.mysql;

import com.baizhi.testmbg.entity.mysql.TimeZoneName;
import com.baizhi.testmbg.entity.mysql.TimeZoneNameExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TimeZoneNameMapper {
    int countByExample(TimeZoneNameExample example);

    int deleteByExample(TimeZoneNameExample example);

    int deleteByPrimaryKey(String name);

    int insert(TimeZoneName record);

    int insertSelective(TimeZoneName record);

    List<TimeZoneName> selectByExample(TimeZoneNameExample example);

    TimeZoneName selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") TimeZoneName record, @Param("example") TimeZoneNameExample example);

    int updateByExample(@Param("record") TimeZoneName record, @Param("example") TimeZoneNameExample example);

    int updateByPrimaryKeySelective(TimeZoneName record);

    int updateByPrimaryKey(TimeZoneName record);
}