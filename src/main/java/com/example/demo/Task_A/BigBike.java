package com.example.demo.Task_A;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class BigBike {
     private Brakes brakes;
     private Frame frame;
     private Pedal pedal;
     private SteeringWheel steeringWheel;
     private Transmission transmission;
     private Wheel wheel;

    public void showBikeComponents() {

        brakes.createBigBike();
        frame.createBigBike();
        pedal.createBigBike();
        steeringWheel.createBigBike();
        transmission.createBigBike();
        wheel.createBigBike();
    }
}
