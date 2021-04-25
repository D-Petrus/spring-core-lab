package com.training.inqoo.springcorelab;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class MyBean {

    @PostConstruct
    void postconstruct() {
        System.out.println("bean created");
    }

    @PreDestroy
    void predestroy(){
        System.out.println( "bean are destroyed");
    }
}
