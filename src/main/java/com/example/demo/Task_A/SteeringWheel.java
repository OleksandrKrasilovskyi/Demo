package com.example.demo.Task_A;

import org.springframework.stereotype.Component;

@Component
public class SteeringWheel implements CreateBigBike {
    @Override
    public void createBigBike() {
        System.out.println("It's steering wheel");
    }
}
