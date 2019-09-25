package com.spring.dao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan({"com.spring.dao.*"})
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
//@MapperScan("com")
public class SpringbootDaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDaoApplication.class, args);
    }

}
