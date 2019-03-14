package com.baizhi.mbg;

import com.baizhi.testmbg.dao.mysql.FuncMapper;
import com.baizhi.testmbg.entity.mysql.Func;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MbgApplicationTests {

    @Autowired
    private FuncMapper funcMapper;

    @Test
    public void contextLoads() {
        Func func = funcMapper.selectByPrimaryKey("1");
        System.out.println(func);
    }

}
