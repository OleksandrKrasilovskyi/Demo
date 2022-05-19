package com.example.demo;

import com.example.demo.Task_A.TestBean;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(TestBean.class);
        String str = context.getBean("name1",String.class);
        System.out.println(str);

    }
}
