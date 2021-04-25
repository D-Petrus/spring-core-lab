package com.training.inqoo.springcorelab;

import org.springframework.stereotype.Component;

@Component
public class Customer {
    private BeanIntFirst beanIntFirst;
    private BeanIntSecond beanIntSecond;

    public Customer(BeanIntFirst beanIntFirst, BeanIntSecond beanIntSecond){
        this.beanIntFirst= beanIntFirst;
        this.beanIntSecond= beanIntSecond;
    }
    public void takeAllIntFromFirstArray(){
        beanIntFirst.takeAllIntFromFirstArray();
    }
    public void takeAllIntFromSecondArray(){
        beanIntSecond.takeAllIntFromSecondArray();
    }
}
