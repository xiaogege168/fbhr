package com.fubang.limao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

@MapperScan("com.fubang.limao.mapper")
public class LimaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LimaoApplication.class, args);
    }

}
