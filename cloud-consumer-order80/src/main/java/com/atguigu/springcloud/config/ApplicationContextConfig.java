package com.atguigu.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//spring的远程服务调用工具 RestTemplate
@Configuration
public class ApplicationContextConfig {
    //注入bean,后面才能去使用 @Resource 使用
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
