package com.cristianrita.springbeans.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.cristianrita.springbeans.services"})
public class MyApplicationConfig {
}
