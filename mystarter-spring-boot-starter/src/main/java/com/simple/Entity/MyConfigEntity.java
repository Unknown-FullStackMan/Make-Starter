package com.simple.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;


/**
 * @author Simple
 * @data 2021/3/30 19:38
 */


@ConfigurationProperties(prefix = "my.com")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MyConfigEntity {
    private String name;
    private String age;

}
