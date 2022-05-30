package com.example.config;

import com.example.Bean.Vechile;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    Vechile vechile(){
        var vh=new Vechile();
        vh.setName("Audi 8");
        return vh;
    }

    @Bean
    String hello(){
        return "hello world";
    }

    @Bean
    Integer number(){
        return 16;
    }
}
