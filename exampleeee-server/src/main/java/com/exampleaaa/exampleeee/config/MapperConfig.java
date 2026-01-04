package com.exampleaaa.exampleeee.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@MapperScan(value = "com.exampleaaa.exampleeee.dal.dao")
public class MapperConfig {

}
