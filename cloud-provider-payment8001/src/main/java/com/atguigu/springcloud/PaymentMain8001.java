package com.atguigu.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("com.atguigu.springcloud.dao")
@EnableEurekaClient
public class PaymentMain8001 {
    public static void main(String[] agrs) {

        SpringApplication.run(PaymentMain8001.class, agrs);
    }
}
