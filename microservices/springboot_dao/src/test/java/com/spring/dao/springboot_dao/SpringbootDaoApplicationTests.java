package com.spring.dao.springboot_dao;

import com.slabs.pushdata.PushdataApplication;
import com.slabs.pushdata.service.SLAssetInfoService2;
import com.spring.dao.test.CodeLibraryServiceImpl2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootDaoApplicationTests {

    Logger logger = LoggerFactory.getLogger(SpringbootDaoApplicationTests.class);

    @Autowired
    CodeLibraryServiceImpl2 codeLibraryServiceImpl2;

    @Autowired
    RedisTemplate<String, Object> redisTemplate;
//    @Autowired
//    SLAssetInfoService2 assetInfoService2;

    @Test
    public void getCodeNameByCodeNoAndItemNo() {
        try{
            //        codeLibraryServiceImpl2.queryCode("ApplyChannel","00");
           String name1 = codeLibraryServiceImpl2.getCodeNameByCodeNoAndItemNo("ApplyChannel","00");
            Thread.sleep( 1000);
            //@Cacheable(key ="'name'+#p0+#p1")
//            String redisTemplateStr = (String)redisTemplate.opsForValue().get("nameApplyChannel00");
//            String redisTemplateStr = (String)redisTemplate.opsForValue().get("myCache::userName");
            String redisTemplateStr = (String)redisTemplate.opsForValue().get("userName");
            logger.info("redisTemplateStr =【{}】",redisTemplateStr);
            String name2 = codeLibraryServiceImpl2.getCodeNameByCodeNoAndItemNo("ApplyChannel","00");
//            Thread.sleep( 5000);
           String name3 =  codeLibraryServiceImpl2.getCodeNameByCodeNoAndItemNo("ApplyChannel","00");
            logger.info("name1 = {},name2 = {},name3 = {}"+name1,name2,name3);


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

    @Test
    public void test2(){
        try {
//            assetInfoService2.pushDataToBIByStatus("02");
//            SpringApplication.run(PushdataApplication.class, args);
//            PushdataApplication.main();
//            PushdataApplicationTests
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
