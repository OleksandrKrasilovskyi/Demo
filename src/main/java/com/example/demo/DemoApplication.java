package com.example.demo;

import com.example.demo.Task_A.BigBike;
import com.example.demo.Task_A.BigBikeWithListInjected;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class DemoApplication {

    @Autowired
    private BigBikeWithListInjected bike;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @EventListener(ContextRefreshedEvent.class)
    public void bigBikeMethod() {
        bike.showBikeComponents();
    }
}
