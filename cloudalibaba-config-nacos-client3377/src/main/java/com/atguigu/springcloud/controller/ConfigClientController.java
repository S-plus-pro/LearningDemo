package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope   //通过SpringCould原生注解@RefreshScope实现配置自动更新
public class ConfigClientController {
    @Value("${config.info}")//从nacos配置中心获取配置信息
    private String configInfo;


    @GetMapping("/config/info")
    public String getConfigInfo(){
        return configInfo;
    }

}
