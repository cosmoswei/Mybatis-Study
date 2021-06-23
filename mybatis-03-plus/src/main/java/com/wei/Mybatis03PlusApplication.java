package com.wei;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.wei.mapper")
@SpringBootApplication
public class Mybatis03PlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(Mybatis03PlusApplication.class, args);
    }

}
