package com.jc.fanshe.demo4;

public class SuperMan implements Human{


    @Override
    public String getBelief() {
        return "I believe i can fly";
    }

    @Override
    public void eat(String food,String fruit) {
        System.out.println("≥¨»À≥‘"+food+fruit);
    }
}