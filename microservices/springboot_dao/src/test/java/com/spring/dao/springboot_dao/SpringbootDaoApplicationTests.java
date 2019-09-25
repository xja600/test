package com.spring.dao.springboot_dao;

import com.spring.dao.test.CodeLibraryServiceImpl2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootDaoApplicationTests {

    @Autowired
    CodeLibraryServiceImpl2 codeLibraryServiceImpl2;
    @Test
    public void getCodeNameByCodeNoAndItemNo() {
//        codeLibraryServiceImpl2.queryCode("ApplyChannel","00");
        codeLibraryServiceImpl2.getCodeNameByCodeNoAndItemNo("ApplyChannel","00");
    }

}
