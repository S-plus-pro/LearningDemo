package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//@Configuration 和SpringBootConfiguration用哪个都行
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced //通过注册中心获得服务列表，远程调用，采用负载均衡
    public RestTemplate getRestTemplate() {

        return new RestTemplate();
    }
}
