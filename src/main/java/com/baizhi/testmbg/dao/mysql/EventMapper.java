package com.baizhi.testmbg.dao.mysql;

import com.baizhi.testmbg.entity.mysql.Event;
import com.baizhi.testmbg.entity.mysql.EventExample;
import com.baizhi.testmbg.entity.mysql.EventKey;
import com.baizhi.testmbg.entity.mysql.EventWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EventMapper {
    int countByExample(EventExample example);

    int deleteByExample(EventExample example);

    int deleteByPrimaryKey(EventKey key);

    int insert(EventWithBLOBs record);

    int insertSelective(EventWithBLOBs record);

    List<EventWithBLOBs> selectByExampleWithBLOBs(EventExample example);

    List<Event> selectByExample(EventExample example);

    EventWithBLOBs selectByPrimaryKey(EventKey key);

    int updateByExampleSelective(@Param("record") EventWithBLOBs record, @Param("example") EventExample example);

    int updateByExampleWithBLOBs(@Param("record") EventWithBLOBs record, @Param("example") EventExample example);

    int updateByExample(@Param("record") Event record, @Param("example") EventExample example);

    int updateByPrimaryKeySelective(EventWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(EventWithBLOBs record);

    int updateByPrimaryKey(Event record);
}