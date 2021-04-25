package com.training.inqoo.springcorelab;

public class BeanIntSecond {
    int[] mySecondArray = {1, 2, 3, 4, 5, 6};


    public void takeAllIntFromSecondArray() {
        for (int i = 0; i < mySecondArray.length; i++) {
            System.out.println(mySecondArray[i] + " ");
        }

    }
}
