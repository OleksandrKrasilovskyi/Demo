package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class DemoApplication {
    @Autowired
    @Qualifier("name1")
    private String nameTom;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

    }

    @EventListener(ContextRefreshedEvent.class)
    public void bigBikeMethod() {

        System.out.println(nameTom);
    }
}
