package com.training.inqoo.springcorelab;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class SecondBean {
    void callOtherBean(){
        System.out.println("Hello Bean");
    }
}
