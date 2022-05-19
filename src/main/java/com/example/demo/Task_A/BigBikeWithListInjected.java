package com.example.demo.Task_A;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class BigBikeWithListInjected {

    private List<CreateBigBike> list;
    public void showBikeComponents() {

        list.forEach(CreateBigBike::createBigBike);
    }
}
