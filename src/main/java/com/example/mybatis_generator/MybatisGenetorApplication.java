package com.example.mybatis_generator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.example.mybatis_generator.dao.mapper")
public class MybatisGenetorApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisGenetorApplication.class, args);
    }

}
