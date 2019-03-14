package com.baizhi.testmbg.dao.mysql;

import com.baizhi.testmbg.entity.mysql.HelpTopic;
import com.baizhi.testmbg.entity.mysql.HelpTopicExample;
import com.baizhi.testmbg.entity.mysql.HelpTopicWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HelpTopicMapper {
    int countByExample(HelpTopicExample example);

    int deleteByExample(HelpTopicExample example);

    int deleteByPrimaryKey(Integer helpTopicId);

    int insert(HelpTopicWithBLOBs record);

    int insertSelective(HelpTopicWithBLOBs record);

    List<HelpTopicWithBLOBs> selectByExampleWithBLOBs(HelpTopicExample example);

    List<HelpTopic> selectByExample(HelpTopicExample example);

    HelpTopicWithBLOBs selectByPrimaryKey(Integer helpTopicId);

    int updateByExampleSelective(@Param("record") HelpTopicWithBLOBs record, @Param("example") HelpTopicExample example);

    int updateByExampleWithBLOBs(@Param("record") HelpTopicWithBLOBs record, @Param("example") HelpTopicExample example);

    int updateByExample(@Param("record") HelpTopic record, @Param("example") HelpTopicExample example);

    int updateByPrimaryKeySelective(HelpTopicWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HelpTopicWithBLOBs record);

    int updateByPrimaryKey(HelpTopic record);
}