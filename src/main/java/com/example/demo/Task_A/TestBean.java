package com.example.demo.Task_A;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class TestBean {

    @Bean("name1")
    public String name1 (){
        return "Tom";
    }

    @Bean("name2")
    @Primary
    public String name2 (){
        return "John";
    }
}
