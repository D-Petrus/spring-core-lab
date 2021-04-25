package com.training.inqoo.springcorelab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class Parent1 {
    @Autowired
    private final MyBean myBean;

    Parent1(MyBean myBean) {
        this.myBean = myBean;
    }
}
