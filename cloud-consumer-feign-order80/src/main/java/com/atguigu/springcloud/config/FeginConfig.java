package com.atguigu.springcloud.config;

import feign.Logger;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeginConfig {

    @Bean
    @LoadBalanced
    public Logger.Level feginLoggerLevel() {
        return Logger.Level.FULL;
    }
}
