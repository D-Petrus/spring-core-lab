package com.training.inqoo.springcorelab;

import org.springframework.stereotype.Component;

@Component
public class BeanIntFirst {
    int[] myFirstArray = {1, 2, 3, 4, 5, 6};


    public void takeAllIntFromFirstArray() {
        for (int i = 0; i < myFirstArray.length; i++) {
            System.out.println(myFirstArray[i] + " ");
        }

    }
}
