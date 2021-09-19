package com.atguigu.guli.service.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author Ninomiya_Mioto
 * Date on 2021/9/19  10:21
 */
@SpringBootApplication
@ComponentScan({"com.atguigu.guli"})//扫描范围扩大
public class ServiceEduApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceEduApplication.class, args);
    }
}
