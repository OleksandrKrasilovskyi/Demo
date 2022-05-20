package com.example.demo.Task_A;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class TestBean {

    @Bean
    public String name1 (){
        return "Tom";
    }

    @Bean("str2")
    public String name2 (){
        return "John";
    }
}
