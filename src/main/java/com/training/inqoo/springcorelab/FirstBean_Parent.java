package com.training.inqoo.springcorelab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

class FirstBean_Parent {

    private SecondBean bean;
    private ThirdBean thirdBean;

    public FirstBean_Parent(SecondBean bean, ThirdBean thirdBean) {
        this.bean = bean;
        this.thirdBean = thirdBean;
        //bean.callOtherBean();
        //thirdBean.callThirdBean();
    }

    public void callOtherBean() {
        bean.callOtherBean();
    }

    public void callThirdBean() {
        thirdBean.callThirdBean();
    }
}

