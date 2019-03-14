package com.baizhi.testmbg.dao.mysql;

import com.baizhi.testmbg.entity.mysql.TimeZone;
import com.baizhi.testmbg.entity.mysql.TimeZoneExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TimeZoneMapper {
    int countByExample(TimeZoneExample example);

    int deleteByExample(TimeZoneExample example);

    int deleteByPrimaryKey(Integer timeZoneId);

    int insert(TimeZone record);

    int insertSelective(TimeZone record);

    List<TimeZone> selectByExample(TimeZoneExample example);

    TimeZone selectByPrimaryKey(Integer timeZoneId);

    int updateByExampleSelective(@Param("record") TimeZone record, @Param("example") TimeZoneExample example);

    int updateByExample(@Param("record") TimeZone record, @Param("example") TimeZoneExample example);

    int updateByPrimaryKeySelective(TimeZone record);

    int updateByPrimaryKey(TimeZone record);
}