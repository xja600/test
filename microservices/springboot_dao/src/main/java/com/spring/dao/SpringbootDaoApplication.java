package com.spring.dao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@MapperScan({"com.spring.dao.*"})
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
//@MapperScan("com")
@ComponentScan(basePackages = { "com.spring.dao","com.slabs"})
@MapperScan({"com.spring.dao.mapper","com.slabs.pushdata.dao"})
public class SpringbootDaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDaoApplication.class, args);
    }

}
