package com.baizhi.testmbg.dao.mysql;

import com.baizhi.testmbg.entity.mysql.HelpRelationExample;
import com.baizhi.testmbg.entity.mysql.HelpRelationKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HelpRelationMapper {
    int countByExample(HelpRelationExample example);

    int deleteByExample(HelpRelationExample example);

    int deleteByPrimaryKey(HelpRelationKey key);

    int insert(HelpRelationKey record);

    int insertSelective(HelpRelationKey record);

    List<HelpRelationKey> selectByExample(HelpRelationExample example);

    int updateByExampleSelective(@Param("record") HelpRelationKey record, @Param("example") HelpRelationExample example);

    int updateByExample(@Param("record") HelpRelationKey record, @Param("example") HelpRelationExample example);
}