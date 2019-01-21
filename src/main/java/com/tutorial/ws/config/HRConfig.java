package com.tutorial.ws.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;

/**
 * WS Configuration class
 */
@Configuration
@EnableWs
@ComponentScan("com.tutorial.ws")
public class HRConfig {

    @Bean
    public SimpleWsdl11Definition holiday(){
        SimpleWsdl11Definition definition = new SimpleWsdl11Definition();
        definition.setWsdl(new ClassPathResource("hr.wsdl"));
        return definition;
    }
}
