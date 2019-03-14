package com.baizhi.dao;

import com.baizhi.entity.event;
import com.baizhi.entity.eventKey;
import com.baizhi.entity.eventWithBLOBs;

public interface eventMapper {
    int deleteByPrimaryKey(eventKey key);

    int insert(eventWithBLOBs record);

    int insertSelective(eventWithBLOBs record);

    eventWithBLOBs selectByPrimaryKey(eventKey key);

    int updateByPrimaryKeySelective(eventWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(eventWithBLOBs record);

    int updateByPrimaryKey(event record);
}