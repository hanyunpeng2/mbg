package com.baizhi.dao;

import com.baizhi.entity.db;
import com.baizhi.entity.dbKey;

public interface dbMapper {
    int deleteByPrimaryKey(dbKey key);

    int insert(db record);

    int insertSelective(db record);

    db selectByPrimaryKey(dbKey key);

    int updateByPrimaryKeySelective(db record);

    int updateByPrimaryKey(db record);
}