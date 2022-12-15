package com.atguigu.springcloud;

import com.atguigu.springcloud.config.FeginConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = FeginConfig.class)
public class OrderFeginMain80 {
    public static void main(String[] args) {

        SpringApplication.run(OrderFeginMain80.class, args);
    }
}
