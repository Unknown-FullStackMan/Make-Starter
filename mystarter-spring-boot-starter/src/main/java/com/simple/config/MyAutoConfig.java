package com.simple.config;


import com.simple.Entity.MyConfigEntity;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Simple
 * @data 2021/3/30 19:37
 */

@Configuration
@EnableConfigurationProperties(MyConfigEntity.class)
public class MyAutoConfig {

    @Bean
    public MyConfigEntity myConfigEntity () {
        return new MyConfigEntity();
    }



}
