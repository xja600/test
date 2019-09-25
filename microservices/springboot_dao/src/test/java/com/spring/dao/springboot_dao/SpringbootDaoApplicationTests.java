package com.spring.dao.springboot_dao;

import com.spring.dao.test.CodeLibraryServiceImpl2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static java.lang.Thread.sleep;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootDaoApplicationTests {

    Logger logger = LoggerFactory.getLogger(SpringbootDaoApplicationTests.class);

    @Autowired
    CodeLibraryServiceImpl2 codeLibraryServiceImpl2;

    @Autowired
    RedisTemplate<String, Object> redisTemplate;


    @Test
    public void getCodeNameByCodeNoAndItemNo() {
        try{
            //        codeLibraryServiceImpl2.queryCode("ApplyChannel","00");
            codeLibraryServiceImpl2.getCodeNameByCodeNoAndItemNo("ApplyChannel","00");
            Thread.sleep( 1000);
            codeLibraryServiceImpl2.getCodeNameByCodeNoAndItemNo("ApplyChannel","00");
            Thread.sleep( 5000);
            codeLibraryServiceImpl2.getCodeNameByCodeNoAndItemNo("ApplyChannel","00");
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    /**
     * 功能描述: <br> 测试下Redis是否集成功。
     * 参考 ：https://blog.csdn.net/guijiaoba/article/details/78574600
     * @Param:
     * @Return:
     * @Author: MG01972
     * @Date: 2019-09-25 16:54:17
     */
    @Test
    public void redisTest(){
        redisTemplate.opsForValue().set("hello", "world");
        String value = (String)redisTemplate.opsForValue().get("hello");
        logger.info("value1="+value);

        redisTemplate.delete("hello");

        value = (String)redisTemplate.opsForValue().get("hello");
        logger.info("value2="+value);
    }
}
