package com.baizhi.testmbg.dao.mysql;

import com.baizhi.testmbg.entity.mysql.Func;
import com.baizhi.testmbg.entity.mysql.FuncExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FuncMapper {
    int countByExample(FuncExample example);

    int deleteByExample(FuncExample example);

    int deleteByPrimaryKey(String name);

    int insert(Func record);

    int insertSelective(Func record);

    List<Func> selectByExample(FuncExample example);

    Func selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") Func record, @Param("example") FuncExample example);

    int updateByExample(@Param("record") Func record, @Param("example") FuncExample example);

    int updateByPrimaryKeySelective(Func record);

    int updateByPrimaryKey(Func record);
}