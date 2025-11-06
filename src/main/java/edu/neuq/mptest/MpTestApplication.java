package edu.neuq.mptest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("edu.neuq.mptest.mapper")
public class MpTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MpTestApplication.class, args);
    }

}
