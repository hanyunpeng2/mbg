package com.baizhi.testmbg.dao.mysql;

import com.baizhi.testmbg.entity.mysql.HelpKeyword;
import com.baizhi.testmbg.entity.mysql.HelpKeywordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HelpKeywordMapper {
    int countByExample(HelpKeywordExample example);

    int deleteByExample(HelpKeywordExample example);

    int deleteByPrimaryKey(Integer helpKeywordId);

    int insert(HelpKeyword record);

    int insertSelective(HelpKeyword record);

    List<HelpKeyword> selectByExample(HelpKeywordExample example);

    HelpKeyword selectByPrimaryKey(Integer helpKeywordId);

    int updateByExampleSelective(@Param("record") HelpKeyword record, @Param("example") HelpKeywordExample example);

    int updateByExample(@Param("record") HelpKeyword record, @Param("example") HelpKeywordExample example);

    int updateByPrimaryKeySelective(HelpKeyword record);

    int updateByPrimaryKey(HelpKeyword record);
}