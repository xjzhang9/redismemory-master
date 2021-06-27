package com.xjzhang.redismemory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author xjzhang
 * @version 1.0
 * @date 2021/6/27 19:20
 */
@ComponentScan("com.xjzhang")
@SpringBootApplication
public class TestApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class);
    }
}
