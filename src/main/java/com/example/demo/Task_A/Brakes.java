package com.example.demo.Task_A;

import org.springframework.stereotype.Component;

@Component
public class Brakes implements CreateBigBike {
    @Override
    public void createBigBike() {
        System.out.println("It's brakes");
    }
}
