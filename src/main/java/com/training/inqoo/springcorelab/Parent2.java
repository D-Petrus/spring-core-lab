package com.training.inqoo.springcorelab;

import org.springframework.stereotype.Component;

@Component
public class Parent2 {

    private final MyBean myBean;

    Parent2(MyBean myBean) {this.myBean=myBean;}
}
